package com.example.sei.achmadtaufikrizki_1202150071_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // variabel porsi
    private EditText porsi;
    //variabel menu
    private EditText menu;
    //variabel untuk menyimpan data budget
    private int budget= 65500;
    //variabel untuk menyimpan angka harga makan di eatbus
    private int hargaEatbus=50000 ;
    //variabel untuk menyimpan angka harga makan di Abnormal
    private int hargaAbnormal=30000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        porsi = (EditText) findViewById(R.id.porsi);
        menu = (EditText) findViewById(R.id.menu);

    }

    public void pilihAbnormal(View view) {

        int totalPorsi = Integer.parseInt(porsi.getText().toString());
        String dMenu = menu.getText().toString();

        int totalHarga = totalPorsi * hargaAbnormal;
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("tempat", "Abnormal");
        intent.putExtra("Porsi", totalPorsi);
        intent.putExtra("totalMenu", dMenu);
        intent.putExtra("totalHarga", totalHarga);
        intent.putExtra("budget", budget);

        startActivity(intent);

    }

    public void pilihEatbus(View view) {
        int totalPorsi = Integer.parseInt(porsi.getText().toString());
        String dMenu = menu.getText().toString();

        int totalHarga = totalPorsi * hargaEatbus;
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("tempat", "Eatbus");
        intent.putExtra("Porsi", totalPorsi);
        intent.putExtra("totalMenu", dMenu);
        intent.putExtra("totalHarga", totalHarga);
        intent.putExtra("budget", budget);
        startActivity(intent);
    }
}

