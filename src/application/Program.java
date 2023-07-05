package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Passagem;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Passagem  tarifaTotal; 
		
		tarifaTotal = new Passagem();
		
		System.out.println("Coloque o valor das duas passagens que você paga: ");
		System.out.print("Primeira passagem: ");
		tarifaTotal.A = sc.nextDouble();
		System.out.print("Segunda passagem: ");
		tarifaTotal.B = sc.nextDouble();
		
		double valorTotal = tarifaTotal.totalPassagem();
		
		System.out.printf("Valor Total: %.2f%n", valorTotal);
		
		
		
		
		sc.close();
	}
}