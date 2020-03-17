package tr.edu.bm.neu;

public class Takim
{
	private String takimAd;
	private int attigiGol;
	private int yedigiGol;
	
	public String getTakimAd() {
		return takimAd;
	}
	public void setTakimAd(String takimAd) {
		this.takimAd = takimAd;
	}
	public int getAttigiGol() {
		return attigiGol;
	}
	public void setAttigiGol(int attigiGol) {
		this.attigiGol = attigiGol;
	}
	public int getYedigiGol() {
		return yedigiGol;
	}
	public void setYedigiGol(int yedigiGol) {
		this.yedigiGol = yedigiGol;
	}
	
	public int AverajHesapla()
	{
		return attigiGol - yedigiGol;
	}
	
}
