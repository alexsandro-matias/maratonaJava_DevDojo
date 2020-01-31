// Aula 60 - Classes abstratas pt 01
// Aula 61 - Classes abstratas pt 02
package br.com.br.javacore.parte13_classesabstratas.test;

import br.com.br.javacore.parte13_classesabstratas.classes.Gerente;
import br.com.br.javacore.parte13_classesabstratas.classes.Vendedor;

public class FuncionarioTest
{
	public static void main(String[] args)
	{
		// Funcionario marcos = new Funcionario("Marcos", "132154", 1500);
		// erro
		// de
		// compilação
		// já
		// que a
		// classe
		// passa
		// a ser
		// abstrata
		// e não
		// pode
		// ser
		// instanciada,
		// apenas
		// extendida.
		// Marcos é um vendedor ou gerente??
		// marcos.calculaSalario();
		// System.out.println(marcos);
		Gerente finho = new Gerente("Finho", "123456", 1000);
		finho.calculaSalario();
		System.out.println(finho);
		Vendedor silvio = new Vendedor("Silvio Santos", "45648789", 10E3, 1500);
		silvio.calculaSalario();
		System.out.println(silvio);
	}
}
