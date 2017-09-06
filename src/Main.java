public class Main {
    public static void main(String[] args) {

        FootSoldier footSoldier = new FootSoldier() {
            @Override
            public String speak() {
                return null;
            }
        };
        System.out.println(footSoldier.eat());

        Soldier toneLoc = new Soldier() {
            @Override
            public String speak() {
                return null;
            }
        };

        Bomb bomb = new Bomb() {
            @Override
            public String speak() {
                return null;
            }
        };


        System.out.println(bomb.toString());
            //here is the original instance of it so it will return chew
        System.out.println(toneLoc.eat());
    }
}
