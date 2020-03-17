
public class mainClass {
	public static void main(String[] args) {

		Muhendis m = new Muhendis();
		m.setAdSoyad("Mehmet Cakir");
		m.setKidemYili(3);
		m.setMaas(5000);
		m.setYonettigiProjeSayisi(3);

		Programci p = new Programci();
		p.setAdSoyad("Murat Cakir");
		p.setKidemYili(6);
		p.setMaas(3500);
		p.setBitirdigiProjeSayisi(5);

		SatisElemani e = new SatisElemani();
		e.setAdSoyad("Ferhat Cakir");
		e.setKidemYili(10);
		e.setMaas(4000);
		e.setPazarladigiProjeSayisi(12);

		double zam = m.zamHesapla();
		System.out.println("Muhendis zammi: " + zam);
		zam = p.zamHesapla();
		System.out.println("Programci zammi: " + zam);
		zam = e.zamHesapla();
		System.out.println("SatisElemani zammi: " + zam);

	}

}
