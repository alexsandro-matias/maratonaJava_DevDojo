//Aula 41 - Blocos de inicializacao
package br.com.abc.javacore.parte06_blocodeinicializacao.classes;

//Fixando valores de quantidade de parcelas num dropdown
public class Cliente
{
	private int[] parcelas;
	// 1. primeira parte executada (Alocado espaço na memória para o objeto que
	// será criado), uma vez que já está em memória. Antes do
	// construtor.
	// 2. Cada atributo de classe é criado e inicializado com seus valores
	// padrão.
	// 3. bloco de inicialização é executado. <- Aula de hoje
	// 4. O construtor é executado;
	// private int[] parcelas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	//
	//
	// bloco de inicialização
	{
		System.out.println("Dentro do Bloco de Inicialização");
		parcelas = new int[100];
		for (int i = 0; i < 100; i++)
		{
			parcelas[i] = i + 1;
		}
		// Escalando o programa -> deixando com 100 posições
		// for (int parcela : this.parcelas)
		// {
		// System.out.print(parcela + " ");
		// }
	}

	// O bloco de construtor é apenas abrir e fechar chaves. Pode ser aberta em
	// qualquer lugar no código. Porém é uma boa prática realizar esse bloco
	// antes do construtor.
	public Cliente()
	{
		System.out.println("Dentro do construtor");
		for (int parcela : this.parcelas)
		{
			System.out.print(parcela + " ");
		}
	}

	public int[] getParcelas()
	{
		return parcelas;
	}

	public void setParcelas(int[] parcelas)
	{
		this.parcelas = parcelas;
	}
}
