package inheritance;

public class kendaraanMobil {
    public static void main(String[] args) {
        kendaraan mobil = new kendaraan();
        mobil.JumlahRoda = 6;
        mobil.tancapGas();

        motor honda = new motor();
        honda.JumlahRoda = 2;
        honda.tancapGas(25);
    }
}
