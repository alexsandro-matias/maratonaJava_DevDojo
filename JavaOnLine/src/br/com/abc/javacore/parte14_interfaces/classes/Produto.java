// Aula 62: Interfaces pt 01
package br.com.abc.javacore.parte14_interfaces.classes;

// É possível criar uma interface para ser utilizada numa classe.
public class Produto implements Tributavel, Transportavel
{
	// Obrigado a implementar os métodos da interface, já que esta é uma classe
	// que contém apenas classes abstratas.
	// Esta é uma forma que o Java encontrou para driblar o problema de MÚLTIPLA
	// HERANÇA.
	//
	private String nome;
	private double peso;
	private double preco;
	private double precoFinal;
	private double valorFrete;
	
	public Produto(String nome, double peso, double preco)
	{
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}
	
	// Na subclasses, sempre um modificador menos restritivo na sobrescrita de
	// métodos.
	// private > default > protected > public
	@Override public void calcularImposto()
	{
		precoFinal = this.preco + (this.preco * IMPOSTO);
	}
	
	public void calculaFrete()
	{
		this.valorFrete = this.preco / this.peso * 0.1;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public double getPeso()
	{
		return peso;
	}
	
	public void setPeso(double peso)
	{
		this.peso = peso;
	}
	
	public double getPreco()
	{
		return preco;
	}
	
	public void setPreco(double preco)
	{
		this.preco = preco;
	}
	
	@Override public String toString()
	{
		return String.format("Produto [nome=%s, peso=%s, preco=%s, precoFinal=%s, valorFrete=%s]", nome, peso, preco,
				precoFinal, valorFrete);
	}
	
	public double getPrecoFinal()
	{
		return precoFinal;
	}
	
	public double getValorFrete()
	{
		return valorFrete;
	}
}
