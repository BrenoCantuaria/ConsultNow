package com.dispmoveis.breno.consultnow;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaLogin extends AppCompatActivity implements View.OnClickListener
{
    //Atributos da Classe
    EditText autenticaLogin = null;
    EditText autenticaSenha = null;
    Button botaoConfirmar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        //Shared Preferences usado para o controle de usuário e senha
        final SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        String spLogin = (sharedPreferences.getString("Login", "Default_Value"));
        String spSenha = (sharedPreferences.getString("Senha", "Default_Value"));

        if (spLogin != "Default_Value")
        {
            this.autenticaLogin.setText(spLogin);
            this.autenticaSenha.setText(spSenha);
        }

        botaoConfirmar = (Button)findViewById(R.id.botaoAutentica);
    }

    //Método de validação de entrada do Usuário
    public boolean validaLogin()
    {
        autenticaLogin = (EditText) findViewById(R.id.textoUsuario);
        autenticaSenha = (EditText) findViewById(R.id.textoSenha);

        if (autenticaLogin.getText().toString().equals("breno") && autenticaSenha.getText().toString().equals("123"))
        {
            return true;
        }
        return false;
    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.botaoAutentica)
        {
            validaLogin();
        }
    }

    //Método utilizado para tratar eventos do botão
    public void validaLogin(View view)
    {
        if (view.getId() == R.id.botaoAutentica)
        {
            if(validaLogin())
            {
                Intent intentPerfil = new Intent(getApplicationContext(), TelaPrincipal.class);
                startActivity(intentPerfil);
            }
            else
            {
                Toast vrToast = Toast.makeText(this, "Tente novamente, usuário ou senha inválido!", Toast.LENGTH_SHORT);
                vrToast.show();
            }
        }
    }

    //Método utilizado para fazer a transição de activities ao pressionar o lugar setado
    public void cadastrarNovoUsuario(View view)
    {
        Intent intent = new Intent(TelaLogin.this, TelaCadastro.class);
        startActivity(intent);
    }

}
