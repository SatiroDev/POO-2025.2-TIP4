package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		System.out.print("Digite um número: ");
		n1 = sc.nextDouble();
		
		System.out.print("Digite outro número: ");
		n2 = sc.nextDouble();
		
		if (n1 > n2) {
			System.out.println("O número " + n1 + " é maior que o número " + n2);
		} else if (n1 < n2) {
			System.out.println("O número " + n2 + " é maior que o número " + n1);
		}

	}

}
