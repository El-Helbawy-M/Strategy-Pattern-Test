package Strategyp_Patern.Models;

import Strategyp_Patern.Functions.Fluttering;

public class Pigeons extends Bird {
    public Pigeons() {
        fillData("Pigeons", "Columbiformes", new Fluttering());
    }
}
