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
	}
}
