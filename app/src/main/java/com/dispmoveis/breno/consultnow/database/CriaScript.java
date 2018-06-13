package com.dispmoveis.breno.consultnow.database;

public class CriaScript
{
    public static String getCreateTableConsulta()
    {
        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE IF NOT EXISTS AGENDAMENTO ( ");
        sql.append("        ID              INTEGER        PRIMARY KEY AUTOINCREMENT NOT NULL, ");
        sql.append("        MEDICO          VARCHAR (150)  NOT NULL DEFAULT (''), ");
        sql.append("        TIPO            VARCHAR (200)  NOT NULL DEFAULT (''), ");
        sql.append("        STATUS          VARCHAR (50)   NOT NULL DEFAULT (''), ");
        sql.append("        DATA            DATE           NOT NULL DEFAULT ('')  );");

        return sql.toString();
    }

    public static  String getCreateTableUsuario()
    {
        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE IF NOT EXISTS USUARIO ( ");
        sql.append("        ID              INTEGER        PRIMARY KEY AUTOINCREMENT NOT NULL, ");
        sql.append("        LOGIN           VARCHAR (50)  NOT NULL DEFAULT (''), ");
        sql.append("        SENHA           VARCHAR (50)  NOT NULL DEFAULT ('') );");

        return sql.toString();
    }
}
