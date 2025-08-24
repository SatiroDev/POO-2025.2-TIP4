package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, divisao;
		System.out.print("Primeiro número: ");
		n1 = sc.nextDouble();
		System.out.print("Segundo números: ");
		n2 = sc.nextDouble();
		
		divisao = n1 / n2;
		System.out.println(divisao);

	}

}
