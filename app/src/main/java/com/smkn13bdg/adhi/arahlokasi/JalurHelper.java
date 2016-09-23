package com.smkn13bdg.adhi.arahlokasi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by adhi on 23/09/16.
 */

public class JalurHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME ="angkotbdg.db";
    private static  final int DATABASE_VERSION = 1;

    public JalurHelper(Context context)  {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql1 = "CREATE TABLE angkot(id_angkot integer primary key, nama_angkot text null)";
        String sql2 = "CREATE TABLE trayek(id_trayek integer primary key, id_angkot integer null,id_lokasi integer null)";
        String sql3 = "CREATE TABLE lokasi(id_lokasi integer primary key, nama_lk text null,longitud text null,latitud text null)";
        db.execSQL(sql1);
        db.execSQL(sql2);
        db.execSQL(sql3);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
