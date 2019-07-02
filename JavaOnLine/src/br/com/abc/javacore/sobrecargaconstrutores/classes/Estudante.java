//Aula 40 - Construtores e sobrecarga de construtores parte 02
package br.com.abc.javacore.sobrecargaconstrutores.classes;

public class Estudante
{
	private String matricula;
	private String nome;
	private double[] notas;
	private String dataMatricula;

	// construtores não possuem retorno
	public Estudante(String matricula, String nome, double[] notas)
	{
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}

	// Para chamar um construtor dentro de outro construtor, usamos a palavra
	// reservada this.segue as regras:
	// 1. Um construtor dentro de outro construtor só pode ser chamado dentro de
	// outro construtor.
	// 2. Esse construtor deve ser a primeira linha dentro do outro construtor;
	public Estudante(String matricula, String nome, double[] notas, String dataMatricula)
	{
		// 2. Esse construtor deve ser a primeira linha dentro do outro
		// construtor, ou seja, passando a responsabilidade de código para outro
		// construtor.
		this(dataMatricula, nome, notas);
		this.dataMatricula = dataMatricula;
	}

	public void imprime()
	{
		System.out.println(this.getNome());
		System.out.println(this.getMatricula());
		for (int i = 0; i < notas.length; i++)
		{
			System.out.println("Nota: " + notas[i]);
		}
		System.out.println(dataMatricula);
	}

	public Estudante()
	{
		super();
	}

	public String getMatricula()
	{
		return matricula;
	}

	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public double[] getNotas()
	{
		return notas;
	}

	public void setNotas(double[] notas)
	{
		this.notas = notas;
	}
}
