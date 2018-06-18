package com.dispmoveis.breno.consultnow.telas;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.dispmoveis.breno.consultnow.R;
import com.dispmoveis.breno.consultnow.model.Consulta;

public class TelaMarcarConsulta extends AppCompatActivity
{
    TextView preencherNome, preencherTipo, preencherData, preencherStatus;

    private Consulta consulta;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_marcar_consulta);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        inicializaComponentes();
    }

    public boolean isCampoVazio(String valor)
    {
        boolean resultado = (TextUtils.isEmpty(valor) || valor.trim().isEmpty());
        return resultado;
    }

    public boolean validaCampos()
    {
        consulta = new Consulta();
        boolean resposta =  false;

        String nome     = preencherNome.getText().toString();
        String tipo     = preencherTipo.getText().toString();
        String status   = preencherStatus.getText().toString();
        String data     = preencherData.getText().toString();

        consulta.setNomeMedico(nome);
        consulta.setTipoConsulta(tipo);
        consulta.setStatus(status);
        consulta.setData(data);

        //Verifica se os campos digitados estão vazios
        if(resposta =  isCampoVazio(nome))
        {
            preencherNome.requestFocus();
        }
        else if(resposta =  isCampoVazio(tipo))
        {
            preencherNome.requestFocus();
        }
        else if(resposta =  isCampoVazio(status))
        {
            preencherNome.requestFocus();
        }
        else if(resposta =  isCampoVazio(data))
        {
            preencherNome.requestFocus();
        }

        if(resposta)
        {
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Aviso");
            dlg.setMessage("Existem campos inválidos ou em branco!");
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }
        return resposta;
    }

    //Método que faz a inicialização dos componentes que serão apresentadas na recycleview
    public void inicializaComponentes()
    {
        preencherNome      = findViewById(R.id.plainTextDispMedic);
        preencherTipo      = findViewById(R.id.plainTextType);
        preencherStatus    = findViewById(R.id.plainTextStatusConsulta);
        preencherData      = findViewById(R.id.plainTextDate);
    }

    //Método utilizado para fazer a transição de activities ao pressionar o lugar setado
    public void concluirMarcacaoConsulta(View view)
    {
        Intent intent = new Intent(TelaMarcarConsulta.this, TelaPrincipal.class);
        startActivity(intent);
    }
}
