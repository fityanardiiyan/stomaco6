package android.example.stomaco;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.res.AssetManager;
import android.example.stomaco.Adapter.ChatMessageAdapter;
import android.example.stomaco.Model.ChatMessage;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.DexterError;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.PermissionRequestErrorListener;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import org.alicebot.ab.AIMLProcessor;
import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.MagicStrings;
import org.alicebot.ab.PCAIMLProcessorExtension;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class chatbot extends AppCompatActivity {

    private Bot bot;
    public static Chat chat;
    ListView listView;
    FloatingActionButton btnSend;
    EditText editTextMsg;
    ImageView imageView;


    private ChatMessageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        listView = findViewById(R.id.listView);
        btnSend = findViewById(R.id.btnSend);
        editTextMsg = findViewById(R.id.editTextMsg);
        imageView = findViewById(R.id.imageView);

        adapter = new ChatMessageAdapter(this, new ArrayList<ChatMessage>());
        listView.setAdapter(adapter);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                String message = editTextMsg.getText().toString();
                String response = chat.multisentenceRespond(editTextMsg.getText().toString());

                if (TextUtils.isEmpty(message)) {
                    Toast.makeText(chatbot.this, "Masukkan Keyword", Toast.LENGTH_SHORT).show();
                    return;
                }
                sendMessage(message);
                botsReply(response);
                //clear edit text
                editTextMsg.setText("");
                listView.setSelection(adapter.getCount() - 1);
            }});

        Dexter.withActivity(this)
                .withPermissions(
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE
                ).withListener(new MultiplePermissionsListener() {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport report) {
                if (report.areAllPermissionsGranted()) {
                    custom();
                    Toast.makeText(chatbot.this, "Izin Diperbolehkan", Toast.LENGTH_SHORT).show();
                }
                if (report.isAnyPermissionPermanentlyDenied()) {
                    Toast.makeText(chatbot.this, "Aktifkan Semua Perizinan", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken
                    token) {
                token.continuePermissionRequest();
            }
        }).withErrorListener(new PermissionRequestErrorListener() {
            @Override
            public void onError(DexterError error) {
                Toast.makeText(chatbot.this, "" + error, Toast.LENGTH_SHORT).show();
            }
        }).onSameThread().check();
    }
        private void custom() {
            boolean available  = isSDCartAvailable();
            AssetManager assets = getResources().getAssets();
            File fileName = new File(Environment.getExternalStorageDirectory().toString() + "/lambung/bots/lambung");

            boolean makeFile = fileName.mkdirs();

            if (fileName.exists()){
                //read
                try {
                    for (String dir : assets.list("lambung")){
                        File subDir = new File(fileName.getPath() + "/" + dir);
                        boolean subDir_Check = subDir.mkdirs();


                        for (String file : assets.list("lambung/" + dir)){
                            File newFile  = new File(fileName.getPath() + "/" + dir + "/" + file);

                            if (newFile.exists()){
                                continue;
                            }

                            InputStream in;
                            OutputStream out;
                            String str;
                            in = assets.open("lambung/"+ dir +"/" + file);
                            out = new FileOutputStream(fileName.getPath() + "/" + dir + "/" + file );

                            //copy files from assest to mobiles secondary memory or sd card
                            copyFile(in,out);
                            in.close();
                            out.flush();
                            out.close();
                        }

                    }


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            //get the vooking directory
            MagicStrings.root_path = Environment.getExternalStorageDirectory().toString() + "/lambung";
            AIMLProcessor.extension = new PCAIMLProcessorExtension();

            bot = new Bot("lambung", MagicStrings.root_path,"chat");
            chat  = new Chat(bot);
        }
    private void botsReply(String response) {
        ChatMessage chatMessage = new ChatMessage(false,false,response);
        adapter.add(chatMessage);
    }

    private void sendMessage(String message) {
        ChatMessage chatMessage = new ChatMessage(false,true,message);
        adapter.add(chatMessage);
    }
    private void copyFile(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int read;

        while ((read = in.read(buffer))!=1) {
            out.write(buffer,0,read);
        }
    }
    public static boolean isSDCartAvailable() {
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)? true : false;
    }


}




