package sextaHeranca;

public class TestaPaciente {

	public static void main(String[] args) {
		Paciente p1 = new Paciente("John", "Snow", 34, "11/11/2022");
		p1.exibeInfo();
		
		Pessoa p2 = new Pessoa("Daenerys", "Targaryen", 28);
		p2.exibeInfo();
		
		Funcionario f1 = new Funcionario("John", "Textor", "11/11/2022", "A223");
		f1.exibeInfo();
		
		Funcionario m1 = new Medico("Drauzio", "Varíola", 72, "11/11/2022", "A22321", "001A2");
		m1.exibeInfo();
	}

}
