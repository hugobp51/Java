package sextaRel01;

public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		Pessoa cliente = new Pessoa();
		cliente.nome = "John";
		cliente.sobrenome = "Snow";
		cliente.setCpf("11111111111");
		cliente.renda = 1500.0;
		
		c1.cliente = cliente;
		c1.setSaldo(2000.0);
		c1.setLimite(1000);
		c1.exibeInfo();
		c1.deposita(500);
		c1.saca(5000);
		c1.exibeInfo();
		
		Conta c2 = new Conta(new Pessoa(), 1000.0, 1000.0);
		c2.exibeInfo();
		c2.cliente.nome = "Qualquer";
		c2.cliente.sobrenome = "Coisa";
		c2.cliente.renda = 800.0;
		c2.exibeInfo();
		
		Conta c3 = new Conta(new Pessoa("Edkallenn", "Lima"), 1000, 1000);
		c3.exibeInfo();
		
		Pessoa p2 = new Pessoa("Yasmin", "Menezes");
		Conta c4 = new Conta(p2, 1000, 1000);
		c4.exibeInfo();
	}

}
