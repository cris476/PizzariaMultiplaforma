package com.example.Modelo;

import java.util.List;

public class Pizza extends Producto {
 
     private Size size ; 

     private List<Ingrediente> ingredientes ;  
 
     public Pizza(int id , String nombre ,  double  precio , Size tamaño    ){
              super(id, nombre, precio) ; 
              this.size = tamaño ; 

     }

    
}
