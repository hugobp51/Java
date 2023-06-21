package segHeranca;

public class TestaFuncionario {

	public static void main(String[] args) {		
		Pessoa p1 = new Pessoa("John", "Leno", 18 );
		p1.exibeInfo();
		
		Funcionario f1 = new Funcionario("Vinicius", "Alves", 22, 
				"14/11/2022", 123);
		f1.exibeInfo();
		
		Medico m1 = new Medico("Almir", "Menezes", 19, "14/11/2022",
				 11010, "22PB");
		m1.exibeInfo();
		m1.operar();
		
		Pessoa f2 = new Funcionario("John", "Snow", "12/12/2222", 123);
		Pessoa m2 = new Medico("Contardo", "Caligaris", "CB13");
	}

}
