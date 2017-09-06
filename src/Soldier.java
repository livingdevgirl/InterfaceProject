public abstract class Soldier {

    //write a few instance variables to define soldier
    private int rank;
    private String name;
    private int serialNumber;

    public Soldier(){

    }

    //write a few common behavior methods

    public String sleep(){
        return "snore";
    }

    public String eat(){
        return "chew";

    }

    public String walk(){
        return "trudge";
    }

    //create an abstract method for speak instances of footsoldiers?

    public abstract String speak();

    public  String kick(){
        return "blam!";

    }

    public String punch(){
        return "pow!";

    }

    public  String shoot(){
        return "pew pew pew";

    }

}

