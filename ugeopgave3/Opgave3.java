import java.util.Scanner;

public class Opgave3 {

    // OPG 3: Pris beregner

    double applyDiscount(double price, double discountPercent) {
        return price * (1 - discountPercent / 100);
    }

    double addTax(double price) {
        return price * 1.25;
    }

    double calculateFinalPrice(double basePrice, double discount) {
        double priceAfterDiscount = applyDiscount(basePrice, discount);
        double finalPrice = addTax(priceAfterDiscount);
        return finalPrice;
    }

    void main () {
        double finalPrice = calculateFinalPrice(500, 20);
        System.out.println("Slutpris: " + finalPrice + " kr");
    }





}
