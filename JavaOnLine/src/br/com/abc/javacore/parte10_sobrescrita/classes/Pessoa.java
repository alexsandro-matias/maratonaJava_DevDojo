package br.com.abc.javacore.parte10_sobrescrita.classes;

// Aula 55 -  Sobrescrita de métodos
// Toda classe herda de object
// public class Pessoa extends Object - Implicitamente
public class Pessoa
{
	String nome;
	int idade;
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public int getIdade()
	{
		return idade;
	}
	
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	
	@Override public String toString()
	{
		return "Nome: "+this.nome+ "\nidade: "+this.idade;
	}
}
