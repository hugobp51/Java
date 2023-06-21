package sextaHeranca;

public class Medico extends Funcionario {
	
	public String crm;
	
	public Medico(String nome, String sobrenome, int idade,
			String dataAdmissao, String matricula, String crm) {
		super(nome, sobrenome, idade, dataAdmissao, matricula);
		this.crm = crm;
	}

	@Override
	public void exibeInfo() {		
		super.exibeInfo();
		System.out.println("CRM.........: " + this.crm);
	}

}
