package src.main;

import src.conta.Conta;

import src.conta.InterfaceConta;

import src.conta.ContaCorrente;

import src.conta.ContaPoupanca;

import src.banco.Banco;

import src.cliente.Cliente;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		// Criando uma instância de Banco
		Banco banco = new Banco("Banco Central");

		//Criando duas instâncias de Cliente
		Cliente john = new Cliente("John Smith","111.111.111-11");	
		
		Cliente jane = new Cliente("Jane Doe", "222.222.222-22");

		//Adicionando os clientes ao banco
		banco.adicionarCliente(john);
  
		banco.adicionarCliente(jane);

		//Criando duas instâncias de Conta com as informações dos clientes
		ContaCorrente contaCorrenteJohn = new ContaCorrente("001", "12345", john, 500.0);
    
		ContaPoupanca contaPoupancaJane = new ContaPoupanca("001", "54321", jane, 3.0);
		

		//Fazendo depósitos, saque, aplicação de juros e transferências nas contas
contaCorrenteJohn.depositar(1000.0);
  
		contaPoupancaJane.depositar(500.0);

		contaCorrenteJohn.sacar(200.0);

		contaPoupancaJane.aplicarJuros();
		contaCorrenteJohn.transferir(100.0, contaPoupancaJane);

		//Imprimindo os dados dos clientes e suas contas
	  banco.imprimirClientes();
        contaCorrenteJohn.imprimirInformacoes();
        contaPoupancaJane.imprimirInformacoes();
	}
		
}