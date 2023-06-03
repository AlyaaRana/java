package array;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();
        food.add("Nasi padang");
        food.add("Mie goreng");
        food.add("Mie godok");
        food.add("Martabak");
        food.add("Mie ayam");

        System.out.println("Makananku index 0 sebelum update "+food.get(0));
        // bikin looping value dari arraylist

        food.set(0 , "Nasi bakar");
        System.out.println("Makananku index 0 setelah update "+food.get(0));

        food.remove(4);

        System.out.println("data index ke 4 dihapus");
        System.out.println(food);

        System.out.println("Jumlah data arraylist food adalah : "+food.size());

        System.out.println("Looping value arraylist : ");
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
