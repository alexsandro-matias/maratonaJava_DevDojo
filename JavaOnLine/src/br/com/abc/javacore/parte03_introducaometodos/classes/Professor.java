package br.com.abc.javacore.parte03_introducaometodos.classes;

public class Professor
{
	public String nome;
	public String matricula;
	public String rg;
	public String cpf;

	public void imprimeProfessor()
	{
		System.out.println(nome);
		System.out.println(cpf);
		System.out.println(rg);
		System.out.println(matricula);
		System.out.println("-----------------------------");
	}
}
