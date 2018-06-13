package com.dispmoveis.breno.consultnow.repositorio;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.dispmoveis.breno.consultnow.model.Consulta;

public class ConsultaRepositorio
{
    private SQLiteDatabase conexao;

    public ConsultaRepositorio(SQLiteDatabase conexao)
    {
        this.conexao = conexao;
    }

    public void inserir(Consulta consulta)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put("MEDICO", consulta.getNomeMedico());
        contentValues.put("TIPO", consulta.getTipoConsulta());
        contentValues.put("STATUS", consulta.getStatus());
        contentValues.put("DATA", consulta.getData());

        conexao.insertOrThrow("CONSULTA", null, contentValues);
    }

    public void excluir(int id)
    {
        String[] verificaParam = new String[1];
        verificaParam[0] = String.valueOf(id);

        conexao.delete("CONSULTA", "ID = ?", verificaParam);
    }

    public void atualiza(Consulta consulta)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put("MEDICO", consulta.getNomeMedico());
        contentValues.put("TIPO", consulta.getTipoConsulta());
        contentValues.put("STATUS", consulta.getStatus());
        contentValues.put("DATA", consulta.getData());

        String[] verificaParam = new String[1];
        verificaParam[0] = String.valueOf(consulta.getId());

        conexao.update("CONSULTA", contentValues, "ID = ?", verificaParam);
    }
}
