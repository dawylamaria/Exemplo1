package br.edu.fescfafic.animal.Model;

public class Cachorro extends Animal{

    public String corDoPelo;

    public Cachorro(String nome, int idade, String especie, String corDoPelo){
        super(nome, idade, especie);
        this.corDoPelo = corDoPelo;

    }


}
