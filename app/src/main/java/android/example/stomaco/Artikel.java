package android.example.stomaco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Artikel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel);
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
