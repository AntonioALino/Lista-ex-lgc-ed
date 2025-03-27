package logica;

public class ex007 {
    
    public static void Main(String[] args){

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int media : array){
            sum += media;
        }

        int average = sum / array.length;
        System.out.println("A média dos valores é: " + average);


    }

}
