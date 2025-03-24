package logica;

import java.util.Scanner;

public class ex002 {
    
    public static void Main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número: ");
        long num = scanner.nextLong();
        int i = 1;
        
        if (num >= 0) {
            while (i <= num) {
                num = num * i;
                i++;
            }
            System.out.println("O fatorial de " + num + " é " + i);
        }
        scanner.close();
    }

}
