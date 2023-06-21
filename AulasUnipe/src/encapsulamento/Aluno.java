package encapsulamento;

public class Aluno {
	public String nome;
	private String cpf;
	public String curso;
	private double mensalidade;
	private String telefone;

	@Override
	public boolean equals(Object obj) {
		// if (obj instanceof Aluno) {
		Aluno qualquer = (Aluno) obj;
		return this.cpf == qualquer.cpf;
		// }
		// return false;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		String mensagem = "===================\nAluno: " + this.nome + "\nCPF: " + this.cpf;
		mensagem += "\n===================";
		return mensagem;
	}

	public Aluno(String nome, String cpf, String curso, double mensalidade, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.curso = curso;
		this.mensalidade = mensalidade;
		this.telefone = telefone;
	}

	public Aluno() {
	}

	public Aluno(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Aluno(String nome, String curso, double mensalidade) {
		this.nome = nome;
		this.curso = curso;
		this.mensalidade = mensalidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

}
