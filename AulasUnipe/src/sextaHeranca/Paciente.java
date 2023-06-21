package sextaHeranca;

public class Paciente extends Pessoa {
	protected String dataInternacao;

	public Paciente(String nome, String sobrenome, int idade, String data) {
		super(nome, sobrenome, idade);
		this.dataInternacao = data;
	}

	public Paciente(String nome, String sobrenome, String dataInternacao) {
		super(nome, sobrenome);
		this.dataInternacao = dataInternacao;
	}

	public Paciente(String dataInternacao) {
		this.dataInternacao = dataInternacao;
	}

	public Paciente() {
	}

	@Override
	public void exibeInfo() {
		System.out.println("\nDados de: " + super.nomeCompleto());
		super.exibeInfo();
		System.out.println("Data de Internação.: " + this.dataInternacao);
	}
	
	
	
	

}
