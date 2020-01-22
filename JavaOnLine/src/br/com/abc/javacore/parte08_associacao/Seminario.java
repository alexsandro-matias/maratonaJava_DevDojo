package br.com.abc.javacore.parte08_associacao;

public class Seminario
{
	private String titulo;
	private Professor professor;
	private Local local;
	private Aluno[] alunos; // Relação muito para muitos

	public Seminario()
	{
		// super();
	}

	public Seminario(String titulo)
	{
		super();
		this.titulo = titulo;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public Aluno[] getAlunos()
	{
		return alunos;
	}

	public void setAlunos(Aluno[] alunos)
	{
		this.alunos = alunos;
	}

	public Professor getProfessor()
	{
		return professor;
	}

	public void setProfessor(Professor professor)
	{
		this.professor = professor;
	}

	public Local getLocal()
	{
		return local;
	}

	public void setLocal(Local local)
	{
		this.local = local;
	}
}
