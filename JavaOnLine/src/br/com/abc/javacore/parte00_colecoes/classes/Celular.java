// Aula 117 - Coleções pt 02 Introdução a Hashcode
// Aula 118 - Coleções pt 03 Introdução as coleções
package br.com.abc.javacore.parte00_colecoes.classes;

public class Celular
{
	private String nome;
	private String imei;
	// mecanismo para ID do celular para identificar que
	// eles são iguais. No caso de banco de dados -> busca de chave primária.
	//
	// Regras para o método equals:
	// 1. Ser reflexivo = x.equals(x) tem que ser sempre true diferente de null
	// 2. Simétrico -> para x e y diferentes de null, se x.equals(y) == true <=>
	// y.equals(x)
	// 3. transistividade -> para x,y,z diferentes de null, se x.equals(y) ==
	// true <=> x.equals(z) == true <=> y.equals(z) == true
	// 4. consistente = x.equals(y) deve retornar o mesmo valor
	// se x.equals(y) == true <=> y.hashcode() == x.hashcode

	//
	// Devemos fazer a o sobrescrição de Object
	@Override public boolean equals(Object obj) // Como podemos passar um Object
												// podemos passar qualquer
												// classe pelas regras de
												// polimorfismo
	{
		if (obj == null) return false;
		if (obj == this) return true;
		//
		// Como é passado como parâmetro um argumento do tipo Object, pode ser
		// passado qualquer tipo. Então é necessário saber qual a classe do
		// objeto que está sendo passado para dentro deste método. Para
		// sabermos, usamos o método getClass()
		//
		if (this.getClass() != obj.getClass()) return false; // Para saber se os
																// celulares são
																// iguais,
																// iremos
																// comparar os
																// IMEI's
		Celular outroCelular = (Celular) obj;
		// comparando duas Strings e não dois objetos, já que o método é
		// sobrescrito de Ibject
		return imei != null ? imei.equals(outroCelular.getImei()) : false;
		// Forma simplificada
		// return imei != null && imei.equals(outroCelular.getImei());
	}
	//
	// A tabela hash vai organizar os dados para que se tenha um maior
	// performance na inserção e busca destes dados se dando através da relação
	// chave e valor. A regra para consistência do Hashcode:
	// se x.equals(y) == true <=> y.hashcode() == x.hashcode - Já que o mesmo
	// hash gerado não garante que foram oriundo da mesma chave.
	// Da mesma forma que:
	// y.hashcode() != x.hashcode <=> x.equals(y) deverá ser false
	//
	// // Método automático do Eclipse
	// @Override public int hashCode()
	// {
	// return super.hashCode();
	// }

	@Override public int hashCode()
	{
		// return imei.hashCode();
		return imei != null ? imei.hashCode() : 1; // Neste caso, em caso de do
													// hash ser nulo, retorna
													// uma constante como flag
													// de erro.
		//
		// return 1; // Já neste caso, mesmo compilando, a performance seria
		// péssima, uma vez que todos os valores seria gerados a partir do mesmo
		// valor o que ficaria muito custoso para que se achasse o valor da
		// elemento.
	}

	public Celular(String nome, String imei)
	{
		super();
		this.nome = nome;
		this.imei = imei;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getImei()
	{
		return imei;
	}

	public void setImei(String imei)
	{
		this.imei = imei;
	}

	@Override public String toString()
	{
		return "Celular [nome=" + nome + ", imei=" + imei + "]";
	}
}
