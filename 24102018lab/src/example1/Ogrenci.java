package example1;

public class Ogrenci {
	private String ad;
	private String soyad;
	private String no;
	private Ders[] dersListesi;
	

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
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public Ders[] getDersListesi() {
		return dersListesi;
	}
	public void setDersListesi(Ders[] dersListesi) {
		this.dersListesi = dersListesi;
	}
	public void dersEkle(int index,Ders ders) {
		dersListesi[index]=ders;
	}
	public Ders dersGetir(int index) {
		return dersListesi[index];
	}
	

}
