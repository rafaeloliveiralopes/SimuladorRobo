
![Robot Project Banner](https://github.com/user-attachments/assets/4cfc9f99-497b-4120-9ee6-40d67677ed3e)

# Simulador de Robô

> [English Version (en-US)](README.en.md)

---

## Sobre o Projeto

Este projeto foi desenvolvido como parte dos estudos de Programação Orientada a Objetos (POO) em Java, da Unidade II, Aula II (Estruturas de Decisão, Controle e Repetição) do curso de Engenharia de Software. O objetivo principal é simular o funcionamento de um robô em um ambiente 2D, utilizando classes, objetos e estruturas de decisão/repetição para demonstrar conceitos básicos de POO.

---

## Índice

- [Tecnologias e Ferramentas](#tecnologias-e-ferramentas)
- [Objetivo do Projeto](#objetivo-do-projeto)
- [Funcionalidades Implementadas](#funcionalidades-implementadas)
- [Como Executar](#como-executar)
- [Modo Interativo](#modo-interativo)
- [Futuras Melhorias](#futuras-melhorias)
- [Contribuição](#contribuição)
- [Contato](#contato)

---

## Tecnologias e Ferramentas Utilizadas

- Java: Versão 17
- Maven: Versão 3.8.7
- IDE: IntelliJ IDEA

---

## Objetivo do Projeto

- Praticar conceitos de POO em Java: criação de classes, objetos, construtores, métodos e atributos.
- Modelar entidades (robô, caixa, mundo 2D), conforme o enunciado da atividade.
- Simular movimentos do robô em um plano bidimensional, manipulando coordenadas x e y.
- Demonstrar o uso de estruturas de decisão (`if/else`, `switch-case`) e laços de repetição (`while`, `for`).

---

## Funcionalidades Implementadas

### 🔹 Classe `Mundo2D`
- Representa o ambiente em que o robô se move, com dimensões x e y.

### 🔹 Classe `Caixa`
- Modela caixas no ambiente, com atributos como nome, quantidade e dimensões (altura, largura, peso, etc.).

### 🔹 Classe `Robo`
- Robô com posição (x, y), orientação (`FRENTE`, `TRAS`, `DIREITA`, `ESQUERDA`), velocidade, tração e carga.
- Métodos para movimentação e exibição de posição.
- Implementa lógica de movimento com base em entradas do teclado.

### 🔹 Classe `App` (main)
- Interpreta comandos da linha de comando (`--help`, `--author`, etc.).
- Possui **modo interativo**, acionado com `--move`, permitindo controle do robô em tempo real pelo teclado.

---

## Como Executar

### 🔹 Clonar o repositório:
```bash
git clone https://github.com/rafaeloliveiralopes/SimuladorRobo.git
cd SimuladorRobo
```

### 🔹 Compilar com Maven:
```bash
mvn clean compile
```

### 🔹 Executar com argumentos:
```bash
# Exibe o autor
java -cp target/classes com.roboproject.App --author

# Exibe os comandos disponíveis
java -cp target/classes com.roboproject.App --help
```

---

## Modo Interativo

### 🔹 Iniciar o modo interativo:
```bash
java -cp target/classes com.roboproject.App --move
```

### 🔹 Comandos disponíveis no modo interativo:
- `w` → move o robô para frente
- `a` → move o robô para esquerda
- `s` → move o robô para trás
- `d` → move o robô para direita
- `1` → mostra a posição atual do robô
- `0` → encerra o programa

### 🧠 Dica:
O modo interativo permite simular os movimentos do robô em tempo real, atualizando sua posição após cada entrada de comando.

---

## Futuras Melhorias

- **Limitação de movimento ao Mundo2D**: evitar que o robô ultrapasse os limites do ambiente.
- **Detecção de colisão com caixas**: permitir interação entre robô e objetos no cenário.
- **Interface gráfica (GUI)** para visualização dos movimentos.
- **Teste de unidades (JUnit)** para garantir o funcionamento das classes.

---

## Conclusão

Este projeto é uma aplicação prática dos principais conceitos de **Programação Orientada a Objetos (POO)** com Java, com base nos tópicos estudados no módulo:

- **Criação e uso de classes e objetos** (`Robo`, `Caixa`, `Mundo2D`);
- **Encapsulamento de atributos e métodos**, com uso de `getters` e `setters`;
- **Herança e abstração**, por meio das classes abstratas `RoboIdeia` e `CaixaIdeia`;
- **Uso de enums** para representar constantes (`Orientacao`);
- **Sobrescrita de métodos (`@Override`)** e uso de polimorfismo;
- **Construtores com sobrecarga**, demonstrando reutilização e especialização;
- **Controle de fluxo com estruturas `if`, `switch-case` e `while`**;
- **Leitura de entrada do usuário com `Scanner` para controle interativo via teclado**;
- **Formatação de saída com `System.out.printf` para exibir status formatado**;
- **Validação de argumentos e uso de exceções (`IllegalArgumentException`)**.

Além disso, o projeto pode ser expandido com novas funcionalidades como gráficos, colisões e testes unitários.

---

## Contato
🔹 **Autor:** Rafael Oliveira Lopes  
🔹 **Email:** rafaellopes.dev@email.com  
🔹 **LinkedIn:** [LinkedIn](https://www.linkedin.com/in/rafael-lopes-desenvolvedor-fullstack/)  
🔹 **Site:** [rafaellopes.dev](https://rafaellopes.dev)  

