package com.roboproject;

/**
 * Classe abstrata que representa a ideia de uma caixa em um ambiente 2D.
 * Define atributos e comportamentos genéricos que serão compartilhados
 * por todas as classes concretas que estendem essa abstração.

 * As caixas possuem posição, peso e dimensões fixas (comprimento, largura, altura).

 * @author Rafael
 * @version 1.0
 */
public abstract class CaixaIdeia {
    protected int posicaoX;
    protected int posicaoY;
    protected float peso;
    protected final float comprimento;
    protected final float largura;
    protected final float altura;

    /**
     * Construtor da classe base CaixaIdeia.
     *
     * @param posicaoX posição inicial da caixa no eixo X.
     * @param posicaoY posição inicial da caixa no eixo Y.
     * @param peso peso da caixa em quilogramas.
     * @param comprimento comprimento da caixa.
     * @param largura largura da caixa.
     * @param altura altura da caixa.
     */
    public CaixaIdeia(int posicaoX, int posicaoY, float peso, float comprimento, float largura, float altura){
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.peso = peso;
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    /**
     * Obtém a posição X atual da caixa.
     *
     * @return valor da posição no eixo X.
     */
    public int getPosicaoX(){
        return posicaoX;
    }

    /**
     * Define uma nova posição X para a caixa.
     *
     * @param posicaoX nova posição no eixo X.
     */
    public void setPosicaoX(int posicaoX){
        this.posicaoX = posicaoX;
    }

    /**
     * Obtém a posição Y atual da caixa.
     *
     * @return valor da posição no eixo Y.
     */
    public int getPosicaoY(){
        return posicaoY;
    }

    /**
     * Define uma nova posição Y para a caixa.
     *
     * @param posicaoY nova posição no eixo Y.
     */
    public void setPosicaoY(int posicaoY){
        this.posicaoY = posicaoY;
    }

    /**
     * Obtém o peso atual da caixa.
     *
     * @return peso da caixa em quilogramas.
     */
    public float getPeso(){
        return peso;
    }

    /**
     * Define um novo peso para a caixa.
     *
     * @param peso novo valor de peso da caixa.
     */
    public void setPeso(float peso){
        this.peso = peso;
    }
}
