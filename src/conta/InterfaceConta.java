package src.conta;

public interface InterfaceConta {

	//Metodos abstratos sacar, depositar, transferir e imprimir informações 
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, InterfaceConta contaDestino);
	
	void imprimirInformacoes();
}