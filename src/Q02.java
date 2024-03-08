import java.util.ArrayList;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("digite o numero que deseja testar");
       ArrayList<Integer> container = new ArrayList<Integer>();
        int num1 = 1, num2 = 0, value = read.nextInt();

        System.out.println(num2);
        System.out.println(num1);

        while(num1 < value){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
            container.add(num1);
        }

        if (container.contains(value)){
            System.out.println("O numero faz parte da sequencia");
        }else{
            System.out.println("O numero não faz parte da sequencia");
        }

    }
}