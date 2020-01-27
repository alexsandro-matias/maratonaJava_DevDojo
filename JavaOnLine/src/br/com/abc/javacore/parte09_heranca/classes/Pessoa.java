package br.com.abc.javacore.parte09_heranca.classes;

// Aula 50 - Herança pt 01
// Aula 51 - Herança pt 02 e palavra reservada super 
// Aula 52 - Herança pt 03 e Modificador Protected 
// Aula 53 - Herança e construtores pt 04
// Aula 54 - Herança e Sequência de inicialização pt 05
public class Pessoa
{
	// O uso de Herança é aplicado em OO, pelo reuso de código da mesma forma
	// que o uso do recurso de polimorfismo.
	// private String nome;
	// private String cpf;
	// private Endereco endereco;
	protected String nome;
	protected String cpf;
	protected Endereco endereco;
	
	//
	// adicionando o construtor
	public Pessoa(String nome)
	{
		this.nome = nome;
	}
	// Esse construtor dessa forma dará um erro de compilação nas classes filhas, já
	// que todo funcionário é uma pessoa. Então se o construtor em pessoa obriga a
	// adicionar um nome, então em funcionário também o será.
	
	public Pessoa(String nome, String cpf)
	{
		this(nome);
		this.cpf = cpf;
	}
	
	public Pessoa()
	{
		// Construtor vazio
	}
	
	public void print()
	{
		System.out.println("-----------------------------------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Rua: " + this.getEndereco().getRua());
		System.out.println("Bairro: " + this.getEndereco().getBairro());
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
	
	public Endereco getEndereco()
	{
		return endereco;
	}
	
	public void setEndereco(Endereco endereco)
	{
		this.endereco = endereco;
	}
}
