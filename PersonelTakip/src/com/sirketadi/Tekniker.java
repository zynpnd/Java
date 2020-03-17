package com.sirketadi;

public class Tekniker extends Calisan
{
	private Ariza arizalar[] = new Ariza[5];
	
	public void YeniArizaEkle(Ariza arz, int i)
	{
		arizalar[i] = arz;
	}
	
	public Ariza ArizaGetir(int i)
	{
		return arizalar[i];
	}
	/*
	public double zamHesapla()
	{
		return 0.04*getMaas() + 50;
	}
	*/
}
