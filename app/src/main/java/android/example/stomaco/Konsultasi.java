package android.example.stomaco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Konsultasi extends AppCompatActivity {


    CheckBox G1,G2,G3,G4,G5,G6,G7,G8,G9,G10,G11,G12,G13,G14,G15,G16,G17,G18,G19,G20,
                G21,G22,G23,G24,G25,G26,G27,G28,G29,G30,G31,G32,G33,G34;
    Button diagnosa;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsultasi);
        G1 = (CheckBox) findViewById(R.id.checkBox);
        G2 = (CheckBox) findViewById(R.id.checkBox2);
        G3 = (CheckBox) findViewById(R.id.checkBox3);
        G4 = (CheckBox) findViewById(R.id.checkBox4);
        G5 = (CheckBox) findViewById(R.id.checkBox5);
        G6 = (CheckBox) findViewById(R.id.checkBox6);
        G7 = (CheckBox) findViewById(R.id.checkBox7);
        G8 = (CheckBox) findViewById(R.id.checkBox8);
        G9 = (CheckBox) findViewById(R.id.checkBox9);
        G10 = (CheckBox) findViewById(R.id.checkBox10);
        G11 = (CheckBox) findViewById(R.id.checkBox11);
        G12 = (CheckBox) findViewById(R.id.checkBox12);
        G13 = (CheckBox) findViewById(R.id.checkBox13);
        G14 = (CheckBox) findViewById(R.id.checkBox14);
        G15 = (CheckBox) findViewById(R.id.checkBox15);
        G16 = (CheckBox) findViewById(R.id.checkBox16);
        G17 = (CheckBox) findViewById(R.id.checkBox17);
        G18 = (CheckBox) findViewById(R.id.checkBox18);
        G19 = (CheckBox) findViewById(R.id.checkBox19);
        G20 = (CheckBox) findViewById(R.id.checkBox20);
        G21 = (CheckBox) findViewById(R.id.checkBox21);
        G22 = (CheckBox) findViewById(R.id.checkBox22);
        G23 = (CheckBox) findViewById(R.id.checkBox23);
        G24 = (CheckBox) findViewById(R.id.checkBox24);
        G25 = (CheckBox) findViewById(R.id.checkBox25);
        G26 = (CheckBox) findViewById(R.id.checkBox26);
        G27 = (CheckBox) findViewById(R.id.checkBox27);
        G28 = (CheckBox) findViewById(R.id.checkBox28);
        G29 = (CheckBox) findViewById(R.id.checkBox29);
        G30 = (CheckBox) findViewById(R.id.checkBox30);
        G31 = (CheckBox) findViewById(R.id.checkBox31);
        G32 = (CheckBox) findViewById(R.id.checkBox32);
        G33 = (CheckBox) findViewById(R.id.checkBox33);
        G34 = (CheckBox) findViewById(R.id.checkBox34);
        diagnosa    =(Button) findViewById(R.id.btnDiagnosa);
        hasil       = (TextView) findViewById(R.id.hasil);

        diagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hasilDiagnosa = "Hasil Diagnosa, Anda kemungkinan besar menderita : ";
                //Maag G1,G2,G3,G4,G5,G23,G27,G32
                if(G1.isChecked() && G2.isChecked() && G3.isChecked() && G4.isChecked() &&
                        G5.isChecked() && G23.isChecked() && G27.isChecked() && G32.isChecked()){
                    hasilDiagnosa += "Maag";
                }
                // Dispepsia G1,G2,G3,G4,G5,G6,G8,G9,G21,G23,G27G28,G31,G32,G34
                if(G1.isChecked() && G2.isChecked() && G3.isChecked() && G4.isChecked() &&
                        G5.isChecked() && G6.isChecked() && G8.isChecked() && G9.isChecked() &&
                        G21.isChecked() && G23.isChecked() && G27.isChecked() && G28.isChecked()
                        &&G31.isChecked() && G32.isChecked() && G34.isChecked()){
                    hasilDiagnosa += "Dispepsia";
                }
                // Kanker Lambung G1,G2,G3,G4,G5,G6,G10,G11,G12,G21,G22,G27
                if(G1.isChecked() && G2.isChecked() && G3.isChecked() && G4.isChecked() &&
                        G5.isChecked() && G6.isChecked() && G10.isChecked() && G11.isChecked() &&
                        G12.isChecked() && G21.isChecked() && G22.isChecked() && G27.isChecked()){
                    hasilDiagnosa += "Kanker Lambung";
                }
                // GERD G1,G3,G4,G5,G7,G13,G14,G15,G16,G17,G18,G19,G20,G21,G22,G27,G30,G31
                if(G1.isChecked() && G3.isChecked() && G4.isChecked() && G5.isChecked() &&
                        G7.isChecked() && G13.isChecked() && G14.isChecked() && G15.isChecked() &&
                        G16.isChecked() && G17.isChecked() && G18.isChecked() && G19.isChecked() &&
                        G20.isChecked() && G21.isChecked() && G22.isChecked() && G27.isChecked() &&
                        G30.isChecked() &&G31.isChecked()){
                    hasilDiagnosa += "Gastroesophageal Reflux Disease (GERD)";
                }
                // Gastroenteritis G1,G3,G5,G6,G9,G16,G21,G22,G25,G26,G27,G29,G32
                if(G1.isChecked() && G3.isChecked() && G5.isChecked() && G6.isChecked() &&
                        G9.isChecked() && G16.isChecked() && G21.isChecked() && G22.isChecked() &&
                        G25.isChecked() && G26.isChecked() && G27.isChecked() && G29.isChecked() &&
                        G32.isChecked()){
                    hasilDiagnosa += "Gastroenteritis";
                }
                //Gastroparesis G4,G5,G6,G10,G16,G22,G26,G27,G32,G33,G34
                if(G4.isChecked() && G5.isChecked() && G6.isChecked() && G10.isChecked() &&
                        G16.isChecked() && G22.isChecked() && G26.isChecked() && G27.isChecked() &&
                        G32.isChecked() && G33.isChecked() && G34.isChecked()){
                    hasilDiagnosa += "Gastroparesis";
                }
                //Tukak Lambung G1,G4,G5,G12,G23,G24,G25,G32
                if(G1.isChecked() && G4.isChecked() && G5.isChecked() && G12.isChecked() &&
                        G23.isChecked() && G24.isChecked() && G25.isChecked() && G32.isChecked()){
                    hasilDiagnosa += "Tukak Lambung";
                }

                hasil.setText(""+hasilDiagnosa);
            }
        });
    }

        public void onCheckboxClicked(View view){
            boolean checked = ((CheckBox) view).isChecked();
            String strng ="";

            //toast
            switch (view.getId()){
                case R.id.checkBox:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox2:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox3:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox4:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox5:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox6:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox7:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox8:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox9:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox10:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox11:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox12:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox13:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox14:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox15:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox16:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox17:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox18:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox19:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox20:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox21:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox22:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox23:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox24:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox25:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox26:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox27:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox28:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox29:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox30:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox31:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox32:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox33:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
                case R.id.checkBox34:
                    strng = checked?"Gejala Dipilih":"Gejala tidak Dipilih";
                    break;
            }

            Toast.makeText(getApplicationContext(),strng, Toast.LENGTH_SHORT).show();
        }
}
