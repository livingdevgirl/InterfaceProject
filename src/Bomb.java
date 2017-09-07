public class Bomb extends Soldier implements Explode {

    Bomb(){


    }

    @Override
    public String speak() {
        return "BOOOOM!";
    }

    @Override
    public String boombang() {
        return "bangboom";
    }
}
