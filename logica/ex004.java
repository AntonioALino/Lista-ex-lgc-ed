package logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex004 {
    public static void Main (String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++){
            System.out.println("Digite um número: ");
            numbers.add(sc.nextInt());
        }

        int biggest = Collections.max(numbers);

        System.out.println("O maior número é: " + biggest);

        sc.close();
        
    }
}
