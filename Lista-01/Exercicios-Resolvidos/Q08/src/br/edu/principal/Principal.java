package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dep, taxa, rend, total;
		System.out.print("Valor do depósito: ");
		dep = sc.nextDouble();
		System.out.print("Taxa do juros: ");
		taxa = sc.nextDouble();
		rend = dep * taxa/100;
		total = dep + rend;
		System.out.println(rend);
		System.out.println(total);
	}

}
