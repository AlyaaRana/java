package array;

public class ArrayOne {
    //hobi string
    // cara1
    public static void main(String[] args) {
        String[] myHobi = {"Renang" , "Bersepeda" , "Belajar" , "Bermain"};

        //cara2
        //makanan favorit
        String[] myFavFood = new String[4];
        myFavFood[0] = "Nasi Padang";
        myFavFood[1] = "Mie Godok";
        myFavFood[2] = "Nasi Rames";
        myFavFood[3] = "Kepiting asam manis";

        System.out.println("hobi saya adalah: "+ myHobi[1]);
        System.out.println("hobi saya adalah : "+ myHobi[2]);
        System.out.println("hobi saya adalah : "+ myHobi[3]);

        //do while
        int k = 0;
        do {
            System.out.println("hobi saya :" + myHobi[k]);
            k++;
        } while (k < myHobi.length);

        //while
        int j = 0;
        while (j < myHobi.length){
            System.out.println("hobi saya :" + myHobi[j]);
            j++;
        }

        //modifikasi data array
        myHobi[1]="menyanyi";
        for (int i = 0; i < myHobi.length; i++) {
            System.out.println("My hobi saya "+myHobi[i]);
        }
    }
}
