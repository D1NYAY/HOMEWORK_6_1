package com.company;

import com.company.Boss;

public class Skeleton extends Boss {


    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    private int arrow;

    public Skeleton(int health, int damage, int arrow) {
        super(health, damage);
        this.arrow = arrow;
    }
    public String info1 (){
        return super.info() + arrow;
    }
}

