package com.clapdigital.apiclap.models;
import org.springframework.data.annotation.Id;

public class Municipio {
    @Id
    private String id_municipio;
    private String municipio;

    public Municipio(String id_municipio, String municipio) {
        this.id_municipio = id_municipio;
        this.municipio = municipio;
    }

    public String getId_municipio() {
        return id_municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}