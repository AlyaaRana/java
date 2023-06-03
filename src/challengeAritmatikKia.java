import java.util.Scanner;

public class challengeAritmatikKia {
    public static void main(String[] args) {
        penjumlahan(new Scanner(System.in));
    }
    public static void penjumlahan(Scanner in){
        System.out.println("Operasi aritmatika pertambahan");
        System.out.println("Masukkan angka pertama");
        int nilai1 = in.nextInt();
        System.out.println("Masukkan angka kedua");
        int nilai2 = in.nextInt();
        int hasil = nilai1 + nilai2;
        System.out.println("Hasilnya adalah : " +hasil);
    }
}
