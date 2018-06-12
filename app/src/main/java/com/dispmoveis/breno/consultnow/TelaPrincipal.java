package com.dispmoveis.breno.consultnow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class TelaPrincipal extends AppCompatActivity
{
    ArrayList<Consulta>    dataset;
    RecyclerView                Lista = null;
    RecyclerView.Adapter        adapter;
    RecyclerView.LayoutManager  layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        dataset = new ArrayList<Consulta>();
        Lista = (RecyclerView) findViewById(R.id.recyclerView);

        adapter = new Adaptador(dataset, this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        Lista.setLayoutManager(layoutManager);
        Lista.setAdapter(adapter);

        adapter.notifyDataSetChanged();

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
        dataset.add(new Consulta("nome", "medico", "Odontologista",
                "Dr: FDP", "28/01/2018"));

        dataset.add(new Consulta("nome", "medico", "Coleta sangue",
                "Dra: Vagabunda", "23/11/2018"));

        dataset.add(new Consulta("", "medico", "Gastro",
                "Dr: Arrombado", "10/12/2018"));
        adapter.notifyDataSetChanged();

        dataset.add(new Consulta("nome", "medico", "Viadinho",
                "Dr: FDP", "28/01/2018"));
    }
}
