package encapsulamento;

public class Pessoa {
	public String nome;
	public String sobrenome;
	private String cpf;
	public double salario;
	public String telefone;

	public Pessoa(String nome, String sobrenome, String cpf, double salario, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.salario = salario;
		this.telefone = telefone;
	}

	public Pessoa() {
	}

	public Pessoa(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Pessoa qualquer = (Pessoa) obj;
		return this.cpf == qualquer.cpf;		
	}

	@Override
	public String toString() {
		String mensagem = "=======================\n";
		mensagem+="Pessoa: " + this.nome + "\nCPF: " + this.cpf;
		mensagem+="\n=======================";
		return mensagem;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	

}
