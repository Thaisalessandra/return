package exercicios;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        int result=0;
        System.out.println("Digite o numero a ser fatorado: ");
        num=scan.nextInt();
        result=(num*(num-1));
        System.out.print(num+"! = "+num);
        for(int i=num-2;i>=1;i--){
            System.out.print(" x "+i+" = ");
            result=result*i;
        }
        System.out.print(result);
    }
}
