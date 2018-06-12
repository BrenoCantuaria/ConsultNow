package com.dispmoveis.breno.consultnow;

public class Consulta
{
    private String nome;
    private String medico;
    private String tipoConsulta;
    private String dispMedica;
    private String dataHora;


    public Consulta(String nome, String medico, String tipoConsulta, String dispMedica, String dataHora) {
        this.nome = nome;
        this.medico = medico;
        this.tipoConsulta = tipoConsulta;
        this.dispMedica = dispMedica;
        this.dataHora = dataHora;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getDispMedica() {
        return dispMedica;
    }

    public void setDispMedica(String dispMedica) {
        this.dispMedica = dispMedica;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }
}
