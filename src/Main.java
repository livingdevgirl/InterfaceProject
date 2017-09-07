import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        FootSoldier footSoldier = new FootSoldier() {};

        System.out.println(footSoldier.eat());

        Soldier toneLoc = new Soldier() {
            @Override
            public String speak() {
                return null;
            }
        };

        Bomb bomb = new Bomb() {};

        Ninja ninja = new Ninja(){};

        System.out.println(bomb.speak());


        System.out.println(bomb.boombang());
            //here is the original instance of it so it will return chew
        System.out.println(toneLoc.eat());

        System.out.println(footSoldier.boombang());
        System.out.println(ninja.boombang());
    }
}
