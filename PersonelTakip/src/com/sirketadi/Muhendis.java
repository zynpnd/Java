package com.sirketadi;

public class Muhendis extends Calisan
{
	private int projeID;
	
	public Muhendis(String ad, String soyad, int maas, String bolum, int pID)
	{		
		super();
		setAd(ad);
		setSoyad(soyad);
		setMaas(maas);
		setBolum(bolum);
		projeID = pID;
	}

	public int getProjeID() {
		return projeID;
	}

	public void setProjeID(int projeID) {
		this.projeID = projeID;
	}
	
	public double zamHesapla()
	{
		return 0.05*getMaas() + 200;
	}
}
