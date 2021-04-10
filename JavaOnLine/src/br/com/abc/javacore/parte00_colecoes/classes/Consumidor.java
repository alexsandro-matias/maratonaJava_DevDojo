package br.com.abc.javacore.parte00_colecoes.classes;

public class Consumidor
{
	private String nome;
	private String cpf;

	public Consumidor(String nome, String cpf)
	{
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Consumidor other = (Consumidor) obj;
		if (cpf == null)
		{
			if (other.cpf != null) return false;
		}
		else if (!cpf.equals(other.cpf)) return false;
		return true;
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
		return "Consumidor [nome=" + nome + ", cpf=" + cpf + "]";
	}
}
