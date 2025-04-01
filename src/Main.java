//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo.

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       double valor, area;
       double pi;
       pi = 3.14159;

       valor = sc.nextDouble();

       area = pi * (valor * valor);

       System.out.printf("valor da area do raio = %.4f%n", area);

        sc.close();
    }
}
