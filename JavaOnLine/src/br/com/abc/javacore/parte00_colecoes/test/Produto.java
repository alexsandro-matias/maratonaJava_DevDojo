// Aula 121 - Coleções parte 06 - Ordenação de Listas usando Comparable

package br.com.abc.javacore.parte00_colecoes.test;
//
// Irá apresentar um erro de compilação por que precisa de sobrescrever todos os métodos
public class Produto implements Comparable<Produto> 
{
	private String nome;
	private double preco;
	private String serialNumber;

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public double getPreco()
	{
		return preco;
	}

	public void setPreco(double preco)
	{
		this.preco = preco;
	}

	public String getSerialNumber()
	{
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber)
	{
		this.serialNumber = serialNumber;
	}

	@Override public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
		return result;
	}

	@Override public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Produto other = (Produto) obj;
		if (serialNumber == null)
		{
			if (other.serialNumber != null) return false;
		}
		else if (!serialNumber.equals(other.serialNumber)) return false;
		return true;
	}

	@Override public String toString()
	{
		return "Produto [nome=" + nome + ", preco=" + preco + ", serialNumber=" + serialNumber + "]";
	}

	public Produto(String nome, double preco, String serialNumber)
	{
		super();
		this.nome = nome;
		this.preco = preco;
		this.serialNumber = serialNumber;
	}

	//Método implemetado da Interface Comparable
	// método que compara os valores
	// negativo se this.object < outroObjeto
	// zero se this.objetct()  == outroobjeto
	// Positibo se this.object > outroObjeto
	@Override public int compareTo(Produto outroObjeto)
	{
		return this.serialNumber.compareTo(getSerialNumber());
	}
	
	
	
	
	
}
