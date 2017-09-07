public class FootSoldier implements Explode {


    public String eat(){
        return "I eat feet!";
        //overriding the eat here

    }
    @Override
    public String speak() {
        return "hup two three!";
    }

    @Override
    public String boombang() {
        return "I exploded!";
    }
}
