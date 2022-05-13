package exercicios;

import java.util.Scanner;

public class tabuadalaçofor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        int result;
        System.out.println("Digite o número que você deseja exibir a tabuada: ");
        num=scan.nextInt();
        for(var i=0;i<=10;i++){
            result=num*i;
            System.out.println(num+" x "+i+" = "+result);

        }
    }
}
