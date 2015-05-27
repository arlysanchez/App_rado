package com.app_rado.controller.coneccion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by JHAN  ARLY on 26/05/2015.
 */
public class bd_sqlite extends SQLiteOpenHelper {

    String sql="CREATE TABLE curso(id_curso INTEGER PRIMARY KEY AUTOINCREMENT , " +
            " nombre TEXT , ht TEXT , hp TEXT )";

    public bd_sqlite(Context context) {
        super(context, "bdacademico", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS curso ");
        db.execSQL(sql);
    }
}
