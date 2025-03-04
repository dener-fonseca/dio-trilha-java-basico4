package src.banco;

import src.conta.Conta;
import src.cliente.Cliente;

import java.util.List;
import java.util.ArrayList;

public class Banco {

	//Atributos nome e lista de clientes
	private String nome;
	private List<Cliente> clientes;

	//Construtor que recebe nome e lista de clientes
	public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
	}

	//Metodo que adiciona um cliente na lista de clientes
	public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
	}

	//Metodo para imprimir os clientes
	public void imprimirClientes() {
        System.out.println("Clientes do Banco " + nome + ":");
        for (Cliente cliente : clientes) {
            System.out.println("- " + cliente.getNome() + " (CPF: " + cliente.getCpf() + ")");
				}
	}
}