package exercicios;

public class ARRAYS {
    public static void main(String[] args) {
        int[] vet={3, 5, 6, 8,412};
        int count=0;
        System.out.print("Vetor: ");
        while(count < (vet.length)){
            System.out.print(vet[count]+" ");
            count++;

        }
        System.out.println(" ");
        System.out.print("Vetor na ordem decrescente: ");
        for (int i=(vet.length-1);i>=0;i--){
            System.out.print(vet[i]+" ");

        }
    }
}
