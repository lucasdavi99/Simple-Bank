package entities;


public class Passagem{
	public String tipo;
	public double A;
	public double B;
	
	
	
	public double totalPassagem() {
		return (A + B) * 4;
	}
}


	