package br.com.abc.javacore.parte03_introducaometodos.test;

import br.com.abc.javacore.parte03_introducaometodos.classes.Professor;

public class ProfessorTest
{
	public static void main(String[] args)
	{
		Professor professor1 = new Professor();
		professor1.cpf = "1457854";
		professor1.matricula = "47811654";
		professor1.nome = "Joana";
		professor1.rg = "154876";
		//
		Professor professor2 = new Professor();
		professor2.cpf = "46549789";
		professor2.matricula = "557874654";
		professor2.nome = "Paulo";
		professor2.rg = "456578916";
		// System.out.println(professor1.nome);
		// System.out.println(professor1.cpf);
		// System.out.println(professor1.rg);
		// System.out.println(professor1.matricula);
		// System.out.println("-----------------------------");
		//
		// Para evitar repetição de código, iremos imprimir no método do
		// professor
		// professor1.imprimeProfessor(professor1);
		// professor1.imprimeProfessor(professor2);
		// professor1 é um objeto do tipo Professor com as características
		// descritas.
		// professor2 faz referência a outra objeto (Joana) e que podem chamar
		// atributos(características) e métodos(comportamentos) já são derivados
		// da mesma classe. Então professor1 e professor2 são variáveis de
		// referência.
		//
		// Outra forma de fazer sem erros seria:
		// professor1.imprimeProfessor(professor1);
		// professor2.imprimeProfessor(professor2);
		// quem executa os métodos são os objetos e não os métodos. Por isso não
		// tem diferença, já que executa é o objeto do tipo professor.
		// System.out.println("Dentro de professor test");
		// System.out.println(professor1.nome);
		// professor1.imprimeProfessor(professor1);
		// System.out.println(professor1.nome);
		professor1.imprimeProfessor();
		professor2.imprimeProfessor();
	}
}