package br.com.abc.javacore.parte03_introducaometodos.classes;

public class Professor
{
	public String nome;
	public String matricula;
	public String rg;
	public String cpf;

	public void imprimeProfessor(Professor aux)
	{
		System.out.println(aux.nome);
		System.out.println(aux.cpf);
		System.out.println(aux.rg);
		System.out.println(aux.matricula);
		System.out.println("-----------------------------");
	}
}
