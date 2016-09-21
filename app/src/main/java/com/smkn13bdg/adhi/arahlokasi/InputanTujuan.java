package com.smkn13bdg.adhi.arahlokasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

/**
 * Created by adhi on 15/09/16.
 */
public class InputanTujuan extends AppCompatActivity{

    public AutoCompleteTextView asaltext;
    public AutoCompleteTextView tujuantext;

    @Override
    protected void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_tujuan);


        //autocomplete
        //array temapt asal
        ArrayAdapter<String> asaladapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, ASAL);
        //array tempat tujuan
        ArrayAdapter<String> tujuanadapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, TUJUAN);
        //cari id di layout
        asaltext = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteAwal);
        tujuantext = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTujuan);
        //masukan data array
        asaltext.setThreshold(1);//mulai kerja pada inputan ke 1
        tujuantext.setThreshold(1); //mulai kerja pada inputan ke 1
        asaltext.setAdapter(asaladapter);
        tujuantext.setAdapter(tujuanadapter);

    }

    public void cariArah (View view ) {
        Intent halaman = new Intent(getApplicationContext(), DataAngkot.class);
        //membuat objek bundle
        Bundle data = new Bundle();

        //menyisipkan string
        data.putString("asalintent", asaltext.getText().toString());
        data.putString("tujuanintent", tujuantext.getText().toString());

        //menambah bundle intent
        halaman.putExtras(data);
        //mulai activity
        startActivity(halaman);
    }

    private static final String[] ASAL = new String[] {
            "Buah Batu", "Kiaracondong", "Antapani", "Cicadas", "Cicaheum"
    };

    private static final String[] TUJUAN = new String[] {
            "Buah Batu", "Kiaracondong", "Antapani", "Cicadas", "Cicaheum"
    };

}
