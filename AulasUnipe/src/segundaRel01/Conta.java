package segundaRel01;

public class Conta {
	public int numero;
	public Pessoa titular;
	private double saldo;
	private double limite;
	//static int qtdeContas = 0;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
	this.numero = Conta.geraNumero();	this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}	
	
	public Conta() {
		this.numero = Conta.geraNumero();
		this.setLimite(100.0);
		//Conta.qtdeContas++;
	}
	
	private static int geraNumero() {
		return (int) (Math.random() * 1000 % 300);
	}
	public Conta(Pessoa p, double saldo, double limite) {
		this.numero = Conta.geraNumero();
		this.titular = p;
		this.setSaldo(saldo);
		this.setLimite(limite);
	}
	
	public void exibeSaldo() {
		System.out.println("Saldo atual.........: " + this.getSaldo());
		System.out.println("Limite..............: " + this.getLimite());
		System.out.println("==========================");
		double limiteTotal = this.getSaldo() + this.getLimite();
		System.out.println("Saldo com o limite..: " + limiteTotal);
	}
	
	public void exibeInfo() {
		System.out.println("Conta nº : " + this.numero);
		this.exibeTitular();
		System.out.println("==========================");
		this.exibeSaldo();
		System.out.println("");
	}
	public void exibeTitular() {
		System.out.println("Titular da Conta........: " + 
											this.titular.nomeCompleto());		
	}
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
		//this.setSaldo(valor + this.getSaldo());
	}
	
	public boolean saca(double valor) {
		if(valor <= (this.getSaldo() + this.getLimite())) {
			System.out.println("");
			this.saldo = this.saldo - valor;
			System.out.println("Saque de " + valor 
					                       + " realizado com sucesso!");
			System.out.println("");
			return true;
		}
		System.out.println("Não pode sacar " + valor);
		System.out.println("Saldo insuficiente!");
		return false;
	}
	
	
	
	
	
	
	
	

}
