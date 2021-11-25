package com.clapdigital.apiclap.exceptions;

public class DocumentoNotFoundException extends RuntimeException{
    public DocumentoNotFoundException(String message){
        super(message);
    }
}
