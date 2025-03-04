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
	  john.setCpf("111.111.111-11");	
		
		Cliente jane = new Cliente();
		jane.setNome("Jane Doe");
		jane.setCpf("222.222.222-22");
		
		
		Conta johncorrente = new ContaCorrente(john);
		
		Conta johnpoupanca = new ContaPoupanca(john);

		johncorrente.depositar(100);
		johncorrente.transferir(100, johnpoupanca);
		
		johncorrente.imprimirExtrato();
		johnpoupanca.imprimirExtrato();
	}

}