package segHeranca;

public class Medico extends Funcionario {
	public String crm;

	public Medico(String nome, String sobrenome, int idade, String dataAdmissao, int matricula, String crm) {
		super(nome, sobrenome, idade, dataAdmissao, matricula);
		this.crm = crm;
	}
	
	public Medico(String nome, String sobrenome, String crm) {
		super(nome, sobrenome);
		this.crm = crm;
		
	}

	@Override
	public void exibeInfo() {		
		super.exibeInfo();
		System.out.println("CRM..........: " + this.crm);
		System.out.println("Essa pessoa � um m�dico");
	}
	
	public void operar(){
		System.out.println("O m�idco " + this.nomeCompleto() + 
				" est� operando");
	}
	
	public void operar(Pessoa p1) {
		
	}
	
	

}
