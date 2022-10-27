package br.com.abc.javacore.parte09_heranca.classes;
//Aula 53 - Herança e construtores pt 04

public class Funcionario extends Pessoa // Funcionário é uma Pessoa
{
	// Os mesmos atributos utilizados em pessoa serão usados nesta classe. De
	// certa forma, elas estão relacionadas. Porém funcionário terá um atributo
	// a mais que será salário. Assim funcionário é uma extensão de uma pessoa,
	// ou seja, Funcionario é uma classe mais especializada, enquanto Pessoa é
	// mais genérica. O objeto funcionário possue implicitamente os mesmo
	// atributos
	// da classe pessoa.
	private double salario;
	// Para criar uma pessoa, o construtor é obrigatório o nome. Mas para chamar
	// o
	// construtor da classe pai, devemos utilizar a palavra reservada super.
	
	public Funcionario(String nome)
	{
		super(nome);
		System.out.println("Dentro do construtor de funcionário");
	}
	
	// Bloco de inicialização
	{
		System.out.println("Dentro do bloco de inicialização de funcionário");
	}
	// Bloco de inicialização estático
	static
	{
		System.out.println("Dentro do bloco de inicialização estático em funcionário");
	}
	// Regras para se usar super:
	// 1. Não se pode usar o .
	// 2. Deverá ser a primeira instrução do construtor. Assim ou super ou this.
	//
	//
	// Ordem de criação (inicialização) quando instanciado Funcionario()
	// Bloco de inicialização estático de pessoa
	// Dentro do bloco de inicialização estático em funcionário
	// Bloco de inicialização de pessoa
	// Dentro de Construtor de pessoa
	// Dentro do bloco de inicialização de funcionário
	//
	// 1. Espaço em memória é alocado para o objeto sendo construído;
	// 2. Cada um dos atributos do objeto é criado e inicializado com os valores
	// padrão;
	// 3. O construtor da superclasse é chamado (super);
	// 4. A inicialização dos atributos via declaração e o código do bloco de
	// inicialização da superclasse são executados na ordem que aparecem;
	// 5. O código do construtor da superclasse é chamado;
	// 6. Passo 4 para a subclasse é executado;
	// 7. O código do construtor da classe é executado.
	
	public Funcionario()
	{
		// Construtor vazio
	}
	
	public double getSalario()
	{
		return salario;
	}
	
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	// Para imprimir os salário no método imprime, devemos fazer a sobrescrita
	// de
	// métodos criar o mesmo modificador de acesso e mesmo retorno, mesmo
	// idenficador e mesma quantidade de parâmetros.
	// Não existe herança múltipla, ou seja, uma vez que somente de um outra
	// classe.
	// public void print()
	// {
	// }
	// Neste caso, a estratégia do método é particular a funcionário, não mais
	// comum
	// a pessoa.
	// No caso se a quantidade de parâmetros é diferente, haverá uma sobrecarga
	// de
	// métodos. Como abaixo.
	// public void print(String nome)
	// {
	// }
	
	//
	// Como queremos chamar o método da superclasse, usamos a palavra reservada
	// super:
	public void print()
	{
		super.print();
		System.out.println("Salário: " + this.getSalario());
		imprimeReciboPagamento();
	}
	
	public void imprimeReciboPagamento()
	{
		// System.out.println("Eu "+super); // modificador de acesso está
		// privado, logo
		// não funcionará o acesso ao atributo. No desenvolvimento, por exemplo,
		// permitir que somente os filhos ou para classes que estão no mesmo
		// pacote
		// acessarem à determinado atributo. Para isso usamos o modificador de
		// acesso
		// protected nos atributos.
		System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario);
	}
}
