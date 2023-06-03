package inheritance;

import inheritance.mobil;

public class mobilku {
    public static void main(String[] args) {
        //ni membuat object dari class mobil
        mobil mobilSekolah= new mobil();

        //ni mengisi value
        mobilSekolah.merk = "Daihatsu";
        mobilSekolah.tipe = "Luxio";
        mobilSekolah.harga = 100000000;
        mobilSekolah.warna = "Putih";
        mobilSekolah.platNomer = "K 1234 LB";

        //ni mengakses object
        System.out.println("merk mobil saya "+mobilSekolah.merk);
        System.out.println("tipe mobil saya "+mobilSekolah.tipe);
        System.out.println("harga mobil saya "+mobilSekolah.harga);
        System.out.println("warna mobil saya "+mobilSekolah.warna);
        System.out.println("Plat nomer mobil saya "+mobilSekolah.platNomer);

        mobilSekolah.mundur();

        System.out.println("-----Object kedua-----");

        //object2
        mobil mobilPapa = new mobil();

        mobilPapa.merk = "Toyota";
        mobilPapa.tipe = "Sienta";
        mobilPapa.harga = 200000000;
        mobilPapa.warna = "hitam";
        mobilPapa.platNomer = "E 1245 KK";

        System.out.println("merk mobil papa saya "+mobilPapa.merk);
        System.out.println("tipe mobil papa saya "+mobilPapa.tipe);
        System.out.println("harga mobil papa saya "+mobilPapa.harga);
        System.out.println("warna mobil papa saya "+mobilPapa.warna);
        System.out.println("platnomer mobil papa saya "+mobilPapa.platNomer);

        mobilPapa.maju();

        System.out.println("-----Object ketiga-----");

        //object3
        mobil mobilOrang = new mobil();

        mobilOrang.merk = "Honda";
        mobilOrang.tipe = "City";
        mobilOrang.harga = 90000000;
        mobilOrang.warna = "Abu";
        mobilOrang.platNomer = "K 1499 DB";

        System.out.println("merk mobil orang "+mobilOrang.merk);
        System.out.println("tipe mobil orang "+mobilOrang.tipe);
        System.out.println("harga mobil orang "+mobilOrang.harga);
        System.out.println("warna mobil orang "+mobilOrang.warna);
        System.out.println("platnomer mobil orang "+mobilOrang.platNomer);



    }
}
