package array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LatihanArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String[] myFavFood = new String[4];
        //looping
        int i = 0;
        while (i <myFavFood.length){
            System.out.println("Masukkan makanan favorit kmu : ");
            myFavFood[i] = scan.nextLine();
            i++;
        }
        for (String myFood: myFavFood) {
            System.out.println("Makanan favorit saya adalah : "+ myFood);
        }
    }
}
