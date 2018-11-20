package Kaiju;

public class FlyingLizard extends Kaiju {

    public FlyingLizard(String name, int health, int attack){
        super(name, health, attack);

    }


    public String roar(){
        return "Miau";

    }

    public String move(){
        return "Mooove";

    }
}
