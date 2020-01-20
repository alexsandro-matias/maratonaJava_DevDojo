package br.com.abc.javacore.parte03_introducaometodos.classes;
//Aula 32 - Métodos com parâmetros tipo reference

public class Professor
{
	public String nome;
	public String matricula;
	public String rg;
	public String cpf;

	public void imprimeProfessor(Professor aux) // variável de referência local
												// para este método
	{
		System.out.println(aux.nome);
		System.out.println(aux.cpf);
		System.out.println(aux.rg);
		System.out.println(aux.matricula);
		System.out.println("-----------------------------");
		aux.nome = "Mariana";
		System.out.println(aux.nome);
		//
		// Saída:
		// Dentro de professor test
		// Joana
		// Joana
		// 1457854
		// 154876
		// 47811654
		// -------------
		// Mariana
		// Mariana
		//
		// A alteração no método main, por que variáveis do tipo reference você
		// está passando o endereço de memória que aquele objeto está sendo
		// referenciado.
	}

	public void imprimeProfessor()
	{
		System.out.println("-----------------------------");
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.rg);
		System.out.println(this.matricula);
		System.out.println("-----------------------------");
		// usando a palavra reservada this é utilizada quando se deseja utilizar
		// os valores de dentro próprio objeto.
	}
	
	
}
