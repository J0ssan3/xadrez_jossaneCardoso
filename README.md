# ♟️ Jogo de xadrez em Java

Este projeto é uma implementação simples do jogo de **Xadrez em Java**, utilizando **JOptionPane** para a interação com usuário. O objetivo foi práticar **conce itos de Progamação Orietada a Objetos (POO)**, como herança, polimorfismo, abstração e encapsulamento, além da **manipulação de arrays bidimensionais**.

---
## 🧠 Objetivo do Projeto
Criar um jogo de xadrez funcional que permita:
- Exibir o tabuleiro e suas peças;
- Movimentar peças válidas conforme suas regras básicas;
- Praticar lógica de programação e estruturação de classes em Java;
- Simular jogadas entre dois jogadores.

---
## ⚙️ Como Executar o Projeto
1. Abra o **Eclipse** (ou qualquer IDE Java).
2. Importe o projeto ou crie um novo projeto Java.
3. Adicione os arquivos na estrutura acima.
4. Execute o arquivo `Main.java`.
5. As interações ocorrerão por meio de **JOptionPane**, onde você poderá:
- Escolher a peça e a posição inicial;
- Informar a posição de destino;
- Visualizar o tabuleiro atualizado após cada jogada.

---
## 🧱 Principais Classes
- **`ChessBoard`** → Representa o tabuleiro (8x8). Possui métodos como `movePiece()` e `display()`.
- **`Piece`** → Classe abstrata base para todas as peças. Define o comportamento e o símbolo de exibição.
- **Subclasses (`Pawn`, `Rook`, `Knight`, etc.)** → Implementam os movimentos específicos de cada peça.
- **`Game`** → Controla o fluxo da partida e a alternância entre os jogadores.
- **`PlayerColor`** → Enumeração que define as cores `WHITE` e `BLACK`.

---

## 🧩 Conceitos de POO Utilizados
- **Herança:** todas as peças herdam da classe `Piece`.
- **Polimorfismo:** o método `getSymbol()` é sobrescrito em cada tipo de peça.
- **Encapsulamento:** o tabuleiro e as peças possuem atributos privados.
- **Abstração:** `Piece` é uma classe abstrata que serve de modelo.

---
## 🚀 Tecnologias Utilizadas
- **Java 17+**
- **JOptionPane (javax.swing)**
- **Eclipse IDE**
- **Git e GitHub**

---
## 👩‍💻 Autora
**Jossane Cardoso**
- 📚 Graduada em Análise e Desenvolvimento de Sistemas 
- 💻 Focada na área de Desenvolvimento backend

---
## 🏁 Licença
Este projeto é de uso livre para fins educacionais.  
Sinta-se à vontade para clonar, modificar e estudar o código. 
