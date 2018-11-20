package Vehicles;

import interfaces.IAttack;
import interfaces.IDamage;

public abstract class Vehicle {

    private String type;
    private int health;
    private int attack;


    public Vehicle(String type, int health, int attack){
        this.type = type;
        this.health = health;
        this.attack = attack;

    }

    public int getHealth(){
        return health;
    }

    public int getAttack(){
        return attack;
    }
    public int takeDamage(int amount){
        return health;

    }

}
