package edu.nataniel.exercicios;

/**
 * Classe exemplo de exercicio
 */

public class Carro{


    //Atributos
    private String marca;
    private String modelo;
    private String cor;
    private String cambio;
    private int portas;
    private int capacidadeTanque;
    private int anoFabricacao;
    private int potencia;

    //Construtor - provê valores iniciais
    public Carro(){
    }
    //Sobrecarga 1
    public Carro(String marca, String modelo, String cor, String cambio, int portas, int capacidadeTanque, int anoFabricacao, int potencia){
        this.capacidadeTanque = capacidadeTanque;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.cambio = cambio;
        this.portas = portas;
        this.anoFabricacao = anoFabricacao;
        this.potencia = potencia;
    }


    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }

    public void setCambio(String cambio){
        this.cambio = cambio;
    }
    public String getCambio(){
        return this.cambio;
    }
    public void setPortas(int portas){
        this.portas = portas;
    }
    public int getPortas(){
        return this.portas;
    }

    public void setAnoFabricacao(int ano){
        this.anoFabricacao = ano;
    }
    public int getAnoFabricacao(){
        return this.anoFabricacao;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public int getPotencia(){
        return this.potencia;
    }


    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
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