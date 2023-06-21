package encapsulamento;

public class IdentidadeObjetos {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Anderson Oliveira", "991.847.714-88");
		Aluno a2 = new Aluno("Anderson Oliveira", "991.847.714-88");
		System.out.println(a1);
		System.out.println(a2);
		if(a1.equals(a2)) {
			System.out.println("Os objsetos são iguais");
		}else {
			System.out.println("Os objetos são diferentes");
		}
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println("Representação Padrão de um objeto: (string)");
		System.out.println(a1.toString());
	}

}
