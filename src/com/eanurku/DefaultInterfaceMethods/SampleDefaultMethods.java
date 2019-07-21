package com.eanurku.DefaultInterfaceMethods;


interface Vehicle{
    default  void print(){
        System.out.println("inside vehilce print()");
    }
   static void applyBreak(){
        System.out.println("inside vehilce apply break()");
    }

}

interface FourWheelar{

    default  void print(){
        System.out.println("inside four wheelar print()");
    }

    static void applybreak(){
        System.out.println("inside four wheelar apply break");
    }
}

class Car implements FourWheelar{


}
public class SampleDefaultMethods {
    public static void main(String[] args) {

        Car car=new Car();
        car.print();
        FourWheelar.applybreak();
    }
}
