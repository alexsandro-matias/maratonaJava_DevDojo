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
	//
	//
	// No momento da sobrecarga, a escolha do método ocorre em tempo compilação,
	// baseada na lista de parâmetros.
	//
	// Ainda há muita repetição de código entre as linhas 32 e 47. Podemos fazer
	// um método mais incompleto sendo parte de um mais completo.
	// public void init(String nome, String cpf, double salario, String rg)
	// {
	// init(nome, cpf, salario);
	// this.rg = rg;
	// }
	//
	//

	public Funcionario()
	{
		System.out.println("Dentro do construtor"); // Esse trecho será
													// executado logo quando o
													// objeto for criado.
	}
}
//
// Onde está o construtor? Por que quando compila o programa e a JVM não
// acha nenhum construtor, ele insere o construtor automático.
//
// Construtores são rotinas de inicialização com a seguinte regras:
// 1. Eles nunca terão retorno;
// 2. modificador de acesso + nome da mesma classe.
// É a primeira parte do código quando ele construído.
//
//
// A variável de referência Funcionario que está fazendo referência para um
// objeto que tem os atributos acima.
// Quando atribuimos os valores pelos métodos setters.
// Como os métodos são privados quem virão os valores são os métodos.
// No caso da palavra reservada this que age comom variável de referência
// que referencia ao próprio objeto. Ele alcança tanto os atributos quanto
// métodos, uma vez que ele está dentro do método. Assim ele enxerga tudo
// que está no objeto.
//
// Mas se tivessemos muitos atributos, não seria viável termos um método
// dessa forma. Para exemplo iremos criar um método que reune todos os
// métodos getters.
//
// antes da sobrecarga
// public void init(String nome, String cpf, double salario)
// {
// this.nome = nome;
// this.cpf = cpf;
// this.salario = salario;
// }
// Porém se quisermos adicionar mais um atributo RG.
// não é uma boa ideia alterar um método.
// Por isso utiliza a sobrecarga que consiste em usar a mesma assinatura de
// método, porém com a lista de parâmetros é diferente. Seja na quantidade
// ou nos tipos deles. O tipo de retorno e tipo acesso não importam na
// sobrecarga.
//
// depois da sobrecarga
