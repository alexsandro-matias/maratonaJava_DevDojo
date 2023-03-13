//Aula 84 - Datas com  Date e Calendar
//Aula 85 - Formatação de datas com DateFormat
package br.com.abc.javacore.parte20_datas.test;

import java.util.Calendar;
import java.util.Date;
//Desde a versão 1.0 java existe uma classe 
//chamada Date contida no pacote de utilitários que é responsável por datas. Porém ela não é muito bom com internacionalização.
//Para resolver essa situação, na versão 1.1 foi implementada a classe Calendar. Já a partir do Java 8, 
//também foi criada um novo pacote chamado de Time.
//Na generalidade, os métodos de Date estão obsoletos (deprecated)

public class ManipulacaoDeDatas
{
	public static void main(String[] args)
	{
		// Tempo em milissegundo
		// Date data = new Date(1_000_000_000_000L);
		// System.out.println(data);
		// Date dataAtual = new Date();
		// System.out.println(dataAtual);
		// //
		// // Uma classe muito complicada com manipulação dos dados com vários
		// // métodos
		// // depreciados. Para isso foi utilizada a classe Abstrata Calendar
		// Calendar c = Calendar.getInstance();
		// c.setTime(dataAtual);
		// if (Calendar.SUNDAY == c.getFirstDayOfWeek())
		// {
		// System.out.println("Domingo é o primeiro dia da semana");
		// }
		// System.out.println(c.get(Calendar.DAY_OF_MONTH));
		// System.out.println(c.get(Calendar.DAY_OF_WEEK));
		// System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		// System.out.println(c.get(Calendar.DAY_OF_YEAR));
		// Para adicionar uma hora
		// c.add(Calendar.HOUR, 2);
		// c.add(Calendar.MONTH, 2);
		// // Para manter o mesmo ano
		// c.roll(Calendar.MONTH, 9);
		// Date data2 = c.getTime();
		// System.out.println(data2);
		Date data = new Date();
		Calendar momentoAtual = Calendar.getInstance();
		momentoAtual.setTime(data);
		momentoAtual.add(Calendar.DAY_OF_WEEK, 6);
		int hoje = momentoAtual.get(Calendar.DAY_OF_WEEK);
		if ((hoje == 1) || (hoje == 7))
		{
			System.out.println("Hoje é final de semana");
		}
		else
		{
			System.out.println("Hoje é meio de semana");
		}
	}
}
