package PAS_Ver2;

public class dataBarang {
    private String  namaBarang, jenisbarang;
    private float hargaBarang;
    private int jumlahBeli, jumlahBarang, kodeBarang;
    private double bayar;

    public String getJenisbarang() {
        return jenisbarang;
    }

    public void setJenisbarang(String jenisbarang) {
        this.jenisbarang = jenisbarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public int getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(int kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public float getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(float hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }
    public double getBayarbayar(){
        bayar = hargaBarang * jumlahBeli;
        return bayar;
    }

    public static void inputBarang(String namaBarang,Integer hargaBarang){
        System.out.println(namaBarang + "dengan harga Rp." + hargaBarang);
    }
}
