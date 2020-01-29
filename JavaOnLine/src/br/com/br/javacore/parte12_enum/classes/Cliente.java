// Aula 57 - Enumerações pt 01
// Aula 58 - Enumerações pt 02
package br.com.br.javacore.parte12_enum.classes;

public class Cliente
{
	// public static final int PESSOA_FISICA = 1;
	// public static final int PESSOA_JURIFICA = 2;
	// Declaração do enum
	private TipoCliente tipo;
	private String nome;
	private TipoPagamento tipoPagamento;
	
	// Outro tipo de Enum: Realizando dentro da própria classe:
	// enum TipoPagamento
	public enum TipoPagamento
	{
		AVISTA, APRAZO
	}
	
	public Cliente(TipoCliente tipo, String nome)
	{
		this.tipo = tipo;
		this.nome = nome;
	}
	
	public Cliente(TipoCliente tipo, String nome, TipoPagamento tipoPagamento)
	{
		this(tipo, nome);
		this.setTipoPagamento(tipoPagamento);
	}
	
	public TipoCliente getTipo()
	{
		return tipo;
	}
	
	public void setTipo(TipoCliente tipo)
	{
		this.tipo = tipo;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	@Override public String toString()
	{
		return String.format("Cliente [tipo=%s, nome=%s]", tipo, nome);
	}
	
	public TipoPagamento getTipoPagamento()
	{
		return tipoPagamento;
	}
	
	public void setTipoPagamento(TipoPagamento tipoPagamento)
	{
		this.tipoPagamento = tipoPagamento;
	}
}