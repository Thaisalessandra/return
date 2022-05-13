package exercicios;

import java.util.Scanner;

public class maioremedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int count=0;
        int soma=0;
        int maior=0;
        double media=0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            count=count+1;
            soma=soma+numero;
            if(numero>maior){
                maior=numero;

            }
            media=soma/count;
        }
        while (count < 5);

        System.out.println("Maior: "+maior+"Média:"+media);
    }
}