package com.smkn13bdg.adhi.arahlokasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by adhi on 15/09/16.
 */
public class InputanTujuan extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_tujuan);
    }

    public void cariArah (View view ) {
        Intent intent = new Intent(this, MapsActivity.class);
        EditText asaltxt = (EditText)findViewById(R.id.asal);
        EditText tujuantxt = (EditText)findViewById(R.id.tujuan);

        String asal = asaltxt.getText().toString();
        String tujuan = tujuantxt.getText().toString();
        intent.putExtra("asal", asal);
        intent.putExtra("tujuan", tujuan);
        startActivity(intent);
    }

}
