package com.coshmex.store.config;

public class SingletonCurrency {
    private Double currency;
    private static SingletonCurrency singletonCurrency;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private SingletonCurrency(Double currency) {
        this.currency = currency;
        System.out.println("El dolar es MXN es: " + this.currency);
    }

    public static SingletonCurrency getSingletonInstance() {
        if (singletonCurrency == null){
            Currency conversion = new Currency();
            singletonCurrency = new SingletonCurrency(conversion.conversion());
        }
        return singletonCurrency;
    }

    public Double getCurrency() {
        return currency;
    }

    public void setCurrency(Double currency) {
        this.currency = currency;
    }

    public static SingletonCurrency getSingletonCurrency() {
        return singletonCurrency;
    }

    public static void setSingletonCurrency(SingletonCurrency singletonCurrency) {
        SingletonCurrency.singletonCurrency = singletonCurrency;
    }
}


