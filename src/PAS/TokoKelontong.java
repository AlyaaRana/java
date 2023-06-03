package PAS;

import java.util.ArrayList;
import java.util.Scanner;

public class TokoKelontong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan username & password");
        System.out.println("Masukkan username");
        String username = input.nextLine();
        System.out.println("Masukkan password");
        String password = input.nextLine();

        if (username.equals("Admin") && password.equals("Admin")) {
            System.out.println("Login berhasil");

            Barang barangKu = new Barang();
            ArrayList<Barang> tokoKelontong = new ArrayList<>();
            Barang mie = new Barang();
            mie.setKodeBarang(001);
            mie.setNamaBarang("Nesiamie");
            mie.setHargaBarang(3000);
            mie.setJumlahBarang(30);
            mie.setJenisBarang("Makanan Sekunder");

            Barang gas = new Barang();
            gas.setKodeBarang(002);
            gas.setNamaBarang("Yellowgas");
            gas.setHargaBarang(34500);
            gas.setJumlahBarang(15);
            mie.setJenisBarang("Kebutuhan pokok");

            Barang eskrim = new Barang();
            eskrim.setKodeBarang(003);
            eskrim.setNamaBarang("clico");
            eskrim.setHargaBarang(12000);
            eskrim.setJumlahBarang(60);
            eskrim.setJenisBarang("makanan ringan");

            Barang beras = new Barang();
            beras.setKodeBarang(004);
            beras.setNamaBarang("Raja Singa");
            beras.setHargaBarang(25000);
            beras.setJumlahBarang(60);
            beras.setJenisBarang("Kebutuhan pokok");

            Barang minyakGoreng = new Barang();
            beras.setKodeBarang(005);
            beras.setNamaBarang("Bimoli");
            beras.setHargaBarang(45000);
            beras.setJumlahBarang(30);
            beras.setJenisBarang("Kebutuhan pokok");

            Barang buku = new Barang();
            buku.setKodeBarang(006);
            buku.setNamaBarang("Buku");
            buku.setHargaBarang(4000);
            buku.setJumlahBarang(20);
            buku.setJenisBarang("Alat Tulis");

            Barang jajan = new Barang();
            jajan.setKodeBarang(007);
            jajan.setNamaBarang("Taro");
            jajan.setHargaBarang(3500);
            jajan.setJumlahBarang(10);
            jajan.setJenisBarang("makanan ringan");

            barangKu.getNamaBarang();

            System.out.println("========================================\n" +
                    "==WELCOME TO TOKO KELONTONG 10 PPLG 2==\n" +
                    "========================================");
            System.out.println("Daftar barang & harga toko ini");
            System.out.println("001 Mie = " + mie.getHargaBarang());
            System.out.println("002 Gas = " +gas.getHargaBarang());
            System.out.println("003 Es Cream = " + eskrim.getHargaBarang());
            System.out.println("004 Beras = " + beras.getHargaBarang());
            System.out.println("005 Minyak Goreng = " + minyakGoreng.getHargaBarang());
            System.out.println("006 Buku = " + buku.getHargaBarang());
            System.out.println("007 Jajan = " + jajan.getHargaBarang());

            System.out.println("Masukkan kode barang, untuk melanjutkan transaksi");
            Integer pilihan = input.nextInt();
            if(pilihan == 001 || pilihan == 002 || pilihan == 003  || pilihan== 004
            || pilihan == 005|| pilihan == 006|| pilihan == 007)
            {
                System.out.println("Anda akan melakukan transaksi");
                System.out.println("Masukkan jumlah barang yang diinginkan");
                int jumlahBeli = input.nextInt();

                int JumlahBarang = (jumlahBeli);
                System.out.println("Jadi jumlah beli adalah = " + JumlahBarang);

                int HargaBarang = (barangKu.getHargaBarang() + JumlahBarang);
                int JumlahHarga = (HargaBarang * JumlahBarang);

                System.out.println("Masukkan jumlah uang yag anda miliki");
                int JumlahBayar = input.nextInt();

                if (JumlahBayar >= JumlahHarga) {
                    System.out.println("Kembalian anda adalah : " + (JumlahBayar - JumlahHarga));
                } else {
                    System.out.println("Uang anda kurang awikwok");
                }
            }else{
                System.out.println("Data yang anda masukkan kosong");
            };

            System.out.println("Terimakasih telah berkunjung ke toko kami!!! ");
        }else{
            System.out.println("Username atau password salah, silahkan cek kembali");
        };
    }
}
