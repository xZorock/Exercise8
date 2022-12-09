package it.develhope.exercise_8;

import java.util.Objects;

public class Smartphone implements Cloneable {

    private String branName;
    private String modelName;
    private int batterymAh;

    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    public Smartphone(String branName, String modelName, int batterymAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice){
        this.branName=branName;
        this.modelName=modelName;
        this.batterymAh=batterymAh;
        this.producerPrice=producerPrice;
        this.retailPrice=retailPrice;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "branName='" + branName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                " - producerPrice = " + producerPrice +
                ", retailPrice = " + retailPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && Objects.equals(branName, that.branName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException{
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = producerPrice;
        clonedSmartphone.retailPrice = retailPrice;
        return clonedSmartphone;
    }
}
