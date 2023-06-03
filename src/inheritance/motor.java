package inheritance;

//extends kendaraan artinya, motor menjadi anak dari kendaraan
//superclass kendaraan subclass motor
public class motor extends kendaraan{
    public int maxspeed;

    public void tancapGas(int speed){
        System.out.println("Motor berjalan dentan maxpeed" +speed + "km/jam");
    }
}

