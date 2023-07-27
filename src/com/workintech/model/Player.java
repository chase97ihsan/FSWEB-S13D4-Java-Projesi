package com.workintech.model;

import org.w3c.dom.ls.LSOutput;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name,int healthPercentage,Weapon weapon) {
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.name = name;
        this.weapon = weapon;
    }

    public int healthRemaining(){
        return healthPercentage;
    }
    public void loseHealth(int damage){
        if(damage>healthPercentage){
              System.out.println(name + " player has been knocked out of game");
              healthPercentage=0;
        }else if(damage<=healthPercentage){ healthPercentage=healthPercentage-damage;}
    }
    public void restoreHealth(int healthPotion){
        if(healthPercentage+healthPotion>100){
            healthPercentage=100;
        }else {healthPercentage=healthPercentage+healthPotion;}
    }

    public String toString(){
        return "Name= "+ name + " HeatPercentage= "+ healthPercentage+
                " Weapon= "+(weapon.getDamage()+" - "+weapon.getAttackSpeed());
    }
}
