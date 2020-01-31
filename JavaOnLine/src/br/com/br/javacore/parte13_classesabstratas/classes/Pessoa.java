// Aula 61 - Classes abstratas pt 02

package br.com.br.javacore.parte13_classesabstratas.classes;

public abstract class Pessoa
{
	protected String nome;

	public abstract void imprime();
	// Esse método deve ser implementado na primeira classe concreta da árvore
	// de herança, Já que é um método abstrato. Ela não apresentará erro de
	// compilação caso as outras classes abaixo na árvore forem abstratas.

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
}
