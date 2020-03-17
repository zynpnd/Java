
public class Personel {
	private String adSoyad;
	private double maas;
	private int kidemYili;

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public int getKidemYili() {
		return kidemYili;
	}

	public void setKidemYili(int kidemYili) {
		this.kidemYili = kidemYili;
	}

	public double zamHesapla() {
		double zam = 0.0;
		System.out.println("Personel icin zamHesapla cagirildi.");
		zam = maas * 0.05 + maas * 0.005 * kidemYili;
		return zam;
	}

}
