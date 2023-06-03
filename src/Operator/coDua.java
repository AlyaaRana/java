package Operator;

public class coDua {
    public static void main(String[] args) {
        //aritmatika
        System.out.println("Aritmatika");
        int angka1, angka2;
        int hasil;

        angka1 = 4;
        angka2 = 2;
        hasil = angka1 + angka2;
        System.out.println("Hasil penambahan 4 + 2 =" + hasil);

        angka1 = 5;
        angka2 = 2;
        hasil= angka1 - angka2;
        System.out.println("Hasil pengurangan 5 - 2 =" + hasil);

        angka1 = 4;
        angka2 = 3;
        hasil = angka1 * angka2;
        System.out.println("Hasil perkalian 4 * 3 =" + hasil);

        angka1 = 10;
        angka2 = 2;
        hasil= angka1 / angka2;
        System.out.println("Hasil pembagian 10 / 2 =" + hasil);

        angka1 = 7;
        angka2 = 2;
        hasil= angka1 % angka2;
        System.out.println("Hasil sisa bagi 7 % 2 =" +hasil);

        System.out.println(" ");

        //penugasan
        System.out.println("Penugasan");
        int A, B;
        A = 6;
        B = 3;

        A += B; // A skr bernilai 9
        System.out.println("Penambahan =" + A);
        A -= B; // A skr bernilai 3
        System.out.println("Pengurangan =" + A);
        A *= B; //A skr bernilai 18
        System.out.println("Perkalian =" + A);
        A /= B; //A skr bernilai 2
        System.out.println("Pembagian =" + A);
        A %= B; //A skr bernilai 0
        System.out.println("Sisa Bagi =" +A);

        //pembanding
        System.out.println("Pembanding");
        System.out.println(" ");
        System.out.println("Pembanding");
        int nilai1 = 3, nilai2 = 6;
        boolean hasil1;
        hasil1 = nilai1 < nilai2; //nilai lebih kecil dari
        System.out.println(hasil1);
        hasil1 = nilai1 > nilai2; //nilai lebih besar dari
        System.out.println(hasil1);
        hasil1 = nilai1 == nilai2; //nilai sama dengan dari
        System.out.println(hasil1);
        hasil1 = nilai1 != nilai2; //nilai tidak sama dengan dari
        System.out.println(hasil1);
        hasil1 = nilai1 <= nilai2; //nilai lebih kecil sama dengan dari
        System.out.println(hasil1);
        hasil1 = nilai1 >= nilai2; //nilai lebih besar dari nilai
        System.out.println(hasil1);

        //logika
        System.out.println("Logika");
        System.out.println(" ");
        System.out.println("Logika");
        int x = 1, y = 2;
        boolean z;
        System.out.println("Nilai x =" + x);
        System.out.println("Nilai y =" +y);

        // Untuk AND = salah satu salah, salah semua
        // true true = true
        // true false= false
        // false true= false
        // false false= false

        //Untuk OR = masi ada toleransi
        // true true= true
        // true false= true
        // false true= true
        //false false= false

        //logika &&
        z = x < y && x > y;
        System.out.println("(x < y = true) && ( x > y = false) : " + z);

        //logika ||
        z = x < y || x > y;
        System.out.println("(x < y = true) || (x > y = false): " + z);

        //logika !
        z = ! (x < y);
        System.out.println("! (x < y  = true ) : "+z);
    }
}
