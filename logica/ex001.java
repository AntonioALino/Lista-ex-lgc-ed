package logica;

import java.util.Scanner;

public class ex001 {
    public static void main (String[] args) {
        
        int a;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite um número: ");

        a = sc.nextInt();    
        
        System.out.println((a % 2 == 0) ? "Par" : "Impar");

        sc.close();

    }      
}