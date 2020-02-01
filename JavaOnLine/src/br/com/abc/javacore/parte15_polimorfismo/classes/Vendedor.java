// Aula 64: Polimorfismo pt 01
package br.com.abc.javacore.parte15_polimorfismo.classes;

public class Vendedor extends Funcionario
{
	private double totalVendas;

	public Vendedor(String nome, double salario, double totalVendas)
	{
		super(nome, salario);
		this.totalVendas = totalVendas;
	}

	public void calculaSalario()
	{
		this.salario = this.salario + (totalVendas * 0.05);
	}

	public double getTotalVendas()
	{
		return totalVendas;
	}
}
