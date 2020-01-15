package br.com.abc.javacore.parte04_sobrecargametodos.classes;
//Aula 38 - Sobrecarga de métodos

public class Funcionario
{
	private String nome;
	private String cpf;
	private double salario;
	private String rg; // adicionado depois. Para não ter que alterar todas as partes do código que
						// precisam do RG, então usamos a sobrecarga de métodos.
	
	public void imprimeFuncionario()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Salário: " + this.salario);
		System.out.println("RG: " + this.rg);
		System.out.println("------------------------------");
		// A palavra reservada THIS é uma variável de referência para o próprio objeto
		// que consegue ver tanto os atributos como os métodos. Já que ele está dentro
		// do próprio objeto.
	}
	
	// podemos utilizar a mesma lógica para a atribuição dos setters no mesmo método
	public void init(String nome, String cpf, double Salario)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	// A sobrecarga, ou overload do método é utilizando a mesma assinatura, porém os
	// parâmetros
	// devem ser diferente, por que o Java não saberá qual dos métodos chamar
	// (ambiguidade). O que acontece abaixo.
	// O que pode ser diferente é a quantidade de parâmetros ou tipo dos parâmetros.
	// Tal processo acontece em tempo de compilação.
	// public void init(String nome, String cpf, double Salario, String rg)
	// {
	// this.nome = nome;
	// this.cpf = cpf;
	// this.salario = salario;
	// this.rg = rg;
	// }
	
	// Iremos diminuir a quantidade linhas de código, usando um método dentro do
	// outro.
	public void init(String nome, String cpf, double Salario, String rg)
	{
		init(nome, cpf, Salario);
		this.rg = rg;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getCpf()
	{
		return cpf;
	}
	
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}
	
	public double getSalario()
	{
		return salario;
	}
	
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
}
