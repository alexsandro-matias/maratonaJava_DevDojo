//Aula 84 - Datas com  Date e Calendar
//Aula 85 - Formatação de datas com DateFormat
package br.com.abc.javacore.parte19_string.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatas
{
	public static void main(String[] args)
	{
		Date data = new Date(1_000_000_000_000L); // em milissegundo
		System.out.println(data);
		//
		Date dataAtual = new Date();
		System.out.println(dataAtual);
		//
		// Uma classe muito complicada com manipulação dos dados com vários métodos
		// depreciados. Para isso foi utilizada a classe Abstrata Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		c.setTime(dataAtual);
		if (Calendar.SUNDAY == c.getFirstDayOfWeek())
		{
			System.out.println("Domingo é o primeiro dia da semana");
		}
		System.out.println(Calendar.DAY_OF_MONTH);
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println(Calendar.DAY_OF_YEAR);
		// Para adicionar uma hora
		c.add(Calendar.HOUR, 2);
		c.add(Calendar.MONTH, 2);
		// Para manter o mesmo ano
		c.roll(Calendar.MONTH, 9);
		Date data2 = c.getTime();
		System.out.println(data2);
		//
	}
}
