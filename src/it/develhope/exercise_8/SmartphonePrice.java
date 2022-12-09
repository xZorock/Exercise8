package it.develhope.exercise_8;

import java.util.Objects;

public class SmartphonePrice implements Cloneable {

    private String priceType;
    private double priceInEuro;



    public SmartphonePrice(String priceType, double priceInEuro){
        this.priceType = priceType;
        this.priceInEuro = priceInEuro;
    }

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice) super.clone();
        return clonedSmartphonePrice;
    }

    @Override
    public String toString() {
        return "priceType" + " \'" + priceType + '\'' +
                ", priceInEuro=" + priceInEuro +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuro, priceInEuro) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuro);
    }
}
