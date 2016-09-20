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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        AutoCompleteTextView asaltext = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteAwal);
        AutoCompleteTextView tujuantext = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTujuan);
        //masukan data array
        asaltext.setAdapter(asaladapter);
        tujuantext.setAdapter(tujuanadapter);
    }

    public void cariArah (View view ) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    private static final String[] ASAL = new String[] {
            "Buah Batu", "Kiaracondong", "Antapani", "Cicadas", "Cicaheum"
    };

    private static final String[] TUJUAN = new String[] {
            "Buah Batu", "Kiaracondong", "Antapani", "Cicadas", "Cicaheum"
    };

}
