package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, salreceber, imp;
		System.out.print("Salário: ");
		sal = sc.nextDouble();
		imp = sal * 10/100;
		salreceber = sal + 50 - imp;
		System.out.println(salreceber);

	}

}
