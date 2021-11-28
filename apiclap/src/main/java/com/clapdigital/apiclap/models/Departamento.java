package com.clapdigital.apiclap.models;
import org.springframework.data.annotation.Id;

public class Departamento {

    @Id
    private String id_departamento;
    private String departamento;

    public Departamento(String id_departamento, String departamento) {
        this.id_departamento = id_departamento;
        this.departamento = departamento;
    }

    public String getId_departamento(){
        return id_departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
