package sextaRel01;

public class Conta {
	public int numero;
	public Pessoa cliente;
	private double saldo;
	private double limite;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
	}
	
	public static int geraNumero() {
		return (int) (Math.random() * 1000 % 300);
	}

	
	public Conta(Pessoa p, double saldo, double limite) {
		this.numero = Conta.geraNumero();
		this.cliente = p;
		this.setSaldo(saldo);
		this.setLimite(limite);
	}

	public void exibeSaldo() {
		System.out.println("Saldo atual.........:" + this.getSaldo());
		System.out.println("Limite..............:" + this.limite);
		System.out.println("==========================");
		double limiteTotal = this.saldo + this.limite;
		System.out.println("Saldo com o limite..:" + limiteTotal);
	}

	public void exibeInfo() {
		System.out.println("Conta nº : " + this.numero);
		this.exibeTitular();
		System.out.println("==========================");
		this.exibeSaldo();
		System.out.println("");
	}

	private void exibeTitular() {
		System.out.println("Titular da Conta........: " + this.cliente.nomeCompleto());

	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (valor <= (this.getSaldo() + limite)) {
			System.out.println("");
			this.saldo -= valor;
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
