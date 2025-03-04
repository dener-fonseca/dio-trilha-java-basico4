package src.conta;

import src.cliente.Cliente;

public class ContaCorrente extends Conta {

    // Atributo limite
	private double limite;

    // Construtor que recebe a agencia, o numero, o cliente e o limite
    public ContaCorrente(String agencia, String numero, Cliente cliente, double limite) {
        super(agencia, numero, cliente);
        this.limite = limite;
	}

    // Método que faz o saque da conta corrente se o valor do saque for menor ou igual ao limite
    @Override
    public void sacar(double valor) {
        
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } 
        
        else {
            System.out.println("Saldo insuficiente.");
        }
    }

    //Metodo que imprime os dados da conta corrente, incluindo o limite
    @Override
	public void imprimirInformacoes() {
		System.out.println("=== Extrato da Conta Corrente ===");
		super.imprimirInformacoes();
        System.out.println("Limite de Crédito: R$ " + limite);
	}
	
}