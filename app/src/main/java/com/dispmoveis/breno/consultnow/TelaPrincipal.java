package com.dispmoveis.breno.consultnow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class TelaPrincipal extends AppCompatActivity
{

    private RecyclerView consultaRcView;
    private RecyclerView.Adapter itensRcAdapter;
    private RecyclerView.LayoutManager itensRcLm;
    private List<CadastroConsulta> listaItens = new ArrayList<>();
    CadastroConsulta cadastroConsulta;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
    }

    //Método utilizado para fazer a transição de activities ao pressionar o lugar setado
    public void marcarConsulta(View view)
    {
        Intent intent = new Intent(TelaPrincipal.this, TelaMarcarConsulta.class);
        startActivity(intent);
    }
}
