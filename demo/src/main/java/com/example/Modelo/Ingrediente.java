package com.example.Modelo;

import java.util.ArrayList;

public class Ingrediente {
    

     private  int id ; 
     private  String nombre ; 
     private  ArrayList<String> alergenos ;

     
    public Ingrediente(int id, String nombre, ArrayList<String> alergenos) {
        this.id = id;
        this.nombre = nombre;
        this.alergenos = alergenos;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public ArrayList<String> getAlergenos() {
        return alergenos;
    }


    public void setAlergenos(ArrayList<String> alergenos) {
        this.alergenos = alergenos;
    } 



     


}
