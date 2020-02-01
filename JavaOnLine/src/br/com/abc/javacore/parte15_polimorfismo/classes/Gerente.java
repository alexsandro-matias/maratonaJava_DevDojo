// Aula 64: Polimorfismo pt 01
package br.com.abc.javacore.parte15_polimorfismo.classes;

public class Gerente extends Funcionario
{
	public Gerente(String nome, String clt, double salario)
	{
		super(nome, clt, salario);
	}

	@Override public void calculaSalario()
	{
		this.salario = this.salario + (this.salario * 0.2);
	}

	@Override public void imprime()
	{
		System.out.println("Imprime dentro de Gerente.");
	}
}


