package com.dispmoveis.breno.consultnow.telas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.dispmoveis.breno.consultnow.R;

public class AuxiliarLayout extends AppCompatActivity
{
    TextView medico, tipoConsulta, status, date;

    //Faz a chamada de criação de tela
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_auxiliar);
        inicializaVariaveis();
    }

    //Método que faz a inicialização das variáveis que serão apresentadas na recycleview
    public void inicializaVariaveis()
    {
        medico          = findViewById(R.id.id_nomeMedico);
        tipoConsulta    = findViewById(R.id.id_tipoConsulta);
        status          = findViewById(R.id.id_status);
        date            = findViewById(R.id.id_data);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        medico.setText(bundle.getString("Nome Médico:"));
        tipoConsulta.setText(bundle.getString("Consulta:"));
        status.setText(bundle.getString("Status:"));
        date.setText(bundle.getString("Data:"));
    }
}
