package com.clapdigital.apiclap.models;
import org.springframework.data.annotation.Id;

public class Etnia {
    @Id
    private String id_etnia;
    private String etnia;

    public Etnia(String id_etnia, String etnia) {
        this.id_etnia = id_etnia;
        this.etnia = etnia;
    }

    public String getId_etnia() {
        return id_etnia;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }
}