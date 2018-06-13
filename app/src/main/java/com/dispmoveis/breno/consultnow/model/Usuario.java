package com.dispmoveis.breno.consultnow.model;

public class Usuario
{
    private String login;
    private String senha;

    public Usuario (String login, String senha)
    {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
