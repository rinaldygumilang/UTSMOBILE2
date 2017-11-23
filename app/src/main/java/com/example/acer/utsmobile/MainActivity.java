package com.example.acer.utsmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Intent i;
    String title;
    int image[] = {R.drawable.persegi, R.drawable.ling, R.drawable.segitiga, R.drawable.persegipanjang, R.drawable.trapesium};

    String nama[] = {"Persegi", "Lingkaran", "Segitiga", "Persegi Panjang",
            "Trapesium"};

    String detail[] = {"Hitung Persegi",
            "Hitung Lingkaran",
            "Hitung Segitiga",
            "Hitung Persegi Panjang",
            "Hitung Trapesium"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = (ListView) findViewById(R.id.list);
        Customadapter customadapter = new Customadapter();
        listview.setAdapter(customadapter);
        listview.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick (AdapterView < ? > parent, View view, int position, long id){
        switch (position) {
            case 0:
                i = new Intent(this, ActivityNext.class);
                startActivity(i);
                break;

            case 1:
                i = new Intent(this, ActivityNext.class);
                startActivity(i);
                break;

            case 2:
                i = new Intent(this, ActivityNext.class);
                startActivity(i);
                break;

            case 3:
                i = new Intent(this, ActivityNext.class);

                startActivity(i);
                break;

            case 4:
                i = new Intent(this, ActivityNext.class);
                startActivity(i);
                break;
        }
    }
    class Customadapter extends BaseAdapter {

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup parent) {
            view =getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imgv);
            TextView names=(TextView)view.findViewById(R.id.tv1);
            TextView detailss=(TextView)view.findViewById(R.id.tv2);

            imageView.setImageResource(image[i]);
            names.setText(nama[i]);
            detailss.setText(detail[i]);

            return view;
        }
    }

}