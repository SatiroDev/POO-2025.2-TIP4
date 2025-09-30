package br.edu.calculo;

public class Calculo {

    public static int converterParaSegundos(int horas, int minutos, int segundos) {
        return horas * 3600 + minutos * 60 + segundos;
    }
}