package com.smkn13bdg.adhi.arahlokasi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by adhi on 19/09/16.
 */
public class DataAngkot extends AppCompatActivity {

    public String asaltxt, tujuantxt;
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
        asaltxt = data.getCharSequence("asalintent").toString();
        tujuantxt = data.getCharSequence("tujuanintent").toString();

        asalview.setText(asaltxt);
        tujuanview.setText(tujuantxt);
        JalurAngkot(asaltxt, tujuantxt);
    }

    private void JalurAngkot(String awal, String akhir){

    }

}
