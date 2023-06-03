package Abstract;

import sun.security.krb5.internal.tools.Klist;

import java.util.Scanner;

public class KalkulatorKu {
    public static void main(String[] args) {
        int angka1, angka2;
        Scanner kalkulator = new Scanner(System.in);
        System.out.println("Masukkan angka pertama");
        angka1 = kalkulator.nextInt();
        System.out.println("Masukkan angka kedua");
        angka2 = kalkulator.nextInt();

        MyKasio hitung = new MyKasio() {
            @Override
            public void tambah() {

            }
            @Override
            public void kurang() {

            }
            @Override
            public void bagi() {

            }
            @Override
            public void kali() {

            }
        };
        hitung.tambah(angka1,angka2);
        hitung.kurang(angka1,angka2);
        hitung.bagi(angka1,angka2);
        hitung.kali(angka1,angka2);
    }
}
