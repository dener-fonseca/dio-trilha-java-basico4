Banco Projeto - DIO

Este é um projeto de um sistema bancário simples, desenvolvido para a prática de conceitos de programação orientada a objetos e outras habilidades em Java. O objetivo deste projeto foi melhorar um código previamente proposto pelo professor da escola Dio, aplicando técnicas de modelagem de classes, manipulação de listas, abstração e implementação de interfaces.


---

🛠 Tecnologias e Conceitos Utilizados

Java: Linguagem principal do projeto.

Classes e Objetos: Utilização de classes para representar o banco, clientes, contas e suas operações.

Interface: Definição de comportamentos comuns através da interface InterfaceConta.

Herança: Utilização de herança para criar diferentes tipos de contas, como ContaCorrente e ContaPoupanca.

Listas: Manipulação de listas para armazenar e gerenciar os clientes do banco.



---

📋 Descrição

O projeto consiste em um sistema bancário simples com funcionalidades como:

Cadastro de Clientes: Onde você pode adicionar clientes ao banco.

Contas Bancárias: Clientes podem ter contas do tipo Conta Corrente ou Conta Poupança.

Operações Bancárias: É possível realizar operações como saques, depósitos e transferências entre contas.

Impressão de Informações: O sistema imprime as informações dos clientes e contas ao final de cada operação.



---

📂 Estrutura do Projeto

A estrutura do projeto está organizada da seguinte forma:

dio-trilha-java-basico4/
│── src/
│   ├── banco/
│   │   ├── Banco.java
│   ├── cliente/
│   │   ├── Cliente.java
│   ├── conta/
│   │   ├── Conta.java
│   │   ├── ContaCorrente.java
│   │   ├── ContaPoupanca.java
│   │   ├── InterfaceConta.java
│   ├── Main.java

banco/Banco.java: Classe que representa o banco e contém a lista de clientes.

cliente/Cliente.java: Classe que contém as informações do cliente, como nome e CPF.

conta/Conta.java: Classe abstrata que serve como base para as contas.

conta/ContaCorrente.java: Classe que representa a conta corrente e herda da classe Conta.

conta/ContaPoupanca.java: Classe que representa a conta poupança e herda da classe Conta.

conta/InterfaceConta.java: Interface que define os métodos essenciais das contas, como sacar, depositar e transferir.

Main.java: Classe principal que executa o código, cria os objetos e realiza as operações.



---

🏃‍♂️ Como Rodar o Projeto

Pré-requisitos

Certifique-se de ter o Java instalado em sua máquina. Você pode verificar isso digitando o seguinte comando no terminal:

java -version

Se o Java não estiver instalado, você pode baixar e instalar o JDK.

Passos para rodar o projeto

1. Clone o repositório ou baixe os arquivos do projeto:

Se você estiver usando o Git:

git clone https://github.com/Dener-Fonseca/dio-trilha-java-basico4.git


2. Navegue até o diretório do projeto:

cd BancoProjeto


3. Compile o projeto: Se estiver usando o terminal, compile o código com o seguinte comando:

javac src/main/java/Main.java


4. Execute o código: Para rodar o programa, use o seguinte comando:

java src.main.java.Main

Isso iniciará a execução do código e você verá a saída no console com as operações realizadas.




---

📌 Objetivo do Projeto

Este projeto foi desenvolvido com o objetivo de:

Praticar conceitos de orientação a objetos, como classes, objetos, herança, interfaces e abstração.

Melhorar um código existente proposto pelo professor da Dio, adicionando novas funcionalidades e refatorando a estrutura de classes.

Aprender a trabalhar com listas e manipular dados de maneira eficiente.



---

✍️ Contribuindo

Se você deseja contribuir com melhorias ou novos recursos para o projeto, siga estas etapas:

1. Faça o fork do repositório.


2. Crie uma nova branch para a sua modificação:

git checkout -b minha-nova-funcionalidade


3. Faça as alterações e envie um pull request.




---

📞 Contato

Este projeto foi desenvolvido por Dener Xisto da Fonseca como parte dos estudos na escola Dio. Para dúvidas ou sugestões, entre em contato:

Email: darkx@hotmail.com.br

LinkedIn: https://www.linkedin.com/in/dener-fonseca