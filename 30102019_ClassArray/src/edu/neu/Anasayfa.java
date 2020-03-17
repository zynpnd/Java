package edu.neu;

import java.util.Scanner;

public class Anasayfa {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int fAdet;
		double ortalama = 0;
		
		System.out.print("Abone adedini giriniz:");
		fAdet = sc.nextInt();
		
		Fatura faturalar[] = new Fatura[fAdet];
		
		for (int i = 0; i < fAdet; i++)
		{
			faturalar[i] = new Fatura();
			faturalar[i].setId(100 + i);
			
			System.out.print("[" + (i+1) + ".Abone] Elektrik faturasi miktari: ");
			faturalar[i].setElektrik(sc.nextDouble());
			System.out.print("[" + (i+1) + ".Abone] Su faturasi miktari    : ");
			faturalar[i].setSu(sc.nextDouble());
			System.out.print("[" + (i+1) + ".Abone] Gaz faturasi miktari   : ");
			faturalar[i].setGaz(sc.nextDouble());
			System.out.println("----------------------------------------------");
		}
		System.out.println("[1.Adim] -> Abone faturalari diziye eklendi...");
		
		for (int i = 0; i < fAdet; i++)
		{
			ortalama += faturalar[i].OrtalamaFatura();
		}
		ortalama /= fAdet;
		
		System.out.println("[2.Adim] -> Tum abonelerin ortalama fatura degeri hesaplandi: " + String.format("%.2f", ortalama));		
		System.out.println("[3.Adim] -> Ortalamala degere en yakin abone bilgileri:");
		System.out.println("-------------------------------------------------------");
		System.out.println("Abone Fatura Ortalamalari: ");
		double geciciFark;
		double arananFark = Math.abs(ortalama - faturalar[0].OrtalamaFatura());
		int arananIndex = 0;
		System.out.println("[0] -> " + String.format("%.2f", faturalar[0].OrtalamaFatura()));
		
		for (int i = 1; i < fAdet; i++)
		{
			System.out.println("[i] -> " + String.format("%.2f", faturalar[i].OrtalamaFatura()));
			
			geciciFark = Math.abs(ortalama - faturalar[i].OrtalamaFatura());
			if(geciciFark < arananFark)
			{
				arananFark = geciciFark;
				arananIndex = i;
			}
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Aranan Abone Bilgileri: ");
		System.out.println("Index    : " + arananIndex);
		System.out.println("Id       : " + faturalar[arananIndex].getId());
		System.out.println("Elektrik : " + faturalar[arananIndex].getElektrik());
		System.out.println("Su       : " + faturalar[arananIndex].getSu());
		System.out.println("Gaz      : " + faturalar[arananIndex].getGaz());
		System.out.println("Ortalama : " + String.format("%.2f", faturalar[arananIndex].OrtalamaFatura()) );
	}

}
