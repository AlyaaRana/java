package classObject;

public class objectSiswa {
    public static void main(String[] args) {
        //object class mobil
        siswa kia= new siswa();

        kia.nama = "Rizkia Khosy Amalia Wicaksono";
        kia.umur = 15;
        kia.makananFavorit = "Baso, ayam (apa aja yg penting enak dan pedas), mie instan, nasgor, rendang,soto,junkfood";
        kia.TTl = "26 nov 2006";
        kia.asal = "Jakarta";

        System.out.println("Nama panjang kia adaalah "+kia.nama);
        System.out.println("umur kia "+kia.umur);
        System.out.println("Makanan favorit kia adalah "+kia.makananFavorit);
        System.out.println("Asal kia dari "+kia.asal);
        System.out.println("Kia lahir pada "+kia.TTl);

        kia.tidur();

        //object 2
        System.out.println("-----Punya shinta-----");

        siswa shinta =new siswa();

        shinta.nama = "Ratih Shinta Puspitsari";
        shinta.umur = 15;
        shinta.makananFavorit = "soto";
        shinta.TTl = "6 Januari 2007";
        shinta.asal = "Jepara";
        shinta.hobi = "turu";

        System.out.println("Nama panjang shinta adaalah "+shinta.nama);
        System.out.println("umur shinta "+shinta.umur);
        System.out.println("Makanan favorit shinta adalah "+shinta.makananFavorit);
        System.out.println("Asal shinta dari "+shinta.asal);
        System.out.println("shinta lahir pada "+shinta.TTl);

        shinta.makan();

        //object 3
        System.out.println("-----Punya ijall-----");

        siswa ijal =new siswa();

        ijal.nama = "M.Faizal Izzudin";
        ijal.umur = 15;
        ijal.makananFavorit = "sapi";
        ijal.TTl = "22 februari 2007";
        ijal.asal = "Jepara";
        ijal.hobi = "main game";

        System.out.println("Nama panjang ijal adaalah "+ijal.nama);
        System.out.println("umur ijal "+ijal.umur);
        System.out.println("Makanan favorit ijal adalah "+ijal.makananFavorit);
        System.out.println("Asal kia dari "+ijal.asal);
        System.out.println("Kia lahir pada "+ijal.TTl);
        System.out.println("hobi ijal adalah "+ijal.hobi);

        ijal.tidur();


        //object 4
        System.out.println("-----Punya akbar-----");

        siswa akbar =new siswa();

        akbar.nama = "M.Akbar Felda";
        akbar.umur = 15;
        akbar.makananFavorit = "tidak tau";
        akbar.TTl = "25 November 2006";
        akbar.asal = "Kudus";
        akbar.hobi = "suka baca wp";

        System.out.println("Nama panjang akbar adaalah "+akbar.nama);
        System.out.println("umur akbar "+akbar.umur);
        System.out.println("Makanan favorit akbar adalah "+akbar.makananFavorit);
        System.out.println("Asal akbar dari "+akbar.asal);
        System.out.println("akbar lahir pada "+akbar.TTl);
        System.out.println("hobi akbar adalah "+akbar.hobi);

        akbar.belajar();
    }
}
