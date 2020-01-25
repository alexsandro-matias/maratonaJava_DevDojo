package br.com.abc.javacore.parte09_heranca.classes;

// Aula 50 - Herança pt 01
// Aula 51 - Herança pt 02
public class Pessoa
{
	// O uso de Herança é aplicado em OO, pelo reuso de código da mesma forma
	// que o uso do recurso de polimorfismo.
	private String nome;
	private String cpf;
	private Endereco endereco;

	public void print()
	{
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
