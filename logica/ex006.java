package logica;

import java.util.Random;
import java.util.Scanner;

public class ex006 {

    public static void Main(String[] args){

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int randNum = rand.nextInt(100);

        System.out.println("Adivinhe o número entre 0 e 100: ");
        int num = sc.nextInt();

        while(num != randNum){
            if(num < randNum){
                System.out.println("O número é maior!");
            }else{
                System.out.println("O número é menor!");
            }
            System.out.println("Tente novamente: ");
            num = sc.nextInt();
        }
        System.out.println("Parabéns! Você acertou!");

        sc.close();
    }

}