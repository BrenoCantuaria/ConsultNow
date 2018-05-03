package com.dispmoveis.breno.consultnow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TelaMarcarConsulta extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_marcar_consulta);
    }

    //Método utilizado para fazer a transição de activities ao pressionar o lugar setado
    public void concluirMarcacaoConsulta(View view)
    {
        Intent intent = new Intent(TelaMarcarConsulta.this, TelaPrincipal.class);
        startActivity(intent);
    }
}
