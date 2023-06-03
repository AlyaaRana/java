import java.util.Scanner;

public class challengeAritmatika {
    public static void main(String[] args) {
        Scanner aritmatika = new Scanner(System.in);

        System.out.println("Nilai 1");
        int nilai1 = aritmatika.nextInt();
        System.out.println("Nilai 2");
        int nilai2 = aritmatika.nextInt();

        System.out.println("Masukkan jenis operasi");
        int operasi = aritmatika.nextInt();

               //nitip
    }

    public static void perkalian(int a, int b){
        int kali=a*b;
        System.out.println("Hasil kali= "+kali);
    }
    public static void pembagian(int a, int b){
        int bagi=a/b;
        System.out.println("Hasil bagi= "+bagi);
    }
    public static void penambahan(int a, int b){
        int tambah=a+b;
        System.out.println("Hasil tambah= "+tambah);
    }
    public static void pengurangan(int a, int b){
        int kurang=a-b;
        System.out.println("Hasil kurang= "+kurang);
    }
}
