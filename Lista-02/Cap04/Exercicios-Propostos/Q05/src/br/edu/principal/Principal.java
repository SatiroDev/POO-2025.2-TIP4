package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		int esc_usuario;
		
		System.out.print("Digite um número: ");
		n1 = sc.nextDouble();
		
		System.out.print("Digite outro número: ");
		n2 = sc.nextDouble();
		
		System.out.println("MENU");
		System.out.println("[1] Média entre os números");
		System.out.println("[2] Diferença do maior pelo menor");
		System.out.println("[3] Produto entre os números digitados");
		System.out.println("[4] Divisão do primeiro pelo segundo");
		
		System.out.print("Escolha uma opção: ");
		esc_usuario = sc.nextInt();
		
		switch (esc_usuario) {
			case 1:
				System.out.println("A média entre os números " + n1 + " e " + n2 + " é igual a: " + ((n1 + n2)/2));
				break;
			case 2:
				if (n1 >= n2) {
					System.out.println("A diferença entre " + n1 + " e " + n2 + " é de " + (n1 - n2));
				} else {
					System.out.println("A diferença entre " + n2 + " e " + n1 + " é de " + (n2 - n1));
				}
				break;
			case 3:
				System.out.println("O produto entre " + n1 + " e " + n2 + " é igual a: " + (n1 * n2));
				break;
			case 4:
				if (n2 != 0 & n1 != 0) {
					System.out.println("A divisão entre " + n1 + " e " + n2 + " é igual a: " + (n1 / n2));
				} else {
					System.out.println("Divisão não pode ser feita com um número com o valor 0");
				}
				
				break;
			default:
				System.out.println("Opção '"+ esc_usuario + "' é inválida!");
		}
		
		

	}

}
