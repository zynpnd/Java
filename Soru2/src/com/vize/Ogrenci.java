package com.vize;

public class Ogrenci
{
	public String ad;
	public String soyad;
	private Ders dersler[];
	
	public Ders[] getDersler() {
		return dersler;
	}
	public void setDersler(Ders[] dersler) {
		this.dersler = dersler;
	}
}
