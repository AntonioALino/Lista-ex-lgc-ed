package logica;

import java.util.Arrays;
import java.util.Scanner;

public class ex005 {
    public static void Main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nomes[] = new String[5];

        for (int i = 0; i < nomes.length; i++){
            System.out.println("Digite o nome da pessoa " + (i + 1) + " : ");
            nomes[i] = scanner.nextLine();
        }

        Arrays.sort(nomes);

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        scanner.close();
    }
}
