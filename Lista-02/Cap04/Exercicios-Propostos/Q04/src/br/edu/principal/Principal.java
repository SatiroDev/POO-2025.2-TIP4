package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3;
		System.out.print("Digite um número: ");
		n1 = sc.nextDouble();
		
		System.out.print("Digite outro número: ");
		n2 = sc.nextDouble();
		
		System.out.print("Digite outro número: ");
		n3 = sc.nextDouble();
		
		if (n1 > n2 & n1 > n3) {
			System.out.println("O maior número digitado foi o " + n1);
		} else if (n2 > n1 & n2 > n3) {
			System.out.println("O maior número digitado foi o " + n2);
		} else if (n3 > n1 & n3 > n2) {
			System.out.println("O maior número digitado foi o " + n3);
		}
		
	}

}
