package com.company;

public class Boss extends GameEnity {
    Weapon weapon = new Weapon();

    public Boss(int health, int damage) {
        super(health, damage);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;

    }
    public String info (){
        return getHealth() + getDamage() + weapon.getWeaponName() + weapon.getWeaponType();
    }
}
