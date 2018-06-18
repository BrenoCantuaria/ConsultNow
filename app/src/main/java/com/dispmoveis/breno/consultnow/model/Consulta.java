package com.dispmoveis.breno.consultnow.model;

public class Consulta
{

    private Integer id;
    private String nomeMedico;
    private String tipoConsulta;
    private String status;
    private String data;

    public Consulta(Integer id, String nomeMedico, String tipoConsulta, String status, String data)
    {
        this.setId(id);
        this.setNomeMedico(nomeMedico);
        this.setTipoConsulta(tipoConsulta);
        this.setStatus(status);
        this.setData(data);
    }

    public Consulta() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
