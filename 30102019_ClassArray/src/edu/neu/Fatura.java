package edu.neu;

public class Fatura
{
	private int id;
	private double elektrik;
	private double su;
	private double gaz;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getElektrik() {
		return elektrik;
	}
	public void setElektrik(double elektrik) {
		this.elektrik = elektrik;
	}
	public double getSu() {
		return su;
	}
	public void setSu(double su) {
		this.su = su;
	}
	public double getGaz() {
		return gaz;
	}
	public void setGaz(double gaz) {
		this.gaz = gaz;
	}
	
	public double OrtalamaFatura()
	{
		return (elektrik + su + gaz)/3;
	}
	
}
