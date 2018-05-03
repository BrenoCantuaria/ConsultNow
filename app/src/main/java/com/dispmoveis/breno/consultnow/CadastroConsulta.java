package com.dispmoveis.breno.consultnow;

public class CadastroConsulta
{
    public String nome;
    public String medico;
    public String tipoConsulta;
    public String horario;

    public void CadastroConsulta()
    {
    }

    public void CadastroConsulta(String nome, String medico, String tipoConsulta, String horario)
    {
        this.nome = nome;
        this.medico = medico;
        this.tipoConsulta = tipoConsulta;
        this.horario = horario;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getMedico()
    {
        return medico;
    }

    public void setMedico(String medico)
    {
        this.medico = medico;
    }

    public String getTipoConsulta()
    {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta)
    {
        this.tipoConsulta = tipoConsulta;
    }

    public String getHorario()
    {
        return horario;
    }

    public void setHorario(String horario)
    {
        this.horario = horario;
    }
}
