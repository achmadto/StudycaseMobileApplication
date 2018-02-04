package com.example.sei.achmadtaufikrizki_1202150071_modul1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Context context	=	getApplicationContext();

        Toast overbudget =Toast.makeText(context,"Terlalu Mahal", Toast.LENGTH_LONG);
        Toast sesuaibudget = Toast.makeText(context,"Pas nih", Toast.LENGTH_LONG);


        TextView tempat = (TextView) findViewById(R.id.tempat);
        TextView menu = (TextView) findViewById(R.id.Menu);
        TextView jumlahPorsi = (TextView) findViewById(R.id.jumlahPorsi);
        TextView jumlahHarga = (TextView) findViewById(R.id.jumlahHarga);

        Intent intent = getIntent();

        int totalHarga = intent.getIntExtra("totalHarga", 0);
        String Harga = Integer.toString(totalHarga);

        int totalPorsi = intent.getIntExtra("totalPorsi",0);
        String Porsi = Integer.toString(totalPorsi);

        int budget = intent.getIntExtra("budget",0);

        String Menu = intent.getStringExtra("totalMenu");

        String Tempat = intent.getStringExtra("tempat");

        tempat.setText(Tempat);
        menu.setText(Menu);
        jumlahPorsi.setText(Porsi);
        jumlahHarga.setText(Harga);

        // mengecek harga apakah overbudget atau sesuaibudget

        if(budget >= totalHarga) {
            sesuaibudget.show();
        }
        else {
            overbudget.show();
        }

    }
}
