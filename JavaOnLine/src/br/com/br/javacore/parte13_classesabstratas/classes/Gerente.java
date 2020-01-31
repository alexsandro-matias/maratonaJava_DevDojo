// Aula 60 - Classes abstratas pt 01
package br.com.br.javacore.parte13_classesabstratas.classes;

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
}
