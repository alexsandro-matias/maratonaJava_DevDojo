// Aula 64: Polimorfismo pt 01
package br.com.abc.javacore.parte15_polimorfismo.classes;

public class Gerente extends Funcionario
{
	private double participacaoLucro;

	public Gerente()
	{
		super();
	}

	public Gerente(String nome, double salario)
	{
		super(nome, salario);
	}
	
	

	public Gerente(String nome, double salario, double participacaoLucro)
	{
		super(nome, salario);
		this.participacaoLucro = participacaoLucro;
	}

	public double getParticipacaoLucro()
	{
		return participacaoLucro;
	}

	public void setParticipacaoLucro(double participacaoLucro)
	{
		this.participacaoLucro = participacaoLucro;
	}

	@Override public void calculaSalario()
	{
		this.salario = this.salario + this.participacaoLucro;
	}
	
	
}
