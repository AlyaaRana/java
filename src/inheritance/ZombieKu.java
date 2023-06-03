package inheritance;

public class ZombieKu {
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie();
        zombie1.name="zombi 1";
        zombie1.healthPoint=1000;
        zombie1.attactPoint=500;
        zombie1.attack();
        zombie1.walk();
    }
}
