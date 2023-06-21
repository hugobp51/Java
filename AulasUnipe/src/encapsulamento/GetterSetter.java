package encapsulamento;

public class GetterSetter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("João das Neves", "111.111.111-11");
		a1.curso = "Análise e Desenvolvimento de Sistemas";
		a1.setMensalidade(519.0);
		a1.setTelefone("83 98787-6544");
		System.out.println(a1);
		System.out.println(a1.curso);
		System.out.println(a1.getMensalidade());
		System.out.println(a1.getTelefone());

	}

}
