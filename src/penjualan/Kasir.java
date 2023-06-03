package penjualan;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        String barang[] = new String[3];
        Integer harga[] = new Integer[3];
        Scanner input = new Scanner(System.in);
        Scanner masuk = new Scanner(System.in);

        System.out.println("Welcome!!");

        System.out.println("Masukkan nama barang");
        barang [0]=input.nextLine();
        System.out.println("Masukkan harga barang");
        harga [0]=masuk.nextInt();

        System.out.println("Masukkan nama barang");
        barang [1]=input.nextLine();
        System.out.println("Masukkan harga barang");
        harga [1]=masuk.nextInt();

        System.out.println("Masukkan nama barang");
        barang [2]=input.nextLine();
        System.out.println("Masukkan harga barang");
        harga [2]=masuk.nextInt();

        int total;
        total = harga[0]+harga[1]+harga[2];

        System.out.println("List Barang    Harga   ");
        System.out.println(""+barang[0]+"   "+harga[0]);
        System.out.println(""+barang[1]+"   "+harga[1]);
        System.out.println(""+barang[2]+"   "+harga[2]);
        System.out.println("total  "+total);

        System.out.println("Masukkan input uang anda");
        int bayar;
        bayar = masuk.nextInt();

        System.out.println("Kembalian anda : "+(bayar - total));
    }
}
