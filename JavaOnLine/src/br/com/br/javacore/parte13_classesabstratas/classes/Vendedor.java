// Aula 60 - Classes abstratas pt 01
package br.com.br.javacore.parte13_classesabstratas.classes;

public class Vendedor extends Funcionario
{
	private double totalVendas;

	public void calculaSalario()
	{
		this.salario = this.salario + (totalVendas * 0.05);
	}
	
	

	public Vendedor(String nome, String clt, double salario, double totalVendas)
	{
		super(nome, clt, salario);
		this.totalVendas = totalVendas;
	}



	public double getTotalVendas()
	{
		return totalVendas;
	}
}
