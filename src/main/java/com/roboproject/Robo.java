package com.roboproject;

/**
 * Classe que representa um robô e suas ações em um ambiente 2D.
 */
public class Robo {

    private int X;
    private int Y;
    private Orientacao orientacao;

    // Construtor
    public Robo() {
        // Posição inicial do robô
        this.X = 20;
        this.Y = 20;
        // Orientação inicial do robô
        this.orientacao = Orientacao.FRENTE;
    }

    /**
     * Move o robô para as novas coordenadas (x, y).
     */
    public void move(int novoX, int novoY) {
        this.X = novoX;
        this.Y = novoY;
    }

    /**
     * Exibe a posição atual do robô.
     */
    public void printPosicao() {
        System.out.println("Posição atual do Robô: " + X + ", " + Y);
    }

    /**
     * Altera a orientação do robô baseada na tecla pressionada.
     */
    public void setOrientacao(char tecla) {
      switch (tecla){
          case 'w':
              orientacao = Orientacao.FRENTE;
              break;
          case 'a':
              orientacao = Orientacao.ESQUERDA;
              break;
          case 's':
              orientacao = Orientacao.TRAS;
              break;
          case 'd':
              orientacao = Orientacao.DIREITA;
              break;
          default:
              throw new IllegalArgumentException("Tecla inválida");
      }
    }
    /**
     * Retorna a orientação atual do robô.
     */
    public Orientacao getOrientacao(){
        return orientacao;
    }
}
