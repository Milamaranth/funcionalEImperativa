package com.programacionImperativaYFuncional;

import java.math.BigDecimal;
import java.util.List;

public class ProductFuncional{

    public static void main(String[] args){

        List<Product> shoppingCart = List.of(
        new Product("Clothes", new BigDecimal("15.90"),Tax.NORMAL),
        new Product("Bread", new BigDecimal("1.5"),Tax.SUPERREDUCED),
        new Product("Meat", new BigDecimal("13.99"),Tax.REDUCED),
        new Product("Cheese", new BigDecimal("3.59"),Tax.SUPERREDUCED),
        new Product("Coke", new BigDecimal("1.89"),Tax.REDUCED),
        new Product("Whiskey", new BigDecimal("19.90"),Tax.NORMAL));

        BigDecimal amount = shoppingCart.stream().map(x -> x.price).reduce(BigDecimal.ZERO, (x,y) -> x.add(y));

        //Stream<Object> precio = shoppingCart.stream().map(x -> x.price);
        //Stream<Object> impuesto = shoppingCart.stream().map(x -> x.tax);
        BigDecimal suma = shoppingCart.stream()
            .map(x -> aplicarImpuest(x.price, x.tax.percent))
            .reduce(BigDecimal.ZERO, (x,y) -> x.add(y));

        System.out.println("El total es " + amount + ". Con impuestos: " + suma);
    }

    public static BigDecimal aplicarImpuest(BigDecimal price, int taxPercent) {
        return price.multiply(BigDecimal.ONE.add(BigDecimal.valueOf(taxPercent).divide(BigDecimal.valueOf(100))));
    }
}