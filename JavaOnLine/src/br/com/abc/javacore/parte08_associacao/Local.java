package br.com.abc.javacore.parte08_associacao;

public class Local
{
	private String rua;
	private String bairro;
	
	public Local(String rua, String bairro)
	{
		super();
		this.rua = rua;
		this.bairro = bairro;
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
