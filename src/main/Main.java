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

		Banco banco = new Banco("Banco Central");
		
		Cliente john = new Cliente("John Smith","111.111.111-11");	
		
		Cliente jane = new Cliente("Jane Doe", "222.222.222-22");

		banco.adicionarCliente(john);
  
		banco.adicionarCliente(jane);

		ContaCorrente contaCorrenteJohn = new ContaCorrente("001", "12345", john, 500.0);
    
		ContaPoupanca contaPoupancaJane = new ContaPoupanca("001", "54321", jane, 3.0);
		

contaCorrenteJohn.depositar(1000.0);
  
		contaPoupancaJane.depositar(500.0);

		contaCorrenteJohn.sacar(200.0);

		contaPoupancaJane.aplicarJuros();
		contaCorrenteJohn.transferir(100.0, contaPoupancaJane);

	banco.imprimirClientes();
        contaCorrenteJohn.imprimirInformacoes();
        contaPoupancaJane.imprimirInformacoes();
	}
		
}
