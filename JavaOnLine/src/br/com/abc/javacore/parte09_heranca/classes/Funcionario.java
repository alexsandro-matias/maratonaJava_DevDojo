package br.com.abc.javacore.parte09_heranca.classes;

public class Funcionario extends Pessoa // Funcionário é uma Pessoa
{
	// Os mesmos atributos utilizados em pessoa serão usados nesta classe. De
	// certa forma, elas estão relacionadas. Porém funcionário terá um atributo
	// a mais que será salário. Assim funcionário é uma extensão de uma pessoa,
	// ou seja, Funcionario é uma classe mais especializada, enquanto Pessoa é
	// mais genérica.
	private double salario;

	public double getSalario()
	{
		return salario;
	}

	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	
	
}
