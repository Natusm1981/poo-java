package edu.nataniel.exercicios;

/**
 * Classe exemplo de exercicio
 */

public class Carro{


    //Atributos
    private String marca;
    String modelo;
    String cor;
    String cambio;
    int portas;
    int capacidadeTanque;
    int anoFabricacao;
    int potencia;


    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }


    //Construtor - provê valores iniciais
    public Carro(){

    }

    //Destrutor - Auxilia na limpeza de memória -
    //    void finalize(){
    //    System.out.println("Limpando");
    //      }

    //Metodos
    public double encherTanque(double litros, double precoGasolina){
        
        return (litros * precoGasolina);
    }

    public void ligar(){}

    public void acelerar(){}

    public void frear(){}

    public void abrirPorta(){}

}