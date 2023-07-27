package com.workintech.model;

public enum Weapon {

   G3(20,1.5),
    SWORD(25,1.7),
    BIXI(27,1.8);

   private int damage;
   private double attackSpeed;
   Weapon(int damage,double attackSpeed){
       this.damage=damage;
       this.attackSpeed=attackSpeed;
   }

    public int getDamage(){
       return damage;
    }
    public double getAttackSpeed(){
       return attackSpeed;
    }
}
