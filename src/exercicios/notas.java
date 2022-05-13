package exercicios;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); /*scanner é para ler algo*/
        int nota;

        System.out.println("Digite uma nota entre zero a 10: ");

        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {

            System.out.println("Nota inválida! Digite outro valor.");

            System.out.println("Digite uma nota entre zero a 10: ");
            nota = scan.nextInt();
        }
    }
}
