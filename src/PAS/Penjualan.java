package PAS;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Scanner;

public class Penjualan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Inisialisasi objek untuk kelas masing2
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        System.out.println("Masukkan username & password");
        System.out.println("Masukkan username");
        String username = input.nextLine();
        System.out.println("Masukkan password");
        String password = input.nextLine();

        if (username.equals("Admin") && password.equals("Admin")) {
            System.out.println("Login berhasil");

            //Deklarasi variabel
            int jum=0, i=0;
            double total_bayar=0;
            //Deklarasi array
            int [] kode = new int[7];
            int [] qty = new int[7];
            int [] harga = new int[7];
            double [] sub_total = new double[7];
            double [] diskon= new double [7];
            String [] barang = new String[7];
            String [] jenis = new String[7];

            System.out.println("PROGRAM JAVA TENTANG PENJUALAN BARANG");
            System.out.print("Masukan Jumlah Beli : ");
            jum=input.nextInt();
            System.out.println(" ");
            //Memasukan elemen didalam array
            for (i=0; i<jum;i++){
                Barang barangKu = new Barang();
                ArrayList<Barang> penjualan = new ArrayList<>();
                System.out.println("Anda akan melakukan transaksi");
                System.out.print("Masukan Kode Barang Ke-"+(i+1)+" : ");
                kode[i]=input.nextInt();
                System.out.print("Masukan qty Ke-"+(i+1)+" : ");
                qty[i]=input.nextInt();
                System.out.println("Masukkan jenis barang : " + (i+1)+" : ");
                jenis[i] = input.nextLine();

                //Menentukan barang berdasarkan kode yang dimmasukan
                switch (kode[i]){
                    case 1 :
                        barang[i]="Beras  ";
                        harga[i]=25000;
                        diskon[i]=0.1;
                        jenis[i]="kebutuhan pokok";
                        break;
                    case 2 :
                        barang[i]="Headphone Eksternal  ";
                        harga[i]=246000;
                        diskon[i]=0.05;
                        jenis[i]="Snack";
                        break;
                    case 3 :
                        barang[i]="Power Bank 10.000 mAh";
                        harga[i]=136000;
                        diskon[i]=0;
                        jenis[i]="Minuman";
                        break;
                    case 4 :
                        barang[i]="Tripod Kamera        ";
                        harga[i]=267999;
                        diskon[i]=0.2;
                        jenis[i]="ATK";
                        break;
                    case 5 :
                        barang[i]="Smart Watch Xiomi    ";
                        harga[i]=899000;
                        diskon[i]=0.1;
                        break;
                    default :
                        System.out.println("Kode Barang Tidak Tersedia");
                }
            }
            //Pengaturan format number
            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            kursIndonesia.setDecimalFormatSymbols(formatRp);

            System.out.println(" ");
            System.out.println("No   Nama Barang             Harga            QTY  Diskon   Sub Total");
            //Menampilkan seluruh elemen di dalam array
            for (i=0; i<jum;i++){
                sub_total[i]=((qty[i]*harga[i])-(qty[i]*harga[i]*diskon[i]));
                total_bayar+=sub_total[i];
                System.out.println(i+1+"    "+barang[i]+"   "+kursIndonesia.format(harga[i])+"    "+qty[i]+"     "+(int)(diskon[i]*100)+"%"+"     "+kursIndonesia.format(sub_total[i]));
            }
            
            System.out.println(" ");
            //Menampilkan total bayar
            System.out.println("Total Bayar : "+kursIndonesia.format(total_bayar));

        }else{
            System.out.println("Username atau password salah, silahkan cek kembali");
        };


        }

}

