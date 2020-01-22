package br.com.abc.javacore.parte08_associacao.classes;

public class Seminario
{
	private String titulo;
	private Aluno[] alunos; // Relação muito para muitos
	private Professor professor;
	private Local local;
	
	public Seminario()
	{
		// super();
	}
	
	public Seminario(String titulo)
	{
		super();
		this.titulo = titulo;
	}
	
	public Seminario(String titulo, Aluno alunos[], Professor professor, Local local)
	{
		this(titulo);
		this.alunos = alunos;
		this.professor = professor;
		this.local = local;
	}
	
	public void printSeminario()
	{
		System.out.println("Título: " + this.titulo);
		System.out.println("Alunos: " + this.alunos);
		System.out.println("Professor: " + this.professor);
		System.out.println("Local: " + this.local);
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
