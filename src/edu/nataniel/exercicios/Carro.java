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
    private int capacidadeTanque;
    int anoFabricacao;
    int potencia;

    //Construtor - provê valores iniciais
    public Carro(){
    }
    //Sobrecarga 1
    public Carro(int capacidadeTanque, String marca){
        this.capacidadeTanque = capacidadeTanque;
        this.marca = marca;
    }


    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setCapacidadeTanque(int litros){
        this.capacidadeTanque = litros;
    }

    public int getCapacidadeTanque(){
        return this.capacidadeTanque;
    }

    public double valorEncherTanque(double precoGasolina){   
        return (this.capacidadeTanque * precoGasolina);
    }




    //Destrutor - Auxilia na limpeza de memória -
    //    void finalize(){
    //    System.out.println("Limpando");
    //      }

    //Metodos


    public void ligar(){}

    public void acelerar(){}

    public void frear(){}

    public void abrirPorta(){}

}