package dosya.islemleri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		String dosyaAdi = "personel.txt";
		List <Personel> pList = DosyadanOku(dosyaAdi);
		
		if(pList.size() > 0)
		{
			ListeYazdir(pList);
			
			MaasGuncelle(pList);
			
			ListeYazdir(pList);
			
			DosyayaYaz(dosyaAdi, pList);
		}
	}
	
	private static List<Personel> DosyadanOku(String dosyaAdi)
	{
		List<Personel> pL = new ArrayList<Personel>();
		Personel p;
		File dosya = new File(dosyaAdi);
		
		if(dosya.exists())
		{
			try {
				Scanner sc = new Scanner(dosya);
				while(sc.hasNextLine())
				{	
						p = new Personel();
						p.setpAd(sc.next());
						p.setpSoyad(sc.next());
						p.setpMaas(sc.nextDouble());
						pL.add(p);
					 
				}
				sc.close();
				System.out.println("Dosyadan okunan veri sayisi: " + pL.size());
			}
			catch (Exception e)
			{
				pL.clear();
				e.printStackTrace();
				
				
				System.out.println("Dosya okumada hata olustu");
			}
		}
		else
		{
			System.out.println("Dosya bulunamadi!");
		}
		
		return pL;
	}

	private static void ListeYazdir(List<Personel> pL)
	{
		System.out.println("\nPersonel Listesi");
		for(Personel p: pL)
		{
			System.out.println(p.getpAd() + " " + p.getpSoyad() 
										  + " " + String.format("%.2f", p.getpMaas()));
		}
		System.out.println("\n");
	}

	private static void MaasGuncelle(List<Personel> pL)
	{
		for(Personel p: pL)
		{
			p.setpMaas(p.getpMaas() + p.getpMaas()*0.1);
		}
		System.out.println("Personel Maaslari guncellendi!");
	}
	
	private static void DosyayaYaz(String dosyaAdi, List<Personel> pL)
	{
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(dosyaAdi));
			int i=0;//i'degiskeni hata duzeltmek icin tanýmlanmistir
			for(Personel p:pL)
			{
				i++;
				pw.print(p.getpAd() + " " + p.getpSoyad() + " " + String.format("%.2f",p.getpMaas()));
				if(i!=pL.size())// hata burada duzeltilmistir 
				{
					pw.print("\n");
				}
			}
			pw.close();
			System.out.println("Personeller dosyaya yazildi.");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}
}
