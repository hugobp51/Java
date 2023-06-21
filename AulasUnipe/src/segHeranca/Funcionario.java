package segHeranca;

public class Funcionario extends Pessoa {
	public String dataAdmissao;
	public int matricula;
	
	public Funcionario(String nome, String sobrenome, int idade,
			String dataAdmissao, int matricula) {
		
		super(nome, sobrenome, idade);
		this.dataAdmissao = dataAdmissao;
		this.matricula = matricula;
	}
	
	public Funcionario(String nome, String sobrenome, String dataAdmissao, int matricula) {
		super(nome, sobrenome);
		this.dataAdmissao = dataAdmissao;
		this.matricula = matricula;
	}

	public Funcionario(String nome, String sobrenome, int idade) {
		super(nome, sobrenome, idade);
		
	}	

	public Funcionario(String nome, String sobrenome) {
		super(nome, sobrenome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exibeInfo() {
	System.out.println("\nDados do Funcionário: " + super.nomeCompleto());
	super.exibeInfo();
	System.out.println("Data de admissão.......: " + this.dataAdmissao);
	System.out.println("Matrícula..............: " + this.matricula);
	System.out.println("=======================");
	}
	
	
	

}
