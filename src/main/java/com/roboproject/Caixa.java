package com.roboproject;

public class Caixa {
    String nomeItem;
    int qtdItem;
    int posicaoX;
    int posicaoY;
    float peso;
    float comprimento;
    float largura;
    float altura;

    public Caixa(String nomeItem, int qtdItem, int posicaoX, int posicaoY, float peso, float comprimento, float largura, float altura) {
        this.nomeItem = nomeItem;
        this.qtdItem = qtdItem;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.peso = peso;
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }
}