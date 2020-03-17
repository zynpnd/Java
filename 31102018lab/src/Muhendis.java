
public class Muhendis extends Personel {
	private int yonettigiProjeSayisi;

	public int getYonettigiProjeSayisi() {
		return yonettigiProjeSayisi;
	}

	public void setYonettigiProjeSayisi(int yonettigiProjeSayisi) {
		this.yonettigiProjeSayisi = yonettigiProjeSayisi;
	}

	public double zamHesapla() {
		double zam = 0.0;
		System.out.println("Muhendis icin zamHesapla cagirildi.");
		zam = getMaas() * 0.1 + yonettigiProjeSayisi * 50;
		return zam;
	}
}
