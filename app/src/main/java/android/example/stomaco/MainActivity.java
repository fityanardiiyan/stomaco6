package android.example.stomaco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class MainActivity extends AppCompatActivity {




    BottomNavigationView bottomNavigationView;


    /**private DatabaseReference database;
    private EditText namaBio,tglBio,alamatBio,penyakitBio;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Firebase-----------------------------------------------------

        // Write a message to the database
 /**       database = FirebaseDatabase.getInstance().getReference(); */
        // Firebase-----------------------------------------------------
/**
        namaBio     = findViewById(R.id.namaBio);
        tglBio      = findViewById(R.id.tglBio);

        alamatBio   = findViewById(R.id.alamatBio);

        penyakitBio       = findViewById(R.id.penyakitBio);

        findViewById(R.id.btn_biodata).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            String Snama     = namaBio.getText().toString();
            String Stgl      = tglBio.getText().toString();
            String  Salamat     = alamatBio.getText().toString();
            String Spenyakit    = penyakitBio.getText().toString();
            submitUser(new Biodata(
                    Snama.toLowerCase(),
                        Stgl.toLowerCase(),
                                Salamat.toLowerCase(),
                                Spenyakit.toLowerCase()
                                ));}}

);*/

        bottomNavigationView = findViewById(R.id.buttonNav);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new HomeFragment()).commit();
        }


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = null;

                switch (menuItem.getItemId()){
                    case R.id.home:
                        fragment = new HomeFragment();
                    break;
                    case R.id.about:
                        fragment = new AboutFragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
                return true;
            }
        });}
/**
    private void submitUser(Biodata biodata) {
        database.child("Biodata")
                .push()
                .setValue(biodata)
                .addOnSuccessListener(this, new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        namaBio.setText("");
                        tglBio.setText("");
                        alamatBio.setText("");
                        penyakitBio.setText("");


                        Toast.makeText(MainActivity.this, "Berhasil mengubah data", Toast.LENGTH_SHORT).show();

                    }});

    }
 */


    public void launchArtikel(View view) {
        Intent intent = new Intent(this, Artikel.class);
        startActivity(intent);
    }

    public void launchBiodata(View view) {
        Intent intent = new Intent(this, Biodata.class);
        startActivity(intent);
    }

    public void launchKonsultasi(View view) {
        Intent intent = new Intent(this, Konsultasi.class);
        startActivity(intent);
    }

    public void launchChatbot(View view) {
        Intent intent = new Intent(this, chatbot.class);
        startActivity(intent);
    }
    public void launchDiagnosa(View view) {
        Intent intent = new Intent(this, AwalDiagnosa.class);
        startActivity(intent);
    }
    public void webArtikel1 (View view) {
        Uri uri = Uri.parse("https://www.halodoc.com/4-jenis-gangguan-lambung");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void webArtikel2 (View view) {
        Uri uri = Uri.parse("https://www.halodoc.com/kesehatan/penyakit-asam-lambung");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void webArtikel3 (View view) {
        Uri uri = Uri.parse("https://www.halodoc.com/nyeri-lambung-tandai-munculnya-ulkus");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void webArtikel4 (View view) {
        Uri uri = Uri.parse("https://www.halodoc.com/pola-makan-sehat-mencegah-asam-lambung-kambuh");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }


}
