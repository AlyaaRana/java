package classObject;

import java.util.Scanner;

public class objectBuah {
    public static void main(String[] args) {
        buah buahku =  new buah();
        Scanner myBuah = new Scanner(System.in);
        System.out.println("Masukkan warna buah ");
        String warnaBuah = myBuah.nextLine();
        System.out.println("Masukkan nama buah");
        String namaBuah = myBuah.nextLine();
        System.out.println("Masukkan rasa buah");
        String rasaBuah = myBuah.nextLine();
        System.out.println("Masukkan berat buah");
        String beratBuah = myBuah.nextLine();

        buahku.setWarna(warnaBuah);
        buahku.setRasa(rasaBuah);
        buahku.setBerat(beratBuah);
        buahku.setNamaBuah(namaBuah);

        System.out.println("Warna buah nangka adalah "+buahku.getWarnaBuah());
        System.out.println("Nama buah ini adalah "+buahku.getNamaBuah());
        System.out.println("Rasa buah nangka adalah "+buahku.getRasaBuah());
        System.out.println("Berat buah nangka adalah "+buahku.getBerat());


    }
}
