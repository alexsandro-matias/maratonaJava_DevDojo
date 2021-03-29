// Aula 121 - Coleções parte 06 - Ordenação de Listas usando Comparable
package br.com.abc.javacore.parte00_colecoes.test;

//
// Irá apresentar um erro de compilação por que precisa de sobrescrever todos os métodos
public class Produto implements Comparable<Produto>
{
	private String nome;
	// private double preco; // Como não podemos usar o método compareTo() já
	// que
	// este é um tipo primitivo, devemos usar a classe
	// Wrapper Double.
	private Double preco; // Neste momento é possível fazer a comparação entre
							// valores.
	private String serialNumber; // Poderia ser Long

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
		return "Produto [nome=" + nome + ", preco=" + preco + ", serialNumber=" + serialNumber + "]\n";
	}

	public Produto(String serialNumber, double preco, String nome)
	{
		this.nome = nome;
		this.preco = preco;
		this.serialNumber = serialNumber;
	}

	@Override public int compareTo(Produto outroObjeto)
	{
		// Método implemetado da Interface Comparable
		// método que compara os valores
		// negativo se this.object < outroObjeto
		// zero se this.objetct() == outroobjeto
		// Positivo se this.object > outroObjeto
		//
		// Como a classe String já implementou o método compareTo() não
		// precisamos implementá-lo novamente.
		// return this.serialNumber.compareTo(outroObjeto.getSerialNumber());
		//
		// Para seja feita a ordenação, não se pode usar o método getPreco(),
		// uma vez que o retorno deste valor é um número primitivo. Por isso
		// devemos usar diretamente o atributo.
		return this.preco.compareTo(outroObjeto.getPreco());
		//
		// Essa abordagem, não é eficiente, já que uma implementação feita aqui,
		// não garante que outro desenvolvedor faça de outra forma, ou a
		// especificação do requisito de ordenação seja alterado. Por isso,
		// existe outra interface -> Comparator -> que faz a ordenação sem
		// alteração na classe original.
	}
}
