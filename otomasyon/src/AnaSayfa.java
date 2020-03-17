import java.util.Scanner;

public class AnaSayfa {

	static Ogrenci[] ogr;
	static Ders[] ders;
	static Sinav[] sinavlar;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ekle();
		int secim;
		System.out.println("\n");
		while (1 == 1) {
			System.out.println("\n");
			System.out.println("  1.) Tum bilgileri Listele ");
			System.out.println("  2.) Ogrenci Adina Gore Arama Yap");
			System.out.println("  3.) Ders Adina Gore Arama Yap");
			System.out.println("  4.) Cikis Yap");
			System.out.println("Seciminiz:");
			secim = sc.nextInt();
			switch (secim) {
			case 1:
				listeleme();
				break;
			case 2:
				OgrArama();
				break;
			case 3:
				DersArama();
				break;
			case 4:
				System.out.println("Programdan cikiliyor....");
				System.exit(0);
				break;
			default:
				System.out.println("Yanlis secim yaptiniz!");
				break;
			}
		}
	}

	public static void ekle() {
		Scanner sc = new Scanner(System.in);
		int ogradet, dersadet, notadet, sayac;
		String temp;
		Long temp2;

		System.out.println("Kac ogrenci girilecek:");
		ogradet = sc.nextInt();

		ogr = new Ogrenci[ogradet];

		for (int i = 0; i < ogradet; i++) {

			ogr[i] = new Ogrenci();

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println((i + 1) + ".Ogrencinin numarasi: ");
			ogr[i].setOgrenciNo(sc.nextLong());
			temp2 = ogr[i].getOgrenciNo();
			try {
				int l = 0;
				while (l < i) {
					if (ogr[l].getOgrenciNo() == temp2) {
						System.out.println("Girdiginiz ogrenci numarasi daha once kullandiniz.Lutfen tekrar giriniz ");
						System.out.println((i + 1) + ".Ogrencinin numarasi: ");
						ogr[i].setOgrenciNo(sc.nextLong());
					}
					l++;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println((i + 1) + ".Ogrencinin adi: ");
			ogr[i].setAd(sc.next());
			System.out.println((i + 1) + ".Ogrencinin soyadi: ");
			ogr[i].setSoyad(sc.next());
			System.out.println((i + 1) + ".Ogrencinin bolumu: ");
			ogr[i].setBolum(sc.next());

			System.out.print("Kac ders alacak: ");
			dersadet = sc.nextInt();

			ders = new Ders[dersadet];

			for (int j = 0; j < dersadet; j++) {

				ders[j] = new Ders();
				System.out.println((i + 1) + ".Ogrencinin " + (j + 1) + ".Ders IDsi: ");
				ders[j].setDersID(sc.next());
				temp = ders[j].getDersID();
				try {
					int k = 0;
					while (k < j) {
						if (ders[k].getDersID().equals(temp)) {
							System.out.println("Girdiginiz ders id daha once kullandiniz.Lutfen tekrar giriniz ");
							System.out.println((i + 1) + ".Ogrencinin " + (j + 1) + ".Ders IDsi: ");
							ders[j].setDersID(sc.next());
						}
						k++;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}

				System.out.println((i + 1) + ".Ogrencinin " + (j + 1) + ".Ders Adi: ");
				ders[j].setDersAd(sc.next());
				System.out.println((i + 1) + ".Ogrencinin " + (j + 1) + ".Ders Kredisi: ");
				ders[j].setDersKredi(sc.nextInt());
				System.out.println((i + 1) + ".Ogrencinin " + (j + 1) + ".Ders Donem: ");
				ders[j].setDersDonem(sc.nextInt());

			}

			ogr[i].setDersler(ders);
			System.out.println("Kac sinav girilecek: ");
			notadet = sc.nextInt();
			while (notadet > dersadet) {
				System.out.println("Sinav sayisi ders sayisi kadar olmalidir.Yanlis girdiniz.");
				System.out.print("Kac sinav girilecek: ");
				notadet = sc.nextInt();
			}
			sinavlar = new Sinav[notadet];
			for (int j = 0; j < notadet; j++) {

				sinavlar[j] = new Sinav();
				System.out.println((i + 1) + ".Ogrencinin " + (j + 1) + ".Sinav IDsi: ");
				sinavlar[j].setSinavID(sc.nextInt());
				sayac = sinavlar[j].getSinavID();
				try {
					int k = 0;
					while (k < j) {
						if (sinavlar[k].getSinavID() == sayac) {
							System.out.println("Girdiginiz sinav id daha once kullanýldý.Tekrar deneyin");
							System.out.println((i + 1) + ".Ogrencinin " + (j + 1) + ".Sinav IDsi: ");
							sinavlar[j].setSinavID(sc.nextInt());
						}
						k++;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}

				System.out.println((i + 1) + ".Ogrencinin " + (j + 1) + ".Ders IDsi: ");
				sinavlar[j].setDersID(sc.next());

				while (karsilastir(sinavlar, ders) == 0) {
					System.out.println("Boyle bir ders yok.Tekrar giriniz:");
					System.out.println((i + 1) + ".Ogrencinin " + (j + 1) + ".Ders IDsi: ");
					sinavlar[j].setDersID(sc.next());
					break;
				}
				if (karsilastir(sinavlar, ders) == -1) {
					System.out.println("Ogrenci yoktur.");
					System.exit(0);
				} else

					System.out.println((i + 1) + ".Ogrencinin " + (j + 1) + ".Sinav Tarihi:");
				sinavlar[j].setSinavTarihi(sc.next());
			}

			ogr[i].setSinavlar(sinavlar);

		}
	}

	public static int karsilastir(Sinav[] sinav, Ders[] ders) {
		for (int i = 0; i < ogr.length; i++) {

			for (int j = 0; j < ogr[i].getDersler().length; j++) {

				if (ders[i].getDersID().equals(sinav[j].getDersID())) {
					return 1;
				} else {
					return 0;
				}
			}
		}
		return -1;
	}

	public static void listeleme() {

		for (int i = 0; i < ogr.length; i++) {
			System.out.println("\n");
			System.out.println((i + 1) + ".Ogrenci: " + ogr[i].getOgrenciNo() + " " + ogr[i].getAd() + " "
					+ ogr[i].getSoyad() + " " + ogr[i].getBolum());
			System.out.println(" DERSLER:");
			for (int j = 0; j < ogr[i].dersler.length; j++) {

				System.out.println(
						" \t" + (j + 1) + ".DERS:" + ogr[i].dersler[j].getDersID() + " " + ogr[i].dersler[j].getDersAd()
								+ " " + ogr[i].dersler[j].getDersKredi() + " " + ogr[i].dersler[j].getDersDonem());
			}
			System.out.println(" Sinavlar:");
			for (int k = 0; k < ogr[i].sinavlar.length; k++) {

				System.out.println(" \t" + (k + 1) + ".Sinav:" + ogr[i].sinavlar[k].getSinavID() + " "
						+ ogr[i].sinavlar[k].getDersID() + " " + ogr[i].sinavlar[k].getSinavTarihi());
			}
		}
	}

	public static void OgrArama() {
		Scanner sc = new Scanner(System.in);
		String ogrAd;
		System.out.println("Aranacak ogrenci adini giriniz:");
		ogrAd = sc.nextLine();
		System.out.println("\n");
		for (int i = 0; i < ogr.length; i++) {
			if (ogr[i].getAd().equals(ogrAd)) {
				System.out.println((i + 1) + ".Ogrenci: " + ogr[i].getOgrenciNo() + " " + ogr[i].getAd() + " "
						+ ogr[i].getSoyad() + " " + ogr[i].getBolum());
			} else {
				System.out.println("Boyle bir ogrenci yoktur.Tekrar deneyin.");
			}
		}
	}

	public static void DersArama() {
		Scanner sc = new Scanner(System.in);
		String dersAd;
		System.out.println("Aranacak ders adini giriniz:");
		dersAd = sc.nextLine();
		System.out.println("\n");
		try {
			for (int i = 0; i < ogr.length; i++) {
				for (int j = 0; j < ogr[i].getDersler().length; j++) {
					if (ogr[i].dersler[j].getDersAd().equals(dersAd)) {
						System.out.println((i + 1) + ".Ogrenci: " + ogr[i].getOgrenciNo() + " " + ogr[i].getAd() + " "
								+ ogr[i].getSoyad() + " " + ogr[i].getBolum());
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
