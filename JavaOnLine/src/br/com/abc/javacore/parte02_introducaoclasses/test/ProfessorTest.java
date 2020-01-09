package br.com.abc.javacore.parte02_introducaoclasses.test;

import br.com.abc.javacore.parte02_introducaoclasses.classes.Professor;

public class ProfessorTest
{
	public static void main(String[] args)
	{
		Professor professor1 = new Professor();
		professor1.cpf = "14554757";
		professor1.matricula = "465465479";
		professor1.nome = "Alexsandro";
		professor1.rg = "6254487";
		System.out.println(professor1.nome);
		System.out.println(professor1.cpf);
		System.out.println(professor1.rg);
		System.out.println(professor1.matricula);
		System.out.println("-----------------------------");
		//
		Professor professor2 = new Professor();
		professor2.cpf = "54657489";
		professor2.matricula = "45479";
		professor2.nome = "Joyce";
		professor2.rg = "787878";
		System.out.println(professor2.nome);
		System.out.println(professor2.cpf);
		System.out.println(professor2.rg);
		System.out.println(professor2.matricula);
		System.out.println("-----------------------------");
		//
		professor1 = professor2;
		System.out.println(professor1.nome);
		System.out.println(professor1.cpf);
		System.out.println(professor1.rg);
		System.out.println(professor1.matricula);
		System.out.println("-----------------------------");
		// Neste caso, professor1, vai perder a referência que tinha
		// anteriormente, e irá passar a referenciar o mesmo objeto que
		// professor2 está referenciando. O garbage collector irá se encarregar
		// de excluir os valores antigos de professor1.
	}
}
 