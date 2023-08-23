package br.com.view;

import br.com.controle.Semestre;

import javax.swing.*;

public class Tela2 {

    public static void main(String[] args) {
        Semestre semestre = new Semestre(
                Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1:")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2:"))
        );
        JOptionPane.showMessageDialog(null, definirEstadoAprovacao(semestre.calcularMedia()));
    }

    public static String definirEstadoAprovacao(double media) {
        if (media >= 6) {
            return "Aprovado";
        } else if (media >= 4) {
            return "Recuperação";
        } else if (media < 4 && media > 0) {
            return "Reprovado";
        } else {
            return "Erro";
        }
    }
}
