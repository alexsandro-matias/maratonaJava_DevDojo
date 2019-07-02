//Aula 39 - Construtores e sobrecarga de construtores parte 01
package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest
{
	public static void main(String[] args)
	{
		Funcionario funcionario = new Funcionario("Alexsandro");
		funcionario.setNome("Chica da Silva");
		funcionario.setCpf("111.222.333-44");
		funcionario.setSalario(4500);
		funcionario.imprime();
//		
		Funcionario xuxa = new Funcionario("Alexsandro");
		xuxa.init("Xuxa Meneguel", "456465465", 15000, "78789787");
		xuxa.imprime();
		// Para não ter chamar todas as vezes esses métodos e evitar repetição
		// de código, colocaremos na classe Funcionario.
		//
		// System.out.println(funcionario.getNome());
		// System.out.println(funcionario.getCpf());
		// System.out.println(funcionario.getSalario());
	}
}