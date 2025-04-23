package com.roboproject;

/**
 * Classe abstrata que define o comportamento básico esperado para qualquer robô.
 * Representa um modelo conceitual (ideia) de um robô em um ambiente bidimensional (2D).
 *
 * @author Rafael Lopes
 * @version 1.0
 */
public abstract class RoboIdeia {

    /**
     * Posição atual do robô no eixo X.
     */
    protected float posicaoX;

    /**
     * Posição atual do robô no eixo Y.
     */
    protected float posicaoY;

    /**
     * Orientação atual do robô no ambiente 2D (FRENTE, ATRAS, ESQUERDA, DIREITA).
     */
    protected Orientacao orientacao;

    /**
     * Nome ou identificador único do robô.
     */
    protected String nome;

    /**
     * Peso do robô, em quilogramas.
     */
    protected float peso;

    /**
     * Move o robô diretamente para uma posição específica no espaço 2D.
     *
     * @param posX nova coordenada no eixo X.
     * @param posY nova coordenada no eixo Y.
     */
    public abstract void move(float posX, float posY);

    /**
     * Move o robô ao longo do eixo X, com base em uma distância especificada.
     *
     * @param dist distância a mover ao longo do eixo X.
     */
    public abstract void moveX(float dist);

    /**
     * Move o robô ao longo do eixo Y, com base em uma distância especificada.
     *
     * @param dist distância a mover ao longo do eixo Y.
     */
    public abstract void moveY(float dist);
}
