public class method_aritmatika {
    public static void main(String[] args) {
        hitungLuasSegitiga(5, 7);
        hitungLuasSegitiga(2, 10);
        hitungLuasSegitiga(191, 357);
    }
    static void hitungLuasSegitiga(int alas, int tinggi) {
        double luas = (alas * tinggi) / 2;
        System.out.println("Luas segitiga adalah: "+luas);
    }

    //Di baris 3, fungsi hitungLuasSegitiga() saya definisikan dengan 2 buah parameter integer, yakni alas dan tinggi. Penamaan parameter boleh bebas, selama mengikuti aturan penamaan variabel, misalnya tidak boleh ada spasi dan tidak boleh diawal angka.
    //
    //Antara baris 9 – 11 saya menjalankan fungsi hitungLuasSegitiga() sebanyak 3 kali dengan nilai argument yang berbeda-beda.
    //
    //Sebagai contoh, ketika compiler Java memproses perintah hitungLuasSegitiga(5, 7), maka angka 5 ini akan mengisi parameter alas, dan angka 7 akan mengisi parameter tinggi. Selanjutnya kedua parameter ini akan masuk ke perhitungan luas di baris 4. Hasilnya kemudian di tampilkan dari perintah System.out.println() di baris 5.
}
