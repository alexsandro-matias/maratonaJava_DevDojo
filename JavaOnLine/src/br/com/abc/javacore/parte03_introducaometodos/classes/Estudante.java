package br.com.abc.javacore.parte03_introducaometodos.classes;
//Aula 35 - Exercício de Métodos
//Aula 36 - Modificado de acesso private, getters e setters.
//Aula 37 - Modificado de acesso private, getters e setters.
public class Estudante
{
	// public String nome;
	// public int idade;
	// public double[] notas;
	private String nome;
	private int idade;
	private double[] notas;
	private boolean aprovado; // atributo implementado depois
	
	public void imprimirAtributos()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("idade: " + this.idade);
		for (double d : notas)
		{
			System.out.println(d + " ");
		}
	}
	
	public void calculaMedia()
	{
		if (notas == null)
		{
			System.out.println("O aluno não possue notas");
			return;
		}
		double soma = 0 , media = 0;
		for (double nota : notas)
		{
			soma += nota;
		}
		media = soma / notas.length;
		if (media > 6)
		{
			this.aprovado = true;
			System.out.print("Média: " + media);
			System.out.println(" -> Aluno aprovado.");
		}
		else
		{
			this.aprovado = false;
			System.out.print("Média: " + media);
			System.out.println(" -> Aluno reprovado.");
		}
	}
	
	// Um conceito importante é o de acomplamento, que é o quanto uma classe está
	// relacionada com outra. Isso não é bom para o projeto, uma vez que se for
	// tirado um componente acomplado, o sistema tende a quebrar, já que essa classe
	// influencia outras. Já um baixo acomplamento é o ideal uma classe não estará
	// fortemente ligada a outra. Se colocarmos um valo negativo em idade, o
	// programa irá permitir já que estamos acessando diretamente o atributo.
	// Devemos protegê-los de forma que eles passem por um métodos antes de serem
	// acessados ou modificados -> mudando o modificador de acesso -> private ->
	// Somente será visível somente para a classe Estudante. Caso seja declarado
	// atributo em outra classe, dará um erro de compilação, já que a outra classe,
	// não deveria nem saber de existência do atributo privado.
	//
	// O padrão de nomemclatura utilizado em Frameworks é para colocar algum valor
	// dentro da variável é o SET
	// public void setNome(String nome)
	// {
	// nome = nome;
	// }
	// Desta forma você atribuindo o valor da variável local NOME a ela mesma.
	// Por isso precisamos passar a palavra THIS para referenciar o atribuito da
	// classe (variável de instância), e não a variável global.
	public void setNome(String nome) // mesmo tipo da variável de instância
	{
		this.nome = nome;
	}
	
	// Porém apenas para acessar, ou buscar um valor, usamos o método GETTER, com
	// retorno do mesmo tipo do atributo de instância.
	public int getIdade()
	{
		return idade;
	}
	
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	
	public double[] getNotas()
	{
		return notas;
	}
	
	public void setNotas(double[] notas)
	{
		this.notas = notas;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public boolean isAprovado() // is também é um padrão para booleano
	{
		return aprovado;
	}
	// Como há um método para verificar se aluno foi reprovado ou não, esse método
	// não pode existir, já que ele pode fazer alguma alteração que sobrepunha o
	// método do cálculo da média
	// public void setAprovado(boolean aprovado)
	// {
	// this.aprovado = aprovado;
	// }
}
