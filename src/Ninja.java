public class Ninja extends Soldier implements Explode{
    Ninja(){

    };

    public String eat(){
        return "nanjas no need food";
        //overriding the eat here

    }
    @Override
    public String speak() {
        return "ninja's dont speak";
    }


}
