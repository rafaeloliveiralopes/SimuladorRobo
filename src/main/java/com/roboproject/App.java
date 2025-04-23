
package com.roboproject;

/**
 * Classe principal da aplicação responsável por interpretar os comandos passados via terminal
 * e iniciar a execução do robô conforme solicitado.
 *
 * @author Rafael
 * @version 1.0.0
 */

public class App {
    /**
     * Ponto de entrada da aplicação. Processa os argumentos de linha de comando e executa ações
     * com base no comando informado.
     *
     * @param args os argumentos passados via terminal (ex: "--move w a s d")
     */
    public static void main(String[] args) {
        if (args.length != 0) {
            String comando = args[0].toLowerCase();

            switch (comando) {
                case "--author":
                    System.out.println("Autor: Rafael O. Lopes");
                    break;
                case "--version":
                    System.out.println("Versão: 1.0.0");
                    break;
                case "--help":
                    System.out.println("Use os seguintes comandos:");
                    System.out.println("\t--author       Exibe o nome do autor");
                    System.out.println("\t--version      Exibe a versão do programa");
                    System.out.println("\t--help         Exibe esta mensagem");
                    System.out.println("\t--comands      Lista os comandos de movimento");
                    System.out.println("\t--move w a s d Move o robô conforme comandos");
                    break;
                case "--comands":
                    System.out.println("Lista de Comandos Aceitos:");
                    System.out.println("\tw: move o robô para frente");
                    System.out.println("\ta: move o robô para esquerda");
                    System.out.println("\td: move o robô para direita");
                    System.out.println("\ts: move o robô para trás");
                    System.out.println("\t0: sai da aplicação");
                    break;
                case "--move":
                    Robo robo = new Robo();
                    System.out.println("Movimentos agendados:");
                    robo.movimentosAgendados(args);
                    break;
                default:
                    System.out.println("Comando inválido");
                    break;
            }
            System.exit(0);
        }
    }
}

