// Aula 57 - Enumerações pt 01
// Aula 58 - Enumerações pt 02
// Aula 59 - Enumerações pt 03
package br.com.br.javacore.parte12_enum.classes;

public class Cliente
{
	// public static final int PESSOA_FISICA = 1;
	// public static final int PESSOA_JURIFICA = 2;
	// Declaração do enum. A enumeração não pode ser feita dentro de um método.
	private TipoCliente tipoCliente;
	private String nome;
	private TipoPagamento tipoPagamento;

	// Outro tipo de Enum: Realizando dentro da própria classe:
	// private enum TipoPagamento
	public enum TipoPagamento
	{
		AVISTA, APRAZO
	}

	public Cliente(TipoCliente tipo, String nome)
	{
		this.tipoCliente = tipo;
		this.nome = nome;
	}

	public Cliente(TipoCliente tipo, String nome, TipoPagamento tipoPagamento)
	{
		this(tipo, nome);
		this.tipoPagamento = tipoPagamento;
	}

	public TipoCliente getTipo()
	{
		return tipoCliente;
	}

	public void setTipo(TipoCliente tipo)
	{
		this.tipoCliente = tipo;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public TipoPagamento getTipoPagamento()
	{
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento)
	{
		this.tipoPagamento = tipoPagamento;
	}

	@Override public String toString()
	{
		return String.format("Cliente [tipo=%s, nome=%s, tipoPagamento=%s, número=%s]", tipoCliente.getNome(), nome,
				tipoPagamento, tipoCliente.getTipo());
	}
}