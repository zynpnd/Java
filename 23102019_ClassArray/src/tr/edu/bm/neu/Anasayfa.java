package tr.edu.bm.neu;

import java.util.Scanner;

public class Anasayfa {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int takimSayisi;
		
		System.out.print("Kac takim girilecek: ");
		takimSayisi = sc.nextInt();
		
		Takim []takimlar = new Takim[takimSayisi];
		
		for (int i = 0; i < takimSayisi; i++)
		{
			takimlar[i] = new Takim();
			System.out.println("--------------------------------------");
			System.out.print("[" + (i+1) + ". Takim] -> adi: ");
			takimlar[i].setTakimAd(sc.next());
			System.out.print("[" + (i+1) + ". Takim] -> attigi gol sayisi: ");
			takimlar[i].setAttigiGol(sc.nextInt());
			System.out.print("[" + (i+1) + ". Takim] -> yedigi gol sayisi: ");
			takimlar[i].setYedigiGol(sc.nextInt());
		}
		
		int arananIndex = 0;
		int enYuksekAveraj = takimlar[0].AverajHesapla();
		int geciciAveraj;
		
		for (int i = 1; i < takimSayisi; i++)
		{
			geciciAveraj = takimlar[i].AverajHesapla();
			
			if(geciciAveraj > enYuksekAveraj)
			{
				enYuksekAveraj = geciciAveraj;
				arananIndex = i;
			}
		}
		
		System.out.println("---------------------------------");
		System.out.println("En yuksek averaja sahip takim:");
		System.out.println("---------------------------------");
		System.out.println("Index     : " + arananIndex);
		System.out.println("Takim ad  : " + takimlar[arananIndex].getTakimAd());
		System.out.println("Attigi gol: " + takimlar[arananIndex].getAttigiGol());
		System.out.println("Yedigi gol: " + takimlar[arananIndex].getYedigiGol());
		System.out.println("Averaj    : " + enYuksekAveraj);
		System.out.println("---------------------------------");
	}

}
