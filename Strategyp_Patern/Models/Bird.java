package Strategyp_Patern.Models;

import Strategyp_Patern.Functions.Fly;

abstract class Bird {
    public String name, kind;
    public Fly flying;

    void printData() {
        System.out.println("name: " + this.name + "kind: " + this.kind);
    }

    void fillData(String name, String kind, Fly flyingMethod) {
        this.kind = kind;
        this.name = name;
        this.flying = flyingMethod;
    }
}