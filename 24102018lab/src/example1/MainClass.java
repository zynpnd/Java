package example1;

import java.util.Scanner;

public class MainClass {
	private Ogrenci[] o1;
	public static void main(String[] args) {
		try {
			Scanner al = new Scanner(System.in);
			MainClass a = new MainClass();
			int adet, dadet, derskredi;
			String ad, soyad, no, dersadi;
			double dersnotu;

			System.out.print("Kac ogrenci olacak:  ");
			adet = al.nextInt();
			a.o1 = new Ogrenci[adet];

			al.nextLine();
			for (int i = 0; i < adet; i++) {
				a.o1[i] = new Ogrenci();
				System.out.print("Ogrenci adini giriniz: ");
				ad = al.nextLine();

				System.out.print("Ogrenci soyadini giriniz: ");
				soyad = al.nextLine();

				System.out.print("Ogrenci no giriniz: ");
				no = al.nextLine();

				System.out.print("Kac adet ders girilecek: ");
				dadet = al.nextInt();

				a.o1[i].setAd(ad);
				a.o1[i].setSoyad(soyad);
				a.o1[i].setNo(no);

				al.nextLine();
				Ders[] dersListesi = new Ders[dadet];
				for (int j = 0; j < dadet; j++) {
					dersListesi[j] = new Ders();
					System.out.print("Ders adi giriniz: ");
					dersadi = al.nextLine();

					System.out.print("Ders notunu giriniz: ");
					dersnotu = al.nextDouble();

					System.out.print("Ders kredisini giriniz: ");
					derskredi = al.nextInt();

					dersListesi[j].setAd(dersadi);
					dersListesi[j].setNot(dersnotu);
					dersListesi[j].setKredi(derskredi);

					al.nextLine();
				}
				a.o1[i].setDersListesi(dersListesi);
			}
			for(int i = 0 ; i < adet ; i++) {
				Ders[] dersListesi=a.o1[i].getDersListesi();
				double notort=0.0;
				double nottoplam=0.0;
				int kreditoplam=0;
				for(int j = 0 ; j < dersListesi.length ; j++) {
					nottoplam+=dersListesi[j].getNot();
					kreditoplam+=dersListesi[j].getKredi();
					notort = nottoplam / kreditoplam;
					System.out.println("Not ort: "+notort);
				}
			}
		} catch (Exception e) {
			System.out.print("HATA " + e);
		}
	}
}
