package com.vize;

import java.util.Random;
import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ogrAdet=3;
		int dersAdet = 2;
		Ogrenci ogrenciler[] = new Ogrenci[10];
		Ders dersler[];// = new Ders[5];
		
		for (int i = 0; i < ogrAdet; i++)
		{
			ogrenciler[i] = new Ogrenci();
			System.out.print("Ogrenci adi:");
			ogrenciler[i].ad = sc.next();
			System.out.print("Ogrenci soyadi:");
			ogrenciler[i].soyad = sc.next();
			
			dersler = new Ders[dersAdet];
			for (int j = 0; j < dersAdet; j++)
			{
				dersler[j] = new Ders();
				dersler[j].id = "100" + j;
				dersler[j].vize = (int)Math.random()*100;
				dersler[j].finall = (int)Math.random()*100;
				
				dersler[j].gecmeNotu = (int)(dersler[j].vize*0.4 + dersler[j].finall*0.6);
			}
			ogrenciler[i].setDersler(dersler);
		}
		
		int maxIndex = 0;
		double maxOrt=-1;
		double tempOrt=0;
		
		for (int i = 0; i < ogrAdet; i++) {
			tempOrt = 0;
			for (int j = 0; j < dersAdet; j++) {
				tempOrt += ogrenciler[i].getDersler()[j].gecmeNotu;
			}
			tempOrt /= dersAdet;
			if(tempOrt > maxOrt)
			{
				maxIndex = i;
				maxOrt = tempOrt;
			}
		}
		
		System.out.println("Max ortalamaya sahip ogrenci: " 
				+ ogrenciler[maxIndex].ad + " " 
				+ ogrenciler[maxIndex].soyad);
		
	}

}
