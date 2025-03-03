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
		
		Cliente john = new Cliente();
		john.setNome("John Smith");
		
		Conta corrente = new ContaCorrente(john);
		
		Conta poupanca = new ContaPoupanca(john);

		corrente.depositar(100);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}