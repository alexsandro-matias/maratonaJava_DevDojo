package br.com.abc.javacore.parte09_heranca.classes;

//Aula 53 - Herança e construtores pt 04

public class Endereco
{
	private String rua;
	private String bairro;
	
	public void print()
	{
		System.out.println("Rua: "+this.rua);
		System.out.println("Bairro: "+this.bairro);
		// Testando o modificador de acesso protected
		Pessoa pessoa = new Pessoa();
		
	}
	
	public String getRua()
	{
		return rua;
	}
	
	public void setRua(String rua)
	{
		this.rua = rua;
	}
	
	public String getBairro()
	{
		return bairro;
	}
	
	public void setBairro(String bairro)
	{
		this.bairro = bairro;
	}
}
