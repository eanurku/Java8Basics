package com.eanurku.DefaultInterfaceMethods;


interface Vehicles{
    default  void print(){
        System.out.println("inside vehilce print()");
    }
    static void applyBreak(){
        System.out.println("inside vehilce apply break()");
    }

}

interface FourWheelars{

    default  void print(){
        System.out.println("inside four wheelar print()");
    }

    static void applybreak(){
        System.out.println("inside four wheelar apply break");
    }
}

class Cars implements Vehicles,FourWheelar{


    @Override
    public void print() {
        System.out.println("resolving conflict of methods for cars class");
    }
}

class NewCars implements Vehicles,FourWheelars{

    @Override
    public void print() {
        Vehicles.super.print();
    }

    public void mymethod(){
        System.out.println("inside mymethod of new cars class");
        Vehicles.super.print();
    }
}
public class MultipleDefaults {
    public static void main(String[] args) {

        Cars car=new Cars();
        car.print();

        NewCars newcar=new NewCars();
        newcar.print();

        newcar.mymethod();

        Vehicles.applyBreak();
        FourWheelars.applybreak();






    }
}
