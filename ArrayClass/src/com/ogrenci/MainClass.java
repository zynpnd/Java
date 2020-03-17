package com.ogrenci;

import java.util.Scanner;

public class MainClass
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ogrAdet;
		
		System.out.print("Kac ogrenci girilecek:");
		ogrAdet = sc.nextInt();
		
		Ogrenci [] ogrenciler = new Ogrenci[ogrAdet];
		
		for (int i = 0; i < ogrAdet; i++)
		{
			ogrenciler[i] = new Ogrenci();
			
			ogrenciler[i].setOgrNo(1000+i);
			
			System.out.print("Ogr Adi: ");
			ogrenciler[i].setOgrAd(sc.next());
			
			System.out.print("Ogr Soyadi: ");
			ogrenciler[i].setOgrSoyad(sc.next());
			
			ogrenciler[i].setOgrBolum("Bilgisayar Muhendisligi");
		}
		
		for (int i = 0; i < ogrenciler.length; i++)
		{
			System.out.println((i+1) + ".--------------------------");
			System.out.println("Ogr No: " + ogrenciler[i].getOgrNo()
								+ "\nOgr Ad: " + ogrenciler[i].getOgrAd()
								+ "\nOgr Soyad: " + ogrenciler[i].getOgrSoyad()
								+ "\nOgr Bolum: " + ogrenciler[i].getOgrBolum());
		}
	}

}
