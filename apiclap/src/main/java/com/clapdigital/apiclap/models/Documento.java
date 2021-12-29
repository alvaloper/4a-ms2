package com.clapdigital.apiclap.models;
import org.springframework.data.annotation.Id;

public class Documento {

    @Id
    private String id;
    private String tipodocumento;

    public Documento() {}


    public String getId() {
        return id;
    }

    public Documento(String tipodocumento){
        this.tipodocumento=tipodocumento;
    }

    public String getTipodocumento(){
        return tipodocumento;
    }
    public void setTipodocumento(String tipodocumento){
        this.tipodocumento = tipodocumento;
    }

    @Override
    public String toString() {
        return "Documento [id=" + id + ", tipodocumento=" + tipodocumento + "]";
    }

}
