package com.example.acer.utsmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Trapesium extends AppCompatActivity {

    TextView tampil;
    EditText masukan, masukan2, masukan3;;
    Button klik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);
        tampil = (TextView) findViewById(R.id.text);
        masukan = (EditText) findViewById(R.id.EditText1);
        masukan2 = (EditText) findViewById(R.id.EditText2);
        masukan3 = (EditText) findViewById(R.id.EditText3);
        klik = (Button) findViewById(R.id.klik);


        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    int nilaiA = Integer.parseInt(masukan.getText().toString());
                    int nilaiB = Integer.parseInt(masukan2.getText().toString());
                    int nilaiC = Integer.parseInt(masukan3.getText().toString());
                    int hasil = nilaiA + nilaiB  * nilaiC;
                    Intent i = new Intent(Trapesium.this, Hasil.class);
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
            int nilaiC = Integer.parseInt(masukan3.getText().toString());

            int hasil = nilaiA + nilaiB + nilaiC + nilaiA;
            Intent i = new Intent(Trapesium.this, Hasil.class);
            i.putExtra("nilai", "" + hasil);
            startActivity(i);
        } catch (Exception ex) {
        }

    }
}