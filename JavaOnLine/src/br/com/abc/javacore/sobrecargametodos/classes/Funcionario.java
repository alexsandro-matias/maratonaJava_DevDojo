//Aula 38 - Sobrecarga de métodos (Overload)
//Aula 39 - Construtores e sobrecarga de construtores parte 01
//Aula 40 - Construtores e sobrecarga de construtores parte 02
package br.com.abc.javacore.sobrecargametodos.classes;

public class Funcionario
{
	private String nome;
	private String cpf;
	private double salario;
	private String rg; // adicionado depois

	// criado o método somente para imprimir
	public void imprime()
	{
		System.out.println(this.getNome());
		System.out.println(this.getCpf());
		System.out.println(this.getSalario());
		System.out.println(this.getRg());
		System.out.println("------------------");
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
	// Para criarmos uma regram que todo o funcionário terá um nome
	public Funcionario(String nome)
	{
		this.nome = nome;
	}

	//
	// Com essa construção já é possível apagar os outros métodos "init"
	public Funcionario(String nome, String cpf, double salario, String rg)
	{
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.rg = rg;
	}

	//
	// Criando um construtor vazio -> sobrecarga de construtores
	public Funcionario()
	{
	}

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
	public void init(String nome, String cpf, double salario, String rg)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.rg = rg;
	}

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

	// Método criado depois
	public String getRg()
	{
		return rg;
	}

	public void setRg(String rg)
	{
		this.rg = rg;
	}
}
