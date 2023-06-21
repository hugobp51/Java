package encapsulamento;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Vinicius A.", "9876554611");
		Pessoa p2 = new Pessoa("Vinicius Alves", "9876554611");
		Aluno aluno = new Aluno();
		
		aluno.nome = "Nayane da Silva";
		aluno.setCpf("1111111111");
		aluno.setMensalidade(1400);
		System.out.println(aluno);
		
		p2.setCpf("12343212311");
		System.out.println(p2.getCpf());
		
		System.out.println(p1.toString());
		System.out.println(p2);
		
		if(p1.equals(p2)) {
			System.out.println("São iguais!");
		}else {
			System.out.println("São diferentes!");
		}
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		

	}

}
