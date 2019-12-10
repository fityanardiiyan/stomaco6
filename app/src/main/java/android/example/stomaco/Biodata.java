package android.example.stomaco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Biodata extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    private String namaBio;
    private String tglBio;

    private String alamatBio;

    private String penyakitBio;
    private String Key;

        public  Biodata(){

        }

    public Biodata(String namaBio, String tglBio, String alamatBio, String penyakitBio) {
        this.namaBio = namaBio;
        this.tglBio = tglBio;
        this.alamatBio = alamatBio;

        this.penyakitBio = penyakitBio;

    }

    public String getNamaBio() {
        return namaBio;
    }

    public void setNamaBio(String namaBio) {
        this.namaBio = namaBio;
    }

    public String getTglBio() {
        return tglBio;
    }

    public void setTglBio(String tglBio) {
        this.tglBio = tglBio;
    }

    public String getAlamatBio() {
        return alamatBio;
    }

    public void setAlamatBio(String alamatBio) {
        this.alamatBio = alamatBio;
    }


    public String getPenyakitBio() {
        return penyakitBio;
    }

    public void setPenyakitBio(String penyakitBio) {
        this.penyakitBio = penyakitBio;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    @Override
    public String toString(){
        return ""+namaBio+"\n"+
                ""+tglBio+"\n"+
                ""+alamatBio+"\n"+
                ""+penyakitBio+"\n";
    }


}

