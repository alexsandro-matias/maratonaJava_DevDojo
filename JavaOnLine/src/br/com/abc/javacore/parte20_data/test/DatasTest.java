package br.com.abc.javacore.parte20_data.test;

import java.util.Calendar;

public class DatasTest
{
	public static void main(String[] args)
	{
		Calendar calendar = new Calendar()
		{
			@Override public void roll(int field, boolean up)
			{
			}
			
			@Override public int getMinimum(int field)
			{
				return 0;
			}
			
			@Override public int getMaximum(int field)
			{
				return 0;
			}
			
			@Override public int getLeastMaximum(int field)
			{
				return 0;
			}
			
			@Override public int getGreatestMinimum(int field)
			{
				return 0;
			}
			
			@Override protected void computeTime()
			{
			}
			
			@Override protected void computeFields()
			{
			}
			
			@Override public void add(int field, int amount)
			{
			}
		};
	}
}
