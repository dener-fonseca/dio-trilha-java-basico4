package src.banco;

import src.conta.Conta;

import java.util.List;

public class Banco {

	private String nome;

	private int numero;
	
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return nome;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setConta(List<Conta> contas) {
		this.contas = contas;
	}

}