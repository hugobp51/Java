package sextaHeranca;

public class Funcionario extends Pessoa {
	public String dataAdmissao;
	public String matricula;
	
	public Funcionario(String nome, String sobrenome, int idade, String dataAdmissao, String matricula) {
		super(nome, sobrenome, idade);
		this.dataAdmissao = dataAdmissao;
		this.matricula = matricula;
	}
	public Funcionario(String nome, String sobrenome, String dataAdmissao, String matricula) {
		super(nome, sobrenome);
		this.dataAdmissao = dataAdmissao;
		this.matricula = matricula;
	}
	public Funcionario(String nome, String dataAdmissao, String matricula) {
		super(nome);
		this.dataAdmissao = dataAdmissao;
		this.matricula = matricula;
	}
	
	@Override
	public void exibeInfo() {
		System.out.println("\nDados do Funcionário: " + super.nomeCompleto());
		super.exibeInfo();
		System.out.println("Data de Admissão..: " + this.dataAdmissao);
		System.out.println("Matrícula.........: " + this.matricula);
		System.out.println("=======================");
	}
	
	

}
