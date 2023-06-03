package pts;

import java.util.Scanner;

public class pts2022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double phi = 3.14;
        int pilihan;
        double alas, tinggi, hasil2, angka4;
        System.out.println("Masukkan username & password");
        System.out.print("Masukkan username : ");
        String name = input.nextLine();
        System.out.print("Masukkan password : ");
        String password = input.nextLine();

        if (name.equals("Admin") && password.equals("Admin")) {
            System.out.println("Login Success");

            System.out.println("---------------");
            System.out.println("Kita akan mengerjakan keliling dan luas bangun datar");
            System.out.println("Nanti silahkan pilih salah satu pilihan menu dibawah ini");
            System.out.println("-----------------");
            System.out.println("Menu");
            System.out.println("1.Luas Persegi");
            System.out.println("2.Keliling Persegi");
            System.out.println("3.Luas Persegi Panjang");
            System.out.println("4.Keliling Persegi Panjang");
            System.out.println("5.Luas Segitiga");
            System.out.println("6.Keliling Segitiga");
            System.out.println("7.Luas Lingkaran ");
            System.out.println("8.Keliling Lingkaran");
            System.out.println("9.Ganjil genap");
            System.out.print("Silahkan Dipilih = ");
            pilihan = input.nextInt();

            int hasil;
            switch (pilihan) {
                case 1:
                    System.out.print("Silahkan Isi Angkanya ");
                    System.out.print("Panjang Sisi = ");
                    int nilai = input.nextInt();
                    hasil = nilai * nilai;
                    System.out.println("Luas Perseginya Adalah = " + hasil);
                    break;
                case 2:
                    System.out.print("Silahkan Isi Angkanya ");
                    System.out.print("Panjang Sisi = ");
                    nilai = input.nextInt();
                    hasil = nilai * 4;
                    System.out.println("Keliling Perseginya Adalah = " + hasil);
                    break;
                case 3:
                    int panjang, lebar;
                    System.out.print("Silahkan isi panjangnya = ");
                    panjang = input.nextInt();
                    System.out.print("Silahkan isi lebarnya = ");
                    lebar = input.nextInt();
                    hasil = lebar * panjang;
                    System.out.println("Luasnya Persegi Panjang adalah = " + hasil);
                    break;
                case 4:
                    System.out.print("Silahkan isi panjangnya = ");
                    panjang = input.nextInt();
                    System.out.print("Silahkan Isi Lebar = ");
                    lebar = input.nextInt();
                    hasil = 2 * (panjang + lebar);
                    System.out.println("Keliling Persegi Panjang adalah = " + hasil);
                    break;
                case 5:
                    System.out.print("Silahkan isi angka untuk alasnya = ");
                    alas = input.nextInt();
                    System.out.print("Silahkan isi angka untuk tinggi nya = ");
                    tinggi = input.nextInt();
                    hasil2 = 0.5 * alas * tinggi;
                    System.out.println("Luas segitiga adalah = " + hasil2);
                    break;
                case 6:
                    System.out.print("Silahkan isi angka untuk sisi pertamanya = ");
                    alas = input.nextInt();
                    System.out.print("Silahkan isi angka untuk sisi keduanya = ");
                    tinggi = input.nextInt();
                    System.out.print("Silahkan isi angka untuk sisi ketiganya = ");
                    angka4 = input.nextInt();
                    hasil2 = alas + tinggi + angka4;
                    System.out.println("Keliling segitiga adalah = " + hasil2);
                    break;
            }
            int jari;
            double hasil1;
            switch (pilihan) {
                case 7:
                    System.out.print("Silahkan isi jari jari nya = ");
                    jari = input.nextInt();
                    hasil1 = phi * jari * jari;
                    System.out.println("Luas Lingkarannya adalah = " + hasil1);
                    break;
                case 8:
                    System.out.print("Silahkan isi jari jari nya = ");
                    jari = input.nextInt();
                    hasil1 = 2 * phi * jari;
                    System.out.println("Keliling lingkaran adalah = " + hasil1);
                    break;
                case 9:
                    System.out.println("-----------------");
                    System.out.println("Kita masuk ke deretan bilangan ganjil dan genap");
                    System.out.println("1.Ganjil");
                    System.out.println("2.Genap");
                    System.out.print("Pilih salah satu, genap atau ganjil : ");


                    int opsiGanjilGenap;
                    opsiGanjilGenap = input.nextInt();
                    int huruf1, huruf2;
                    switch (opsiGanjilGenap) {
                        case 1:
                            System.out.print("Masukan angka awal = ");
                            huruf1 = input.nextInt();
                            System.out.print("Masukan angka akhir = ");
                            huruf2 = input.nextInt();
                            for (int i = huruf1; i <= huruf2; i++) {
                                if (i % 2 == 1)
                                    System.out.print(i + ",");
                            } break;
                        case 2:
                            System.out.print("Masukan angka awal  = ");
                            huruf1 = input.nextInt();
                            System.out.print("Masukan angka akhir = ");
                            huruf2 = input.nextInt();
                        {
                            for (int i = huruf1; i <= huruf2; i++) {
                                System.out.print(i + ",");
                            } break;

                        }
                    }
            }
        } else {
            System.out.println("Username atau password salah silahkan cek kembali");
        }
    }
}
