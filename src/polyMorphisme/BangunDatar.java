package polyMorphisme;

public class BangunDatar {
    public static void hitungLuas(int sisi) {
        int luas = sisi * sisi;
        System.out.println("Jadi luas persegi adalah " + luas);
    }

    public static void hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        System.out.println("Jadi luas persegi panjang adalah " + luas);
    }

    public static void hitungLuas(double diagonal1 , double diagonal2){
        double luas = 0.5 * diagonal1 * diagonal2;
        System.out.println("Jadi luas layangan adalah" + luas);
    }

    public static void hitungLuas(double jariJari){
        double luas = 3.14 * jariJari * jariJari;
        System.out.println("Jadi luas lingkaran "+luas);
    }
}