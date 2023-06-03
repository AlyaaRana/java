package PAS_Ver2;

import PAS.Barang;

import java.util.ArrayList;
import java.util.Scanner;

public class Penjualan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan username & password");
        System.out.println("Masukkan username :");
        String username = input.nextLine();
        System.out.println("Masukkan password :");
        String password = input.nextLine();

        if (username.equals("Admin") && password.equals("Admin")) {
            System.out.println("Login berhasil");
        System.out.println("Masukkan nama kasir : ");
        String namaKasir;
        int jumlahbeli;
        namaKasir = input.nextLine();

        dataBarang[] dataBrg = new dataBarang[0];
            ArrayList<dataBarang> myToko = new ArrayList<>();
            dataBarang beras = new dataBarang();
            beras.setNamaBarang("beras Raja Hiu");
            beras.setJenisbarang("Makanan Pokok");
            beras.setHargaBarang(50000);
            beras.setJumlahBarang(5);
            beras.setKodeBarang(001);

            dataBarang mie = new dataBarang();
            mie.setNamaBarang("Mie Nesiamie");
            mie.setJenisbarang("Makanan Sekunder");
            mie.setHargaBarang(3500);
            mie.setJumlahBarang(10);
            mie.setKodeBarang(002);

            dataBarang minyakGoreng = new dataBarang();
            minyakGoreng.setNamaBarang("COCO");
            minyakGoreng.setJenisbarang("");
            minyakGoreng.setHargaBarang(3500);
            minyakGoreng.setJumlahBarang(10);
            minyakGoreng.setKodeBarang(003);

            dataBarang gas = new dataBarang();
            gas.setNamaBarang("Pintra");
            gas.setJenisbarang("Kebutuhan Pokok");
            gas.setHargaBarang(3500);
            gas.setJumlahBarang(10);
            gas.setKodeBarang(004);

            dataBarang iceCream = new dataBarang();
            iceCream.setNamaBarang("Saturn");
            iceCream.setJenisbarang("Snack");
            iceCream.setHargaBarang(3500);
            iceCream.setJumlahBarang(10);
            iceCream.setKodeBarang(005);

            dataBarang buku = new dataBarang();
            buku.setNamaBarang("Buku");
            buku.setHargaBarang(4000);
            buku.setJumlahBarang(20);
            buku.setJenisbarang("Alat Tulis");
            buku.setKodeBarang(006);

            dataBarang jajan = new dataBarang();
            jajan.setNamaBarang("Taro");
            jajan.setHargaBarang(3500);
            jajan.setJumlahBarang(10);
            jajan.setJenisbarang("makanan ringan");
            jajan.setKodeBarang(007);

            myToko.add(beras);
            myToko.add(mie);
            myToko.add(minyakGoreng);
            myToko.add(gas);
            myToko.add(iceCream);
            myToko.add(buku);
            myToko.add(jajan);

            float jumlahBayar = 0 ;
        int pilihan, jumlahBarang;
           do {
            System.out.println("Silahkan pilih menu transaksi : ");
            System.out.println("1. Lihat list barang");
            System.out.println("2. Input data barang");
            System.out.println("3. Pembayaran");
            System.out.println("4. Keluar Program");
            pilihan = input.nextInt();
            System.out.println("````````````````````````````");
            switch (pilihan) {

                case 1 :
                    for (int i = 0; i < myToko.size(); i++) {
                        dataBarang dtbrg = myToko.get(i);
                        System.out.println("Jenis barang : " + dtbrg.getJenisbarang());
                        System.out.println("Kode barang : " + dtbrg.getKodeBarang());
                        System.out.println("Nama barang : " + dtbrg.getNamaBarang());
                        System.out.println("Harga : " + dtbrg.getHargaBarang());
                        System.out.println("Jumlah stok yang tersedia : " + dtbrg.getJumlahBarang() + "barang");
                        System.out.println("----------------------------------------------");
                    }
                    break;
                case 2:
                    System.out.println("Masukkan jumlah barang : ");
                    jumlahBarang = input.nextInt();
                    dataBrg = new dataBarang[jumlahBarang];
                    for (int i = 0; i < dataBrg.length; i++) {
                        dataBrg[i] = new dataBarang();
                        System.out.println("Barang ke : " + (i + 1));
                        System.out.println("Masukkan kode barang : " + (i + 1));
                        dataBrg[i].setKodeBarang(input.nextInt());
                        System.out.println("Masukkan nama barang : " + (i + 1));
                        dataBrg[i].setNamaBarang(input.next());
                        System.out.println("Masukkan harga barang : " + (i + 1));
                        dataBrg[i].setHargaBarang(input.nextFloat());
                        System.out.println("Masukkan jumlah beli barang : " + (i + 1));
                        dataBrg[i].setJumlahBeli(input.nextInt());
                        int yangMauDibeli= input.nextInt();
                        if(yangMauDibeli >dataBrg.length){
                            System.out.println("Data kosong");
                        }
                        System.out.println("||||||||||||||||||||||||");
                    }
                    break;
                case 3:
                    System.out.println("DATA PENJUALAN BARANG");
                    System.out.println("Toko kelomtong PPLG 2");
                    System.out.println("Nama Kasir : " + namaKasir);
                    System.out.println("==========================================================================================");
                    System.out.println("No. \tKode Barang \tNama Barang \tHarga Barang \tJumlah Beli \tBayar");
                    System.out.println("==========================================================================================");
                    for (int i = 0; i < dataBrg.length; i++) {
                        System.out.println((i + 1) + "\t" + "\t" + "\t" + dataBrg[i].getKodeBarang() +
                                "\t" + "\t" + "\t" + "\t" + "\t" +dataBrg[i].getNamaBarang() + "\t" + "\t" + "\t"
                                + dataBrg[i].getHargaBarang() + "\t" + "\t" + "\t" +dataBrg[i].getJumlahBeli()
                                + "\t" + "\t" + "\t" + dataBrg[i].getBayarbayar());
                        jumlahBayar = (float) (jumlahBayar + dataBrg[i].getBayarbayar());
                    }
                    System.out.println("==========================================================================================");
                    System.out.println("Jumlah Bayar \t \t \t \t \t \t \t \t: Rp." + jumlahBayar);
                    System.out.println("Masukkan jumlah uang yag anda miliki : Rp.");
                    int inputUang = input.nextInt();

                    if(inputUang >= jumlahBayar){
                        System.out.print("Kembalian anda adalah : Rp." + (inputUang - jumlahBayar)) ;
                    } else if (inputUang <= jumlahBayar) {
                        System.out.println("Uang anda kurang awikwok");
                    } else {
                        System.out.println("Selamat, uang anda cukup");
                    }
                    break;
            }
        }while (pilihan != 4) ;
            System.out.println("===Terimakasih telah berkunjung ke toko kami===");
            System.out.println("==Tetaplah bersyukur==");
            System.out.println("==Jangan mengeluh==");
            System.out.println("Have a good day and keep smile bray!!");

        }else{
            System.out.println("Username atau password salah, silahkan cek kembali");
        };
    }
}
//float hargaDiskon, diskon;
//if (jumlahBayar < 150000){
//                            diskon = 0;
//                        }else {
//                            diskon = jumlahBayar * 0.05;
//                        }
//                        hargaDiskon = jumlahBayar - diskon;