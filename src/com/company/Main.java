package com.company;

public class Main {

    public static void main(String[] args) {
 Boss boss = new Boss(500, 30);
 boss.weapon.setWeaponName("AK");
 boss.weapon.setWeaponType("M4");
        System.out.println(boss.info());
        Skeleton skeleton = new Skeleton(300, 25, 15);
        skeleton.weapon.setWeaponName("Bow");
        skeleton.weapon.setWeaponType("arrows");
        System.out.println(skeleton.info1());
        Skeleton zombie = new Skeleton(300, 25, 15);
        zombie.weapon.setWeaponName("Bow");
        zombie.weapon.setWeaponType("arrows");
        System.out.println(zombie.info1());
    }
}
