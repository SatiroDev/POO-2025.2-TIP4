package br.edu.calculo;

public class Calculo {
	
    public static int somaNumerosEntre1eN(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
	
}