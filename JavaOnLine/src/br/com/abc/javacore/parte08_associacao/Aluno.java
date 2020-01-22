package br.com.abc.javacore.parte08_associacao;

//Aula 48 - Exercício associação 
//Aula 49 - Exercício associação pt2
//
//Um aluno poderá estar em apenas um seminário. 
//Um seminário poderá ter um ou vários alunos. 
//Um professor poderá ministrar um ou vários seminários.
//Um seminário só poderá ter um professor. 
//Um seminário deverá ter um local.
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
