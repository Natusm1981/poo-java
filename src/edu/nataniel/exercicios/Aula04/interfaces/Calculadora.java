package edu.nataniel.exercicios.Aula04.interfaces;

public class Calculadora implements OperacaoMatematica {

    @Override
    public Void adicao() {
       System.out.println("METODO ADICAO IMPLEMENTADO");
       return null;
    }

    @Override
    public Void subtracao() {
       System.out.println("METODO SUBTRAÇÂO IMPLEMENTADO");
       return null;
    }
    @Override

    public Void multiplicacao() {
       System.out.println("METODO MULTIPLICAÇÃO IMPLEMENTADO");
       return null;
    }

    @Override
    public Void divisao() {
       System.out.println("METODO DIVISÃO IMPLEMENTADO");
       return null;
    }
}
