package PAS_Ver2;

public class isiData extends dataBarang{
    public static void main(String[] args) {
        dataBarang jajan = new dataBarang();
        jajan.inputBarang("Cokiee", 2500);

        dataBarang minuman = new dataBarang();
        minuman.inputBarang("Pocari sweet", 8000);

        dataBarang makanan = new dataBarang();
        makanan.inputBarang("Candy sweety", 5000);

        dataBarang cemilan = new dataBarang();
        cemilan.inputBarang("Cetoss", 8000);

        dataBarang eskrim = new dataBarang();
        eskrim.inputBarang("Es Cerry Berry Sweeety", 10000);
    }
}
