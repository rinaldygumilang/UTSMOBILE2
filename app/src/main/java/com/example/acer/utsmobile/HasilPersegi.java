package com.example.acer.utsmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilPersegi extends AppCompatActivity {
    TextView hsl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_persegi);

        hsl = (TextView)findViewById(R.id.hsl);
        Intent i = getIntent();
        String nilai = i.getStringExtra("nilai");
        hsl.setText(nilai);
    }
}
