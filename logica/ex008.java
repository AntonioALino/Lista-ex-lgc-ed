package logica;

import java.util.Scanner;

public class ex008 {
    public static void Main(String[] args){ 

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        int vogais = 0;
        int consoantes = 0;
    
        frase.toLowerCase();

        for(int i =0; i < frase.length(); i++){
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'){
                vogais++;
            } else {
                consoantes++;
            }
            System.out.println("A frase tem " + vogais + " vogais e " + consoantes + " consoantes.");
        }

        sc.close();

    }
}
