package org.example;

public class Application {
    public static void main(String[] args) {
        Delivery delivery1=new Delivery(5.6,new CalculateBike());
        Delivery delivery2=new Delivery(11.73,new CalculateCar());
        System.out.println(delivery1.calculatePrice());
        System.out.println(delivery2.calculatePrice());
    }
}
