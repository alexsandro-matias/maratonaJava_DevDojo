package br.com.abc.javacore.parte08_associacao;

//Aula 48 - Exercício associação 
public class Aluno
{
	private String nome;
	private int idade;
	
	// Como um aluno irá estar apenas em um
	public Aluno(String nome, int idade)
	{
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getIdade()
	{
		return idade;
	}
	
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
}
