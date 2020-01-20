//Aula 41 - Blocos de inicializacao
//Aula 43 - Blocos de inicializacao com Métodos estáticos 
//Aula 44 - Blocos de inicializacao com Métodos estáticos 
package br.com.abc.javacore.parte07_modificadorestatico.classes;

//Fixando valores de quantidade de parcelas num dropdown
public class Cliente
{
	// private int[] parcelas;
	// 0. Bloco de inicialização é inicialização é executado quando a JVM
	// carregar a classe é executado o bloco estático.
	// 1. primeira parte executada (Alocado espaço na memória para o objeto que
	// será criado), uma vez que já está em memória. Antes do
	// construtor.
	// 2. Cada atributo de classe é criado e inicializado com seus valores
	// padrão.
	// 3. bloco de inicialização é executado. <- Aula de hoje
	// 4. O construtor é executado;
	private static int[] parcelas =
	{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	//
	//
	// bloco de inicialização
	{
		System.out.println("Dentro do Bloco de Inicialização");
		parcelas = new int[10];
		for (int i = 0; i < 10; i++)
		{
			parcelas[i] = i + 1;
		}
		// Escalando o programa -> deixando com 100 posições
		// for (int parcela : this.parcelas)
		// {
		// System.out.print(parcela + " ");
		// }
	}
	//
	// bloco de inicialização estático com a palavra reservada static antes do
	// bloco e será executada antes do próprio bloco de inicialização
	static
	{
		System.out.println("Dentro do Bloco de Inicialização Estático");
		parcelas = new int[10];
		for (int i = 0; i < 10; i++)
		{
			parcelas[i] = i + 1;
		}
		// Esse bloco será executado apenas uma vez
	}
	// Se tivermos outro bloco estático, eles serão executados à medida da sua
	// ordem.
	static
	{
		System.out.println("segundo bloco de inicialização");
	}

	// O bloco de construtor é apenas abrir e fechar chaves. Pode ser aberta em
	// qualquer lugar no código. Porém é uma boa prática realizar esse bloco
	// antes do construtor.
	public Cliente()
	{
		// System.out.println("Dentro do construtor");
		// for (int parcela : Cliente.parcelas)
		// {
		// System.out.print(parcela + " ");
		// }
	}

	// Um bloco de inicialização não estático pode acessar um bloco estático.
	// Uma vez que o atributo estático vai existir antes mesmo da criação do
	// objeto.
	public static int[] getParcelas()
	{
		return parcelas;
	}
	// public void setParcelas(int[] parcelas)
	// {
	// this.parcelas = parcelas;
	// }
}
