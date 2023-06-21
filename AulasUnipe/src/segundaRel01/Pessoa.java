package segundaRel01;

public class Pessoa {
	public String nome;
	public String sobrenome;
	private String cpf;
	public double renda;
	
	public Pessoa(String nome, String sobrenome, String cpf, double renda) {		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.setCpf(cpf);
		this.renda = renda;
	}
	public Pessoa() {
		
	}
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String nomeCompleto() {
		return this.nome + " " + this.sobrenome; 
	}
	public void exibeNome() {
		System.out.println(this.nomeCompleto());
	}
	
	public void exibeInfo() {
		System.out.println("Cliente........: " + this.nomeCompleto());
		System.out.println("CPF:...........: " + this.getCpf());
		System.out.println("Renda..........: " + this.renda);
	}	

}
