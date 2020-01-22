package br.com.abc.javacore.parte08_associacao.classes;

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
	// Como um aluno irá estar apenas em um seminário
	private Seminario seminario;
	
	public Aluno(String nome, int idade)
	{
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public Aluno()
	{
		super();
	}
	
	public void print()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		// System.out.println("Seminário inscrito: " + this.seminario);
		if (this.seminario != null) System.out.println("Seminário inscrito: " + this.seminario.getTitulo()); // desta
																												// forma,
																												// estaremos
																												// acessando
																												// o
																												// valor
																												// do
																												// objeto,
																												// não o
																												// endereço
																												// referenciado.
		else
		{
			System.out.println("Aluno cadastrado em nenhum curso");
		}
	}
	// Saída:
	// Nome: Alexsandro
	// Idade: 35
	// Seminário inscrito:
	// br.com.abc.javacore.parte08_associacao.classes.Seminario@3764951d
	//
	// Isso se deve, por quê estamos imprimindo uma variável de referência. O que
	// desejamos na realidade são os valores contido num determinado objeto
	// referenciado.
	// Se o --- aluno.setSeminario(seminario); --- for comentada, o valor de saída
	// será null, já que não estamos fazendo referência a nenhum objeto.
	
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
	
	public Seminario getSeminario()
	{
		return seminario;
	}
	
	public void setSeminario(Seminario seminario)
	{
		this.seminario = seminario;
	}
}
