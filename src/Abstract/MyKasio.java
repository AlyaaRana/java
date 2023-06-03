package Abstract;

public abstract class MyKasio extends Kalkulator{

    @Override
    public void tambah(int angka1, int angka2) {
        System.out.println("Hasil penjumlahan dari kedua bilangan adalah: " +(angka1 + angka2));
    }

    @Override
    public void kurang(int angka1, int angka2) {
        System.out.println("Hasil Pengurangan dari kedua bilangan adalah: "+(angka1 - angka2));
    }

    @Override
    public void bagi(int angka1, int angka2) {
        System.out.println("Hasil Pembagian dari kedua bilangan adalah: "+(angka1 / angka2));
    }

    @Override
    public void kali(int angka1, int angka2) {
        System.out.println("Hasil perkalian dari kedua bilangan adalah: "+(angka1 * angka2));
    }

}
