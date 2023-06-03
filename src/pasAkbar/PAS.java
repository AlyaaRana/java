package pasAkbar;

import java.util.ArrayList;
import java.util.Scanner;

public class PAS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Username, Password;
        int pilihan = 0;
        System.out.println("Masukkan Username & Password");
        System.out.print("Masukkan Username: ");
        Username = input.nextLine();
        System.out.print("Masukkan Password: ");
        Password = input.nextLine();
        if (Username.equals("Toko") && Password.equals("PPLG")) {
            System.out.println("Login Berhasil");
            ArrayList<DataBarang> tokoKelontong = new ArrayList<>();
            DataBarang beras = new DataBarang();
            beras.setNama("beras Raja Hiu");
            beras.setJenisbarang("Makanan Pokok");
            beras.setHargabarang(50000);
            beras.setJumlahbarang(5);
            beras.setKodebarang(123);

            DataBarang mieGoreng = new DataBarang();
            mieGoreng.setNama("Mie Goreng Indomie");
            mieGoreng.setJenisbarang("Makanan Pokok");
            mieGoreng.setHargabarang(3500);
            mieGoreng.setJumlahbarang(10);
            mieGoreng.setKodebarang(1234);

            DataBarang minyakGoreng = new DataBarang();
            minyakGoreng.setNama("COCO");
            minyakGoreng.setJenisbarang("");
            minyakGoreng.setHargabarang(3500);
            minyakGoreng.setJumlahbarang(10);
            minyakGoreng.setKodebarang(2345);

            DataBarang kopi = new DataBarang();
            kopi.setNama("COCO");
            kopi.setJenisbarang("");
            kopi.setHargabarang(3500);
            kopi.setJumlahbarang(10);
            kopi.setKodebarang(1234568);

            DataBarang Gas = new DataBarang();
            Gas.setNama("COCO");
            Gas.setJenisbarang("");
            Gas.setHargabarang(3500);
            Gas.setJumlahbarang(10);
            Gas.setKodebarang(000);

            DataBarang iceCream = new DataBarang();
            iceCream.setNama("COCO");
            iceCream.setJenisbarang("");
            iceCream.setHargabarang(3500);
            iceCream.setJumlahbarang(10);
            iceCream.setKodebarang(12344);

             tokoKelontong.add(kopi);
            System.out.println("==============");
            System.out.println("Selamat Datang di Toko Kelontong 10 PPLG 2 ");
            System.out.println("Daftar Barang & Harga Toko Kelontong");
            System.out.println("1. beras"+beras);
            System.out.println("2. Mie Goreng"+mieGoreng);
            System.out.println("3. Minyak Goreng"+minyakGoreng);
            System.out.println("4. Kopi"+kopi);
            System.out.println("5. Gas");
            System.out.println("6. Ice Cream");
            System.out.println("7. Kebab");
            System.out.println("Silahkan pilih barang yang ingin dibeli: ");
            pilihan = input.nextInt();


            switch (pilihan) {
                case 1:
                    System.out.println("Anda telah memilih beras");
                    break;
                case 2:
                    System.out.println("Anda telah memilh Mie Goreng"+kopi);
                    break;
                case 3:
                    System.out.println("Anda telah memilih Minyak Goreng");
                    break;
                case 4:
                    System.out.println("Anda telah memilih Kopi");
                    break;
                case 5:
                    System.out.println("Anda telah memilih Gas");
                    break;
                case 6:
                    System.out.println("Anda telah memilih Snack");
                    break;
            }


        }else {
            System.out.println("Username & password yang anda masukkan salah");
        }
}}
