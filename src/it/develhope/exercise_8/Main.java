package it.develhope.exercise_8;

public class Main {
    public static void main(String[] args) {
        SmartphonePrice producer = new SmartphonePrice("Euro", 600);
        SmartphonePrice producer2 = new SmartphonePrice("Euro", 750);
        SmartphonePrice retail = new SmartphonePrice("Euro",1200);
        SmartphonePrice retail2 = new SmartphonePrice("Euro",1300);

        Smartphone smartphone = new Smartphone("Samsung","Galaxy S9",8000,producer,retail);
        Smartphone smartphone1 = new Smartphone("Apple","Iphone 10",6000,producer2,retail2);

        System.out.println(smartphone + "\n" + smartphone1);

        System.out.println("Is smartphone equals to smartphone1? \n" + smartphone.equals(smartphone1));

        try {
            Smartphone clonedIphone = smartphone1.clone();
            System.out.println("--Cloned-- " + clonedIphone);
            System.out.println("Is clonedIphone equals to smartphone1? \n" + clonedIphone.equals(smartphone1));

        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}