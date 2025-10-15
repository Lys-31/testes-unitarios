package org.example;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma: " + calculadora.somar(10, 20));
        System.out.println("Subtração: " + calculadora.diminuir(10, 20));
        System.out.println("Multiplicação: " + calculadora.multiplicar(10, 20));
        System.out.println("Divisão: " + calculadora.dividir(10, 20));
    }
}