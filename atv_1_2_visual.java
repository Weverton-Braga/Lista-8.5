package Atividades.lista_8_5;

import java.util.Scanner;

public class atv_1_2_visual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int cont = 0;
        int save;

        System.out.println("===Conjectura de Collatz Visual===\n");
        System.out.println("Digite um número inteiro positivo.\nSe o número for par, ele é dividido por 2.\nSe o for impar, ele é multiplicado por 3 e somado 1.\nOs passos vão ser acumulados e somados enquando o número for diferente de 1.\nNo final sera exibido quantos passos matematico foram necessarios.\nCada calculo sera exibido.\n");
        System.out.print("Digite o número: ");
        n = sc.nextInt();
        while (n < 1) {
            System.out.print("\nNúmero invalido.\nDigite um número interio positivo: ");
            n = sc.nextInt();
        }

        while (n > 1) {
            if (n % 2 == 0) {
                save = n / 2;
                System.out.println(n + " / " + 2 + " = " + save);
            } else {
                save = n * 3 + 1;
                System.out.println(n + " * " + 3 + " + " + " = " + save);
            }
            n = save;
            cont++;
        }
        System.out.println("\nForam necessárisos " + cont + " passos para chegar no número 1.");
        sc.close();
    }
}
