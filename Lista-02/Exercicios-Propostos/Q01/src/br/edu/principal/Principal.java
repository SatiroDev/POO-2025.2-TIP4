package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, media;
		System.out.printf("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.printf("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		System.out.printf("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
		
		System.out.printf("Digite a quarta nota: ");
		nota4 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		

	}

}
