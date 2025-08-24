package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, peso1, peso2, media;
		System.out.print("Primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Segunda nota: ");
		nota2 = sc.nextDouble();
		peso1 = 2;
		peso2 = 3;
		media = ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);
		System.out.println(media);

	}

}
