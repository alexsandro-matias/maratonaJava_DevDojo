package br.com.abc.javacore.colecoes.test;

public class Celular
{
	private String nome;
	private String imei;
	// mecanismo para ID do celular para identificar que
	// eles são iguais. No caso de banco de dados -> busca de chave primária.
	//
	// Regras para o método equals:
	// 1. Ser reflexivo = x.equals(x) tem que ser sempre true diferente de null
	// 2. imétrico -> para x e y diferentes de null, se x.equals(y) == true <=>
	// y.equals(x)
	// 3. transistividade -> para x,y,z diferentes de null, se x.equals(y) ==
	// true <=> x.equals(z) == true <=> y.equals(z) == true
	// 4. consistente = x.equals(y) deve retornar o mesmo valor

	//
	// Devemos fazer a o sobrescrição de Object
	@Override public boolean equals(Object obj) // Como podemos passar um Object
												// podemos passar qualquer
												// classe pelas regras de
												// polimorfismo
	{
		if (obj == null) return false;
		if (obj == this) return true;
		if (this.getClass() != obj.getClass()) return false;// get celular para
															// saber
		// Para saber se os celulares são iguais, iremos comparar os IMEI's
		Celular outroCelular = (Celular) obj;
		// comparando duas Strings e não dois objetos, já que o método é
		// sobrescrito de Ibject
		return imei != null ? imei.equals(outroCelular.getImei()) : false;
	}
	
	@Override public int hashCode()
	{
		return super.hashCode();
	}
	

	public Celular(String nome, String imei)
	{
		super();
		this.nome = nome;
		this.imei = imei;
	}

	public Celular()
	{
		// TODO Auto-generated constructor stub
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
