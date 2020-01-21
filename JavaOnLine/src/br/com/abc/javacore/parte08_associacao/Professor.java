package br.com.abc.javacore.parte08_associacao;

public class Professor
{
	private String nome;
	private String especialidade;
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getEspecialidade()
	{
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade)
	{
		this.especialidade = especialidade;
	}
	
	public Professor(String nome, String especialidade)
	{
		super();
		this.nome = nome;
		this.especialidade = especialidade;
	}
}
