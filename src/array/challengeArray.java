package array;

import java.util.Scanner;

public class challengeArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlahsiswa;
        System.out.println("Ada berapa siswa di PPLG 2?");
        jumlahsiswa = scan.nextInt();
        String[] siswa = new String[jumlahsiswa];

        System.out.println();
        int i = 0;
        while (i < siswa.length){
            System.out.println("Masukkan nama siswa:");


            siswa[i] = scan.next();
            i++;
        }

        System.out.println();
                 for(String jmlahsiswa : siswa) {
                    if (jmlahsiswa.equals("Nafis")) {
                        System.out.println("Siswa yang tidak masuk : " + jmlahsiswa);
                    } else
                        System.out.println("Siswa yang masuk : " + jmlahsiswa);
                    };
    }
}
