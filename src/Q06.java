import java.util.Scanner;

public class Q06 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite a palavra que deseja inverter");
        String word = read.next();

        char vetor[] = word.toCharArray();
        String reversed = "";



        for (int i = vetor.length-1; i >= 0; i--) {
          reversed += vetor[i];
        }
        System.out.println(reversed);
    }

}
