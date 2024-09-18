package com.example.Modelo;

public class Pagatarjeta implements Pagable{

    @Override
    public void pagar(double cantidad) {
        System.out.println("Se  ha realizado un pago  con una tarjeta con la cantidad  de " + cantidad);    
    }
    
}
