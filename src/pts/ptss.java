package pts;

import java.util.Scanner;

public class ptss {
    public static void main(String[] args) {
        String pass = "Admin";
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan username & password");
        System.out.print("Masukkan username : ");
        String name = input.nextLine();
        System.out.print("Masukkan password : ");
        String password = input.nextLine();

        //system operasi
        if (password.equals(pass) && name.equals(pass)) {
            int a;
            Scanner operasi= new Scanner(System.in);
            System.out.println("Login berhasil");
            System.out.println("Menu matematika");
            System.out.println("1.Luas bangun datar");
            System.out.println("2.Kalkulator Aritmatika");
            System.out.println("3.Deret angka genap & ganjil");
            int nomor = input.nextInt();
            if (nomor ==1){
                //Luas dan keliling
                Scanner bangun = new Scanner(System.in);
                System.out.println("1.Persegi");
                System.out.println("2.Persegi panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Layang - layang");
                System.out.println("Masukkan bangun datar");
                int InputBangun = bangun.nextInt();

                //persegi
                if(InputBangun == 1){
                    Scanner Persegi = new Scanner(System.in);
                    System.out.println("1.Luas");
                    System.out.println("2.Keliling");
                    System.out.println("Pilih 1 jika ingin menghitung luas, dan pilih 2 jika ingin menghitung keliling");
                    int InputPersegi = Persegi.nextInt();
                    // luas persegi
                    if (InputPersegi == 1){
                        int Luas;
                        System.out.println("Sisi : ");
                        int Sisi = Persegi.nextInt();
                        Luas = Sisi * Sisi;
                        System.out.println("Luasnya adalah : ");
                    }
                }

            }
        }
    }}



