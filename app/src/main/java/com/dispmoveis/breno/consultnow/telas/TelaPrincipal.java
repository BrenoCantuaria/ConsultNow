package com.dispmoveis.breno.consultnow.telas;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.dispmoveis.breno.consultnow.model.Adaptador;
import com.dispmoveis.breno.consultnow.R;
import com.dispmoveis.breno.consultnow.model.Consulta;

import java.util.ArrayList;

public class TelaPrincipal extends AppCompatActivity
{
    ArrayList<Consulta>         dataset;
    RecyclerView                Lista;
    RecyclerView.Adapter        adapter;
    RecyclerView.LayoutManager  layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        dataset = new ArrayList<Consulta>();
        Lista = (RecyclerView) findViewById(R.id.recyclerView);

        Lista.setHasFixedSize(true);

        adapter = new Adaptador(dataset, this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        Lista.setLayoutManager(layoutManager);
        Lista.setAdapter(adapter);

        updateData();
        preencheLista();
    }

    //Método utilizado para fazer a transição de activities ao pressionar o lugar setado
    public void marcarConsulta(View view)
    {
        Intent intent = new Intent(TelaPrincipal.this, TelaMarcarConsulta.class);
        startActivity(intent);
    }

    public void updateData() { adapter.notifyDataSetChanged(); }

    public void preencheLista()
    {
        dataset.add(new Consulta( 1,"Dr: Nelson", "Neurologista",  "Agendado",   "28/01/2018"));
        dataset.add(new Consulta( 2,"Dr: Luisa",  "Coleta de Algo","Confirmado", "23/11/2018"));
        dataset.add(new Consulta( 3,"Dr: Juvenal","Clinico Geral", "Em análise", "10/12/2018"));
        dataset.add(new Consulta( 4,"Dr: Alguém", "Gastro",        "Cancelado",  "28/01/2018"));
    }
}
