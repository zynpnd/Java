import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Personel> pListesi = new ArrayList<Personel>();
		Personel p;
		int pID;

		while (true) {
			System.out.println((pListesi.size() + 1) + ". personelin id'sini giriniz:");
			System.out.println("[Eklemeyi bitirmek icin -1 giriniz:");
			pID = sc.nextInt();

			if (pID == -1) {
				break;
			} else {
				p = new Personel();
				p.setpID(pID);

				System.out.print((pListesi.size() + 1) + ". personelin adini giriniz:");
				p.setpAd(sc.next());
				System.out.print((pListesi.size() + 1) + ". personelin soyadini giriniz:");
				p.setpSoyad(sc.next());
				System.out.print((pListesi.size() + 1) + ". personelin maasini giriniz:");
				p.setpMaas(sc.nextDouble());
				System.out.print((pListesi.size() + 1) + ". personelin giris yilini giriniz:");
				p.setpGirisYil(sc.nextInt());

				pListesi.add(p);
			}
		}

		System.out.println("Duzenlemeden Onceki Maas Listesi:");
		Listele(pListesi);

		Duzenle(pListesi);

		System.out.println("Duzenlemeden Sonraki Maas Listesi:");
		Listele(pListesi);

	}
	private static void Duzenle(List<Personel> pList) {
		int buYil = Calendar.getInstance().get(Calendar.YEAR);
		Personel p;
		for (int i = 0; i < pList.size(); i++) {
			p = pList.get(i);

			if ((buYil - p.getpGirisYil()) >= 10 && p.getpMaas() > 5000)
				p.setpMaas(p.getpMaas() + p.getpMaas() * 0.15 + 250);
			else
				p.setpMaas(p.getpMaas() + p.getpMaas() * 0.1 + 150);
		}
	}

	private static void Listele(List<Personel> pList) {
		for (Personel p : pList) {
			System.out.println("Ad-Soyad: " + p.getpAd() + " " + p.getpSoyad() + "\t Maas: "
					+ String.format("%.2f", p.getpMaas()));
		}
	}

}
