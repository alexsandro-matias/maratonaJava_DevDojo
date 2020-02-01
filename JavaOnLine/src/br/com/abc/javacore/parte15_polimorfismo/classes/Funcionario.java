// Aula 64: Polimorfismo pt 01
package br.com.abc.javacore.parte15_polimorfismo.classes;

public abstract class Funcionario extends Pessoa
{
	protected String nome;
	protected double salario;
	
	public abstract void calculaSalario();

	public Funcionario(String nome, double salario)
	{
		this.nome = nome;
		this.salario = salario;
	}

	public Funcionario()
	{
		// construtor vazio
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public double getSalario()
	{
		return salario;
	}

	public void setSalario(double salario)
	{
		this.salario = salario;
	}

	@Override public String toString()
	{
		return String.format("Funcionario [nome=%s, salario=%s]", nome, salario);
	}
}
