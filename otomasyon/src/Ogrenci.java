
public class Ogrenci {

	
	 private long ogrenciNo;
	 private String ad;
	 private String soyad;
	 private String bolum;
	 Ders[] dersler;
	 Sinav[] sinavlar;
	
	 
	 public long getOgrenciNo() {
		return ogrenciNo;
	}
	public void setOgrenciNo(long ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	public Ders[] getDersler() {
		return dersler;
	}
	public void setDersler(Ders[] dersler) {
		this.dersler = dersler;
	}
	public Sinav[] getSinavlar() {
		return sinavlar;
	}
	public void setSinavlar(Sinav[] sinavlar) {
		this.sinavlar = sinavlar;
	}
	 
}
