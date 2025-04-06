package com.roboproject;

public class Robo {

    private int X;
    private int Y;
    int orientacao;

    public static final int FRENTE = 0;
    public static final int TRAS = 1;
    public static final int DIREITA = 2;
    public static final int ESQUERDA = 3;

    // Construtor
    public Robo() {
        // Posição inicial do robô
        this.X = 20;
        this.Y = 20;
        // Orientação inicial do robô
        this.orientacao = FRENTE;
    }

    public void move(int novoX, int novoY) {
        this.X = novoX;
        this.Y = novoY;
    }

    public void printPosicao() {
        System.out.println("Posição atual do Robô: " + X + ", " + Y);
    }

    public void setOrientacao(char tecla) {
        if (tecla == 'w') {
            this.orientacao = FRENTE;
        } else if (tecla == 'a') {
            this.orientacao = ESQUERDA;
        } else if (tecla == 's') {
            this.orientacao = DIREITA;
        } else if (tecla == 'd') {
            this.orientacao = TRAS;
        } else {
            System.out.println("Tecla inválida");
        }
    }

    public int getOrientacao() {
        return orientacao;
    }
}
