package com.roboproject;

/**
 * Classe que representa um robô e suas ações em um ambiente 2D.
 * Estende RoboIdeia, implementando movimentos e propriedades específicas.
 *
 * @author Rafael Lopes
 * @version 1.0
 */
public class Robo extends RoboIdeia {

    private float velocidade = 1;
    private final float velocidadeMax = 5;
    private final float pesoCargaMax = 13;
    private final String tipoTracao = "esteira";
    private final int altura = 20;
    private final int largura = 40;

    /**
     * Construtor padrão da classe Robo.
     */
    public Robo() {
        super.nome = "R-ATM";
        super.peso = 10;
        super.posicaoX = 20;
        super.posicaoY = 20;
    }

    /**
     * Construtor com nome personalizado do robô.
     *
     * @param nome Nome do robô.
     */
    public Robo(String nome) {
        this(nome, 10, 20, 20);
    }

    /**
     * Construtor com nome e peso personalizados.
     *
     * @param nome Nome do robô.
     * @param peso Peso do robô em kg.
     */
    public Robo(String nome, float peso) {
        this(nome, peso, 20, 20);
    }

    /**
     * Construtor com posição inicial personalizada.
     *
     * @param posX Posição inicial no eixo X.
     * @param posY Posição inicial no eixo Y.
     */
    public Robo(float posX, float posY) {
        this("R-ATM", 20, posX, posY);
    }

    /**
     * Construtor completo do robô.
     *
     * @param nome Nome do robô.
     * @param peso Peso do robô em kg.
     * @param posX Posição inicial no eixo X.
     * @param posY Posição inicial no eixo Y.
     */
    public Robo(String nome, float peso, float posX, float posY) {
        super.nome = nome;
        super.peso = peso;
        super.posicaoX = posX;
        super.posicaoY = posY;
    }

    @Override
    public void move(float posX, float posY) {
        if (Float.isNaN(posX) || Float.isNaN(posY)
                || Float.isInfinite(posX) || Float.isInfinite(posY)) {
            throw new IllegalArgumentException("Argumento inválido");
        }
        super.posicaoX = posX;
        super.posicaoY = posY;
    }

    @Override
    public void moveX(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Argumento inválido");
        }
        super.posicaoX += dist;
    }

    @Override
    public void moveY(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Argumento inválido");
        }
        super.posicaoY += dist;
    }

    /**
     * Define a orientação e move o robô conforme tecla pressionada.
     *
     * @param tecla tecla pressionada para orientação ('w', 'a', 's', 'd').
     */
    public void setOrientacao(char tecla) {
        switch (tecla) {
            case 'w' -> { orientacao = Orientacao.FRENTE; moveY(velocidade); }
            case 's' -> { orientacao = Orientacao.TRAS; moveY(-velocidade); }
            case 'a' -> { orientacao = Orientacao.ESQUERDA; moveX(-velocidade); }
            case 'd' -> { orientacao = Orientacao.DIREITA; moveX(velocidade); }
            default -> throw new IllegalArgumentException("Tecla inválida");
        }
    }

    /**
     * Executa movimentos agendados usando uma sequência de comandos.
     *
     * @param moves comandos de movimento.
     */
    public void movimentosAgendados(String... moves) {
        for (String tecla : moves) {
            if (!tecla.equals("--move") && !tecla.equals("-m")) {
                System.out.println("Tecla: " + tecla);
                System.out.println("Descrição: " + descricaoDoMovimento(tecla.charAt(0)));
                setOrientacao(tecla.charAt(0));
                showPos();
            }
        }
    }

    /**
     * Retorna uma descrição textual do movimento.
     *
     * @param tecla tecla representando o movimento.
     * @return descrição do movimento.
     */
    public String descricaoDoMovimento(char tecla) {
        return switch (tecla) {
            case 'w' -> "Movendo para frente";
            case 'a' -> "Movendo para esquerda";
            case 's' -> "Movendo para trás";
            case 'd' -> "Movendo para direita";
            default -> "Tecla não reconhecida";
        };
    }

    /**
     * Imprime o estado interno atual do robô.
     */
    public void printStatus() {
        System.out.printf("""
            -----------Info %s----------
            Nome do Robô: %s
            Peso do Robô: %.2f kg
            Velocidade Máxima: %.2f m/s
            Carga Máxima: %.2f kg
            Tipo de Tração: %s
            Posição X: %.2f
            Posição Y: %.2f
            -------------------------------
            """, nome, nome, peso, velocidadeMax, pesoCargaMax, tipoTracao, posicaoX, posicaoY);
    }

    /**
     * Imprime a posição atual do robô.
     */
    public void showPos() {
        System.out.printf("(x, y) = (%.2f, %.2f)%n", posicaoX, posicaoY);
    }

    @Override
    public String toString() {
        return String.format("Robo{posicaoX=%.2f, posicaoY=%.2f, orientacao=%s}",
                posicaoX, posicaoY, orientacao);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Robo robo) {
            return nome.equals(robo.nome);
        }
        return false;
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public int getPosicaoX() {
        return (int)this.posicaoX;
    }

    public int getPosicaoY() {
        return (int)this.posicaoY;
    }

    public void setPosicaoX(float posicaoX) {
        this.posicaoX = posicaoX;
    }

    public void setPosicaoY(float posicaoY) {
        this.posicaoY = posicaoY;
    }
}
