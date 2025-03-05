package src.cliente;

public class Cliente {

	//Atributos nome e cpf
	private String nome;
  private String cpf;

	//Construtor que recebe nome e cpf
	public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
	}

	//Getter de nome
	public String getNome() {
		return nome;
	}

	//Getter de cpf
	public String getCpf() {
		return cpf;
	}

}