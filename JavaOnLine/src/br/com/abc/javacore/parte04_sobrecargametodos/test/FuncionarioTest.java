package br.com.abc.javacore.parte04_sobrecargametodos.test;

//Aula 38 - Sobrecarga de métodos
import br.com.abc.javacore.parte04_sobrecargametodos.classes.Funcionario;

public class FuncionarioTest
{
	public static void main(String[] args)
	{
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Chica da Silva");
		funcionario.setCpf("111.222.333-45");
		funcionario.setSalario(4500);
		funcionario.imprimeFuncionario();
		//
		Funcionario funcionario2 = new Funcionario();
		funcionario2.init("Paulo", "1324654645", 1500, "6208063");
		funcionario2.imprimeFuncionario();
		//
		Funcionario funcionario3 = new Funcionario();
		funcionario3.imprimeFuncionario();
		
		Funcionario funcionario4 = new Funcionario();
		funcionario.setNome("Chica da Silva");
		funcionario.setCpf("111.222.333-44");
		funcionario.setSalario(4500);
		funcionario.imprimeFuncionario();
		//
		Funcionario xuxa = new Funcionario();
		xuxa.init("Xuxa Meneguel", "456465465", 15000, "78789787");
		xuxa.imprimeFuncionario();
		// Para não ter chamar todas as vezes esses métodos e evitar repetição
		// de código, colocaremos na classe Funcionario.
		//
		// System.out.println(funcionario.getNome());
		// System.out.println(funcionario.getCpf());
		// System.out.println(funcionario.getSalario());
	}
}
