package inheritance;

public class YoshiKu {
    public static void main(String[] args) {
        Yoshi yoshi1= new Yoshi();
        yoshi1.name = "YoshiYoshi";
        yoshi1.attackPoint= 2000;
        yoshi1.health=900;
        yoshi1.power();
        yoshi1.eat();
    }
}
