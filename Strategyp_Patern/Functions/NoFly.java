package Strategyp_Patern.Functions;

public class NoFly implements Fly {
    public void fly() {
        System.out.println("Can't fly");
    }
}
