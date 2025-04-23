
package com.roboproject;

import java.util.Scanner;

/**
 * Classe principal da aplicação responsável por interpretar os comandos passados via terminal
 * e iniciar a execução do robô conforme solicitado.
 * Comandos disponíveis:
 * - w/a/s/d: movimentam o robô
 * - 1: exibe a posição atual
 * - 0: encerra o programa
 *
 * @author Rafael
 * @version 1.0.0
 */

public class App {
    /**
     * Ponto de entrada da aplicação. Interpreta os comandos fornecidos via terminal
     * e executa a ação correspondente, incluindo o controle interativo do robô.
     *
     * @param args argumentos passados na execução do programa.
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
                    System.out.println("\t--commands     Lista os comandos de movimento");
                    System.out.println("\t--move         Entra no modo interativo de controle do robô");
                    break;
                case "--commands":
                    System.out.println("Lista de Comandos Aceitos:");
                    System.out.println("\tw: move o robô para frente");
                    System.out.println("\ta: move o robô para esquerda");
                    System.out.println("\td: move o robô para direita");
                    System.out.println("\ts: move o robô para trás");
                    System.out.println("\t0: sai da aplicação");
                    break;
                case "--move":
                    iniciarModoInterativo();
                    break;
                default:
                    System.out.println("Comando inválido. Use --help para ver os comandos disponíveis.");
                    break;
            }
        } else {
            System.out.println("Nenhum argumento fornecido. Use --help para ver os comandos disponíveis.");
        }
    }

    /**
     * Inicia o modo interativo de controle do robô, permitindo que o usuário
     * envie comandos pelo teclado em tempo real.
     */
    private static void iniciarModoInterativo() {
        Robo robo = new Robo();
        Scanner scanner = new Scanner(System.in);
        String comando;

        System.out.println("""
                Modo interativo ativado: digite w - frente | a - esquerda | s - trás | d - direita
                        1 - mostra a posição atual
                        0 - sair""");

        while (true) {
            System.out.print("> ");
            comando = scanner.nextLine().toLowerCase();

            switch (comando) {
                case "0" -> {
                    System.out.println("Encerrando o modo interativo...");
                    scanner.close();
                    return;
                }
                case "1" -> robo.showPos();
                case "w", "a", "s", "d" -> {
                    char tecla = comando.charAt(0);
                    System.out.println("Tecla: " + tecla);
                    System.out.println("Descrição: " + robo.descricaoDoMovimento(tecla));
                    robo.setOrientacao(tecla);
                    robo.showPos();
                }
                default -> System.out.println("Comando inválido. Use w, a, s, d, 1 ou 0.");
            }
        }
    }
}