package segundaRel01;

public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Pessoa cliente = new Pessoa();
		
		cliente.nome = "Heloysa";
		cliente.sobrenome = "Assis";
		cliente.setCpf("111.111.111-11");
		cliente.renda = 5500.0;
		
		c1.titular = cliente;
		c1.setSaldo(2000.0);
		c1.exibeInfo();
		c1.saca(400.0);
		c1.exibeInfo();
		
		Conta c2 = new Conta(new Pessoa("John", "Snow"), 1000, 1000);
		c2.exibeInfo();
		
		Conta c3 = new Conta(new Pessoa(), 1000, 2000);
		c3.titular.nome = "Daenerys";
		c3.titular.sobrenome = "Targaryen";
		c3.titular.setCpf("666.666.666-69");
		c3.titular.renda = 100000;
		c3.exibeInfo();
		
	}

}
