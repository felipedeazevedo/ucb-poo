package br.com.view;

import br.com.controle.Calculo;

public class Tela1 {

    public static void main(String[] args) {
        Calculo calculo = new Calculo(4.5, 9.88);
        System.out.println(calculo.somar());
    }
}
