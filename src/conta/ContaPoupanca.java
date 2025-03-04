package src.conta;

import src.cliente.Cliente;

public class ContaPoupanca extends Conta {

	// Atributo taxa de juros
	private double taxaJuros;

	// Construtor que recebe a agencia, o numero, o cliente e a taxa de juros
	public ContaPoupanca(String agencia, String numero, Cliente cliente, double taxaJuros) {
		super(agencia, numero, cliente);
		this.taxaJuros = taxaJuros;
	}

	//Metodo que calcula o valor do juros e atualiza o saldo da conta
	public void aplicarJuros() {
        saldo += saldo * (taxaJuros / 100);
        System.out.println("Juros aplicados.");
	}
	
  //Metodo que imprime os dados da conta poupanca, incluindo a taxa de juros
	@Override
	public void imprimirInformacoes() {
		System.out.println("=== Extrato da Conta Poupança ===");
		super.imprimirInformacoes();
		System.out.println("Taxa de Juros: " + taxaJuros + "%");
	}
}