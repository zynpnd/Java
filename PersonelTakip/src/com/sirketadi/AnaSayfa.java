package com.sirketadi;

public class AnaSayfa {

	public static void main(String[] args)
	{
		Ariza a;
		Muhendis muhendis = new Muhendis("Mehmet", "Durmus", 6500, "Yazilim", 11);
		Tekniker tekniker = new Tekniker();
		tekniker.setAd("Ali");
		tekniker.setSoyad("Tas");
		tekniker.setBolum("Teknik");
		tekniker.setMaas(3500);
		
		double mZam = muhendis.zamHesapla();
		double tZam = tekniker.zamHesapla();
		
		System.out.println("Zamdan onceki muhendis maasi: " + muhendis.getMaas());
		System.out.println("Muhendis zammi: "+ String.format("%.2f", mZam));
		muhendis.setMaas(muhendis.getMaas() + (int)mZam);
		System.out.println("Zamdan sonraki muhendis maasi: " + muhendis.getMaas());
		
		System.out.println("Zamdan onceki tekniker maasi: " + tekniker.getMaas());
		System.out.println("Tekniker zammi: "+ String.format("%.2f", tZam));
		tekniker.setMaas(tekniker.getMaas() + (int)tZam);
		System.out.println("Zamdan sonraki tekniker maasi: " + tekniker.getMaas());
		
		for (int i = 0; i < 5; i++)
		{
			a = new Ariza();
			a.setArizaID(i+1);
			a.setArizaBirim("Bolum " + (i+1));
			
			tekniker.YeniArizaEkle(a, i);
		}
		
		System.out.println("------------------------------");
		
		for (int i = 0; i < 5; i++)
		{
			a = tekniker.ArizaGetir(i);
			System.out.println("Id: " + a.getArizaID() + "\tBirim: " + a.getArizaBirim());
		}
		
	}

}
