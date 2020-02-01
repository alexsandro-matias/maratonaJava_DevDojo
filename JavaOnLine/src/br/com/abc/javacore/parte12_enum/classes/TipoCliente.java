// Aula 57 - Enumerações pt 01
// Aula 58 - Enumerações pt 02
// Aula 59 - Enumerações pt 03 
package br.com.abc.javacore.parte12_enum.classes;

public enum TipoCliente
{
	// Neste caso tudo é considerado como constante.
	// PESSOA_FISICA, PESSOA_JURIDICA;
	// Para enumeração atributos de classes ou métodos. Da mesma forma não é
	// possível chamar um construtor de uma enumeração. Ele próprio irá se
	// chamar.
	PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica"); // Nessa
																				// linha
																				// não
																				// apresentará
																				// erro.
	//
	// Também pode ser atributos da enumeração. Mas a regra é que não pode ser
	// declarada antes da enumeração, ou seja, as constantes devem ser a
	// primeira linha do enum.

	private int tipo;
	private String nome;

	private TipoCliente(int tipo, String nome)
	{
		this.tipo = tipo;
		this.nome = nome;
	}
	// Não pode ser criado como público. Por que
	// ele não pode ser chamado. Como eles são
	// privados, fica redundante deixar o
	// construtor como privado. Quando não é
	// declarado um construtor, é chamado
	// implicitamente o construtor padrão. Como
	// pede um tipo nesse construtor, deve ser
	// declarado no enum acima.

	public int getTipo()
	{
		return tipo;
	}
	// Como não queremos realizar alterações, devemos deixar somente o método
	// getTipo()

	public String getNome()
	{
		return nome;
	}

	//
	// constant specific class body
	public String getId()
	{
		return "A";
	}
}
