
public class Programci extends Personel {
	private int bitirdigiProjeSayisi;

	public int getBitirdigiProjeSayisi() {
		return bitirdigiProjeSayisi;
	}

	public void setBitirdigiProjeSayisi(int bitirdigiProjeSayisi) {
		this.bitirdigiProjeSayisi = bitirdigiProjeSayisi;
	}

	public double zamHesapla() {
		double zam = 0.0;
		System.out.println("Programci icin zamHesapla cagirildi.");
		zam = getMaas() * 0.05 + bitirdigiProjeSayisi * 25 + getKidemYili() * 10;
		return zam;
	}
}
