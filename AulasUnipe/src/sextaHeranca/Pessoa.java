package sextaHeranca;

public class Pessoa {
	public String nome;	
	public String sobrenome;
	public int idade;
	
	public Pessoa(String nome, String sobrenome, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Pessoa() {
	}
	
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String nomeCompleto() {
		return this.nome + " " + this.sobrenome;
	}
	
	public void exibeInfo() {	
		System.out.println("");
		System.out.println("Nome........: " + this.nome);
		System.out.println("Sobrenome...: " + this.sobrenome);
		System.out.println("Idade.......: " + this.idade);
		
	}

}
