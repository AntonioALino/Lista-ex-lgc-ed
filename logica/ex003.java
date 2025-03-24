package logica;

import java.util.Scanner;

public class ex003 {
    public static void Main(String[] args){
        Scanner scanner =  new Scanner (System.in);
        System.out.println("Digite uma palavra para descobrir se é um palíndromo: ");
        String str = scanner.nextLine();
        isPalindrome(str);
        System.out.println(isPalindrome(str));
        scanner.close();
    }

    public static String isPalindrome(String str) {
        int f = 0;
        int l = str.length() - 1;

        while (f < l) {
            if (str.charAt(f) != str.charAt(l)) {
                return "Não é um palíndromo"; 
            } else {
                f++;
                l--;
            }
        }
        return "É um palíndromo";
    }
}
