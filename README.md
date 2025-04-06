# Simulador de Robô

> [English Version (en-US)](README.en.md)

## Sobre o Projeto
Este projeto foi desenvolvido como parte dos estudos de Programação Orientada a Objetos (POO) em Java, da Unidade II, Aula II (Estruturas de Decisão, Controle e Repetição) do curso de Engenharia de Software. O objetivo principal é **simular** o funcionamento de um robô em um ambiente 2D, utilizando classes, objetos e estruturas de decisão/repetição para demonstrar conceitos básicos de POO.

## Índice
1. [Tecnologias e Ferramentas](#tecnologias-e-ferramentas)  
2. [Objetivo do Projeto](#objetivo-do-projeto)  
3. [Funcionalidades Implementadas](#funcionalidades-implementadas)  
4. [Como Executar](#como-executar)  
5. [Futuras Melhorias](#futuras-melhorias)  
6. [Contribuição](#contribuição)  
7. [Contato](#contato)

---

## Tecnologias e Ferramentas
- **Java**: Versão 17  
- **Maven**: Versão 3.8.7 (ou superior)  
- **IDE**: Visual Studio Code  

---

## Objetivo do Projeto
- **Praticar conceitos de POO em Java**: criação de classes, objetos, construtores, métodos e atributos.  
- **Modelar entidades** (robô, caixa, mundo 2D), conforme o enunciado da atividade.  
- **Simular movimentos** do robô em formato de quadrado, manipulando coordenadas x e y.  
- **Demonstrar uso de estruturas de decisão** (`if/else`, `switch-case`) e laços de repetição aninhados (`for`).  

---

## Funcionalidades Implementadas

1. **Classe Mundo2D**  
   - [x] Representa a “sala” ou ambiente em que o robô se move, com dimensões x e y.

2. **Classe Caixa**  
   - [x] Modela caixas no ambiente, incluindo atributos como nome do item, quantidade e dimensões (altura, largura, peso, etc.).

3. **Classe Robo**  
   - [x] Possui posição (X, Y) e orientação (FRENTE, TRAS, DIREITA, ESQUERDA).  
   - [x] Método para movimentar-se (`move(int, int)`) e imprimir a posição (`printPosicao()`).  
   - [x] Estrutura de decisão para ajustar a orientação com base em entradas de teclado (w, a, s, d).

4. **Classe App (main)**  
   - [x] Contém dois laços `for` aninhados, controlando a direção e a quantidade de passos do robô.  
   - [x] Usa `switch-case` para deslocar o robô nos eixos (x, y), formando um quadrado.

---

## Como Executar

1. **Clonar ou baixar** este repositório:
   ```bash
   git clone https://github.com/rafaeloliveiralopes/SimuladorRobo.git
   cd SimuladorRobo
   ```
2. **Compilar** utilizando Maven ou uma IDE Java compatível.  
   - Exemplo com Maven no terminal:
     ```bash
     mvn clean install
     mvn exec:java -Dexec.mainClass="com.roboproject.App"
     ```
3. **Observar a saída** no console, conferindo as posições do robô em cada etapa do movimento.

---

## Futuras Melhorias

- [ ] **Integração efetiva entre orientação e movimento**: Em vez de coordenadas absolutas no `App.java`, o robô pode usar suas constantes (FRENTE, TRAS, etc.) para atualizar `X` e `Y` automaticamente.  
- [ ] **Limitar movimento ao Mundo2D**: Fazer com que o robô não ultrapasse as dimensões definidas no ambiente.  
- [ ] **Interação com objetos**: Criar métodos para o robô detectar e interagir com as caixas (por exemplo, pegar um item ou exibir dados da caixa).  
- [ ] **Entrada do usuário**: Permitir que o usuário controle a orientação do robô em tempo real (coletando dados via teclado dentro do `main` ou de uma interface gráfica).  
- [ ] **Testes Unitários**: Adicionar testes de unidade para validar as classes `Robo`, `Caixa` e `Mundo2D`.

---

## Contribuição
Com isso, o projeto **demonstra o uso de POO em Java** de forma clara e didática, servindo como um ponto de partida para outros projetos mais complexos no futuro.

Qualquer contribuição é bem-vinda. Sinta-se livre para abrir **issues** e **pull requests** com sugestões de melhorias ou correções.

---

## Contato
🔹 **Autor:** Rafael Oliveira Lopes  
🔹 **Email:** rafaellopes.dev@email.com  
🔹 **LinkedIn:** [LinkedIn](https://www.linkedin.com/in/rafael-lopes-desenvolvedor-fullstack/)  
🔹 **Site:** [Meu site](https://rafaellopes.dev)  
