package com.example.acer.utsmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjang extends AppCompatActivity {

    TextView tampil;
    EditText masukan, masukan2;
    Button klik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        tampil = (TextView) findViewById(R.id.text);
        masukan = (EditText) findViewById(R.id.EditText1);
        masukan2 = (EditText) findViewById(R.id.EditText2);
        klik = (Button) findViewById(R.id.klik);


        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    int nilaiA = Integer.parseInt(masukan.getText().toString());
                    int nilaiB = Integer.parseInt(masukan2.getText().toString());
                    int hasil = nilaiA * nilaiB ;
                    Intent i = new Intent(PersegiPanjang.this, Hasil.class);
                    i.putExtra("nilai", "" + hasil);
                    startActivity(i);
                } catch (Exception ex) {
                }
            }
        });
    }

    public void klik2(View view) {
        try {
            int nilaiA = Integer.parseInt(masukan.getText().toString());
            int nilaiB = Integer.parseInt(masukan2.getText().toString());
            int hasil = 2 * nilaiB * 2* nilaiA;
            Intent i = new Intent(PersegiPanjang.this, Hasil.class);
            i.putExtra("nilai", "" + hasil);
            startActivity(i);
        } catch (Exception ex) {
        }
    }
}