package br.com.abc.javacore.parte07_modificadorestatico.classes;

public class Carro
{
	private String nome;
	private double velocidadeMaxima;
	private double velocidadeLimite;

	public Carro(String nome, double velocidadeMaxima)
	{
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
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
}