package br.com.abc.javacore.parte04_sobrecargametodos.classes;
//Aula 38 - Sobrecarga de métodos
//Aula 39 - Sobrecarga de métodos e construtores
//Aula 40 - Sobrecarga de métodos e construtores
public class Funcionario
{
	private String nome;
	private String cpf;
	private double salario;
	private String rg; // adicionado depois. Para não ter que alterar todas as
						// partes do código que
						// precisam do RG, então usamos a sobrecarga de métodos.

	public void imprimeFuncionario()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Salário: " + this.salario);
		System.out.println("RG: " + this.rg);
		System.out.println("------------------------------");
		// A palavra reservada THIS é uma variável de referência para o próprio
		// objeto
		// que consegue ver tanto os atributos como os métodos. Já que ele está
		// dentro
		// do próprio objeto.
	}

	// podemos utilizar a mesma lógica para a atribuição dos setters no mesmo
	// método
	public void init(String nome, String cpf, double salario)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	// A sobrecarga, ou overload do método é utilizando a mesma assinatura,
	// porém os
	// parâmetros
	// devem ser diferente, por que o Java não saberá qual dos métodos chamar
	// (ambiguidade). O que acontece abaixo.
	// O que pode ser diferente é a quantidade de parâmetros ou tipo dos
	// parâmetros.
	// Tal processo acontece em tempo de compilação.
	// public void init(String nome, String cpf, double Salario, String rg)
	// {
	// this.nome = nome;
	// this.cpf = cpf;
	// this.salario = salario;
	// this.rg = rg;
	// }

	// Iremos diminuir a quantidade linhas de código, usando um método dentro do
	// outro.
	public void init(String nome, String cpf, double Salario, String rg)
	{
		init(nome, cpf, Salario);
		this.rg = rg;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getCpf()
	{
		return cpf;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	public double getSalario()
	{
		return salario;
	}

	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	// Construtores são rotinas de inicialização. com as seguintes regras:
	// - Nunca terá retorno, nem mesmo void;
	// - modificador + exatamente o nome da classe.

	// Caso não seja encontrado nenhum construtor, o Java irá criar um
	// automaticamente no momento da compilação, sem nenhum código e sem ação.
	// Da seguinte forma:
	// public Funcionario()
	// {
	//
	// }
	// Nos construtores podem ser definidas regras: Por exemplo, todo o objeto
	// do tipo Funcionario devem possuir um nome;
	public Funcionario(String nome, String cpf, double salario, String rg)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.rg = rg;
	}
	// A diferença do construtor acima e o método init é que com o construtor
	// será obrigatório o uso de parâmetros no momento da instanciação do
	// objeto.
	//
	// Da mesma forma, é possível fazer a sobrecarga de construtores. Um exemplo
	// seria criar um objeto vazio.

	public Funcionario()
	{
		System.out.println("Dentro do construtor"); // Esse trecho será
													// executado logo quando o
													// objeto for criado.
	}
}
