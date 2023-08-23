package br.com.controle;

import javax.swing.*;

public class Semestre {

    private double nota1;
    private double nota2;

    public Semestre() {
    }

    public Semestre(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }
}
