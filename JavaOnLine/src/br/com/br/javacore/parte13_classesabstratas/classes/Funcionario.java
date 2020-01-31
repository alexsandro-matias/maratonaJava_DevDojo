// Aula 60 - Classes abstratas pt 01
package br.com.br.javacore.parte13_classesabstratas.classes;

//public class Funcionario
//declaração da classe como abstrata que não pode ser final, uma vez que ela pode ser apenas extendida.
public abstract class Funcionario
{
	// Ela nunca será instaciada. A decisão do uso é arquitetural. Podem conter
	// métodos abstratos, onde estes não são instanciados.
	// Funcionário pode ser um superclasse de gerente e vendedor. Mas,
	// efetivamente no sistema real, não teremos um funcionário.
	// No caso do cálculo do salário, eles são diferentes tanto para gerente,
	// quanto para vendedor. Precisamos obrigar as duas classes para este
	// cálculo.
	// private String nome;
	// private String clt;
	// private double salario;
	// Deixando os atributos protected para não precisar o setters.
	protected String nome;
	protected String clt;
	protected double salario;

	// public void calculaSalario()
	// {
	// this.salario = this.salario + (this.salario * 0.1);
	// }
	// Removido o corpo do método já que os métodos abstratos não têm
	// implementação. A forma de implementação será descrita nas classes filhas.
	// Caso haja apenas um método abstrato, toda a classe deverá ser abstrata.
	// Porém se a classe for abstrata, não necessariamente precisa o
	// obrigatoriedade de métodos abstratos.
	// Caso os métodos não sejam abstratos, eles são chamados de concretos.
	public abstract void calculaSalario();

	public Funcionario(String nome, String clt, double salario)
	{
		this.nome = nome;
		this.clt = clt;
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

	public String getClt()
	{
		return clt;
	}

	public void setClt(String clt)
	{
		this.clt = clt;
	}

	public double getSalario()
	{
		return salario;
	}

	public void setSalario(double salario)
	{
		this.salario = salario;
	}

	public String toString()
	{
		return String.format("Funcionario [nome=%s, clt=%s, salario=%s]", nome, clt, salario);
	}
}
