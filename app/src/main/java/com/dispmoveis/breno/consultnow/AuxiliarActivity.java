package com.dispmoveis.breno.consultnow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AuxiliarActivity extends AppCompatActivity
{
    TextView dispMedica, tipoConsulta, dataHora;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_auxiliar);
        inicializaVariaveis();
    }

    public void inicializaVariaveis()
    {
        tipoConsulta    = findViewById(R.id.id_tipoConsulta);
        dispMedica      = findViewById(R.id.id_dispMedica);
        dataHora        = findViewById(R.id.id_dataHora);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        tipoConsulta.setText(bundle.getString("Consulta"));
        dispMedica.setText(bundle.getString("Nome Médico"));
        dataHora.setText(bundle.getString("Data/Hora"));
    }
}
