package br.com.abc.javacore.parte08_associacao.test;

import br.com.abc.javacore.parte08_associacao.classes.Aluno;
import br.com.abc.javacore.parte08_associacao.classes.Local;
import br.com.abc.javacore.parte08_associacao.classes.Professor;
import br.com.abc.javacore.parte08_associacao.classes.Seminario;

public class AssociacaoTest
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Aluno aluno = new Aluno("Alexsandro", 35); // variável de referência do
													// tipo Aluno referenciando
													// um objeto do
													// tipo aluno.
		Aluno aluno2 = new Aluno("Joanna Darc", 30);
		// Deverão ser feitos de forma separadas para que haja a associação
		// entre eles,
		// já que não tempo a certeza de que uma instância existe em outra
		// classe.
		Seminario seminario = new Seminario("Como ser rico com programação");
		aluno.setSeminario(seminario); // Se parâmetro não contiver valores, dá
										// uma exceção em tempo de execução -
										// java.lang.NullPointerException -
										// tentando acessar um objeto que não
										// existe
		aluno2.setSeminario(seminario);
		Professor professor = new Professor("Yoda", "usar a força para programar");
		Local local = new Local("Rua das Araras", "mato");
		seminario.setProfessor(professor);
		seminario.setLocal(local);
		// associando alunos ao seminários
		seminario.setAlunos(new Aluno[]
		{ aluno, aluno2 }); // um array de alunos
		aluno.print();
		// Saída:
		// Nome: Alexsandro
		// Idade: 35
		// Seminário inscrito:
		// br.com.abc.javacore.parte08_associacao.classes.Seminario@3764951d
		//
		// Isso se deve, por quê estamos imprimindo uma variável de referência.
		// O que
		// desejamos na realidade são os valores contido num determinado objeto
		// referenciado.
		// Se o --- aluno.setSeminario(seminario); --- for comentada, o valor de
		// saída
		// será null, já que não estamos fazendo referência a nenhum objeto.
		Seminario seminarioArray[] = new Seminario[1];
		seminarioArray[0] = seminario;
		professor.setSeminario(seminarioArray);
		
		seminario.printSeminario();
	}
}
