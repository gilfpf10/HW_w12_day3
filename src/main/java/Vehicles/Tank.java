package Vehicles;

import interfaces.IAttack;
import interfaces.IDamage;


public class Tank extends Vehicle {

    public Tank(String type, int health, int attack) {
        super(type, health, attack);

    }

    public void attack(IDamage enemy){
        enemy.takeDamage(getAttack());

    }
}