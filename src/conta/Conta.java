package src.conta;

import src.cliente.Cliente;

public abstract class Conta implements InterfaceConta {

	//Atributos agencia, numero, saldo e cliente
	protected String agencia;
  protected String numero;
  protected double saldo;
  protected Cliente cliente;

	//Construtor que recebe agencia, numero e cliente
	public Conta(String agencia, String numero, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
		    this.cliente = cliente;
        this.saldo = 0.0;
	}

	//Metodo que retorna o saldo
	@Override
	public void sacar(double valor) {
		
		if (saldo >= valor) {
		  saldo -= valor;
		  System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
		}
		
		else {
      System.out.println("Saldo insuficiente.");
	  }
  }

	//Metodo que deposita um valor
	@Override
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
	}
	
	//Metodo que transfere um valor de uma conta para outra
	@Override
	public void transferir(double valor, InterfaceConta contaDestino) {

		if (saldo >= valor) {
			saldo -= valor;
		  contaDestino.depositar(valor);
    System.out.println("Transferência de R$ " + valor + " realizada com sucesso.")
	  }
		
		else {
			System.out.println("Saldo insuficiente.");
		}
	}

	//Metodo que imprime as informações da conta
	@Override
    public void imprimirInformacoes() {
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo: R$ " + saldo);
		}
	
}
