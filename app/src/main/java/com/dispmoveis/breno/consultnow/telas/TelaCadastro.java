package com.dispmoveis.breno.consultnow.telas;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.dispmoveis.breno.consultnow.R;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by breno on 26/04/2018.
 */

public class TelaCadastro extends AppCompatActivity
{
    private EditText editEmail, editSenha;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //String email = editEmail.getText().toString().trim();

        //String senha = editSenha.getText().toString().trim();

        inicializaComponentes();
    }

    public void inicializaComponentes()
    {
        editEmail = (EditText) findViewById(R.id.textoEmail);
        editSenha = (EditText) findViewById(R.id.textoSenha);
    }

    protected void onStart()
    {
        super.onStart();
       // mAuth = Conexao.getFirebaseAuth();
    }

   /* public void cadastrarUsuario(String email, String senha)
    {

        mAuth.createUserWithEmailAndPassword(email, senha)
                .addOnCompleteListener(TelaCadastro.this, new OnCompleteListener<AuthResult>()
                {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task)
                    {
                        if(task.isSuccessful())
                        {
                            aviso("Usuário Cadastrado com sucesso!!!");
                           // Intent intent = new Intent(TelaCadastro.this, TelaLogin.class)
                        }
                        else
                        {
                            aviso("Erro ao cadastro um novo usuário!!!");
                        }
                    }
                });

    }*/

    public void aviso(String msg)
    {
        Toast.makeText(TelaCadastro.this, msg, Toast.LENGTH_SHORT).show();
    }

    //Método utilizado para fazer a transição de activities ao pressionar o lugar setado
    public void concluirMarcacaoConsulta(View view)
    {
        Intent intent = new Intent(TelaCadastro.this, TelaPrincipal.class);
        startActivity(intent);
    }
}