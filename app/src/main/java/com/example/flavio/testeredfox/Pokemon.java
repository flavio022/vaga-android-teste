package com.example.flavio.testeredfox;

public class Pokemon {
    private String nome;
    private String tipo;

    public Pokemon(){

    }
    public Pokemon(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

}
