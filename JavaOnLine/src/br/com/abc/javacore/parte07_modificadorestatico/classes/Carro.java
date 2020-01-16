package br.com.abc.javacore.parte07_modificadorestatico.classes;
//Aula 42 - modificador de acesso static 

public class Carro
{
	private String nome;
	private double velocidadeMaxima;
	public static double velocidadeLimite = 240; // velocidade determinada no
													// plano de
	// negócio que deve ser
	// compartilhada para todos os
	// carros.

	public Carro(String nome, double velocidadeMaxima)
	{
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void imprimeCarro()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
		// System.out.println("Velocidade Limite: " + this.velocidadeLimite);
		// Como o THIS pertence ao objeto e não a classe, esse warning irá ficar
		// aparecendo e podemos deixar apenas o nome do atributo.
		System.out.println("Velocidade Limite: " + velocidadeLimite);
		System.out.println("------------------------------------------------");
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public double getVelocidadeMaxima()
	{
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima)
	{
		this.velocidadeMaxima = velocidadeMaxima;
	}
	// Esse trecho não deve ser utilizado, já que os objetos não devem alterar
	// os valores estáticos.
	//
	// public double getVelocidadeLimite()
	// {
	// return velocidadeLimite;
	// }
	//
	// public void setVelocidadeLimite(double velocidadeLimite)
	// {
	// this.velocidadeLimite = velocidadeLimite;
	// }
}