package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //level one encapsulation
        Bus bus = new Bus();
        bus.setColor("white");

        System.out.println("color "+ bus.getColor());

        //Inner Class encapsulation
        BusStation busStation = new BusStation();

        busStation.addBuses(busStation.new Bus("white"));
        busStation.addBuses(busStation.new Bus("red"));
        busStation.addBuses(busStation.new Bus("blue"));

        busStation.getbusses();

        //Inner method encapsulation
        BusStation busStation1 = new BusStation();
        busStation1.innerValidateBus();

        //anonymous class
        BusStation busStation2 = new BusStation();
        busStation2.anonyValidateBus();



    }
}
