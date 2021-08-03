package Strategyp_Patern.Models;

import Strategyp_Patern.Functions.NoFly;

public class Penguins extends Bird {
    public Penguins() {
        fillData("Penguins", "Gentoo", new NoFly());
    }
}
