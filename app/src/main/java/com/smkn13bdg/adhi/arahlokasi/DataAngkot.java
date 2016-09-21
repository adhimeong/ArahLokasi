package com.smkn13bdg.adhi.arahlokasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by adhi on 19/09/16.
 */
public class DataAngkot extends AppCompatActivity {

    public TextView asalview, tujuanview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setlayout
        setContentView(R.layout.cobaintent);
        //cari id view
        asalview = (TextView)findViewById(R.id.textView3);
        tujuanview = (TextView)findViewById(R.id.textView4);
        //perintah
        ambilData();
    }

    private void ambilData(){
        Bundle data = getIntent().getExtras();

        asalview.setText(data.getCharSequence("asalintent"));
        tujuanview.setText(data.getCharSequence("tujuanintent"));
    }

}
