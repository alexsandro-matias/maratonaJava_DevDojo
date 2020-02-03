// Aula 62: Interfaces pt 01
package br.com.abc.javacore.parte14_interfaces.classes;

public interface Tributavel
{
	// As interfaces que diz a classe deve fazer, mas nunca como deve fazer. Por
	// que é uma classe totalmente abstrata. Ela é usada como uma comunicação.
	// Assim como as classes abstratas que são extendidas, as interfaces são
	// implementadas. Então elas não podem ser final.
	// A linha abaixo daria erro de compilação.
	// public final interface Tributavel{}
	// Como são classes totalmente abstratas, não é possível implementar métodos
	// concretos.
	// public abstract void calcularImposto(); - forma explícita de declaração.
	void calcularImposto();

	// Da mesma forma que os atributos, estes devem ser totalmente estáticos.
	public static final double IMPOSTO = 0.2; // deve ser inicializada por que
												// são constantes.
}
