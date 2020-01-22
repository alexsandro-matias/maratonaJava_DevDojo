package br.com.abc.javacore.parte08_associacao.classes;

public class Professor
{
	private String nome;
	private String especialidade;
	private Seminario[] seminario;
	
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
	
	public Professor(String nome, String especialidade, Seminario[] seminario)
	{
		this(nome, especialidade);
		this.seminario = seminario;
	}

	public Seminario[] getSeminario()
	{
		return seminario;
	}

	public void setSeminario(Seminario[] seminario)
	{
		this.seminario = seminario;
	}
}
