package com.dispmoveis.breno.consultnow.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conector extends SQLiteOpenHelper
{
    public Conector(Context contexto)
    {
        super(contexto, "AGENDAMENTO", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(CriaScript.getCreateTableConsulta());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
