package exercicios;

import java.util.Scanner;

public class pareimpar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int qtdN=0;
        int numero;
        int count = 0;
        int pares=0;
        int impares=0;
        int div;
        System.out.println("Digite quantos números vão ser Comparados: ");
        qtdN=scan.nextInt();
        do{
            System.out.println("Digite um número: ");
            numero= scan.nextInt();
            div=numero%2;
            count=count+1;
            if(div<=0) {
                pares++;
            }
            else{
                impares++;
            }
        }while(numero<=qtdN);
        System.out.println("Pares: "+pares+" Impar: "+impares);
    }
}
