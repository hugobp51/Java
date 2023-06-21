package classesObjetos;

public class Cachorro {
	//atributos
	public String nome;
	public int idade;
	public String raca;
	public char sexo;
	public double peso;		
	
	//m�todos
	//construtor
	

	public void latir() {
		System.out.println(this.nome + " est� latindo!");
	}
	public Cachorro(String nome, int idade, String raca, char sexo, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.sexo = sexo;
		this.peso = peso;
	}	
	public Cachorro() {
	}
	
	public Cachorro(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	
	public Cachorro(String nome) {
		this.nome = nome;
	}
	public void passear() {
		System.out.println(this.nome + " est� passeando!");
	}
	public void comer() {
		System.out.println(nome + " est� comendo!");
	}
	
	public void exibeDados() {
		System.out.println("");
		System.out.println("==================");
		System.out.println("Nome:.....: " + nome);
		System.out.println("Idade:....: " + idade);
		System.out.println("Sexo:.....: " + sexo);
		System.out.println("Ra�a:.....: " + raca);
		System.out.println("Peso:.....: " + peso);
		System.out.println("==================");	
	}


}
