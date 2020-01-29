// Aula 56 -  Modificador Final
// Aula 56 -  Modificador Final
package br.com.abc.javacore.parte11_modificadorfinal.classes;

public final class Carro // deixando a classe como FINAL. Implica que essa classe não pode ser extendida.
							// Exemplo da classe STRING que nunca poderá ser alterada. Isso acontece para
							// garantir o funcionamento correto da classe.
{
	// final pode ser considerada uma constante em outras linguagens.
	// private static final double velocidadeLimite; // essa linha dará um erro, já
	// que se é obrigado atribuir um valor à variável
	private static final double FINALVELOCIDADE_LIMITE = 250; // Uma vez definida a velocidade, ela nunca deve ser
																// alterada
	private String marca;
	private String nome;
	// Essa atribuição acontece apenas para variáveis primitivas. Para variáveis de
	// referência
	private final Contador contador = new Contador();
	// Neste momento, é possível criar uma nova referência para outro objeto. Já que
	// está cravada com o FINAL. Porém os valores dentro do objeto podem ser
	// alteradas.
	
	// Usando FINAL num método.
	// Esse método não pode ser sobrescrito. O mesmo comportamento nas classes
	// filhas. Mas pode ser sobrecarregada.
	public final void imprime()
	{
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getMarcar()
	{
		return marca;
	}
	
	public void setMarcar(String marcar)
	{
		this.marca = marcar;
	}
	
	@Override public String toString()
	{
		return "Carro [nome=" + nome + ", marcar=" + marca + ", getNome()=" + getNome() + ", getMarcar()=" + getMarcar()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public Contador getContador()
	{
		return contador;
	}
}
