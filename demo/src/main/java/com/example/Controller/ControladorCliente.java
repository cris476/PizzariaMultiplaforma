package com.example.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.Modelo.Cliente;
import com.example.Modelo.EstadoPedido;
import com.example.Modelo.LinePedido;
import com.example.Modelo.Pedido;

public class ControladorCliente {
    
        private  List<Cliente> clientes = new ArrayList<Cliente>() {
            Cliente cliente1 = new Cliente(1, "12345678A", "Juan Pérez", "Calle Falsa 123", "123456789", "juan.perez@email.com", "password123");
            Cliente cliente2 = new Cliente(2, "23456789B", "Ana García", "Avenida Siempreviva 742", "987654321", "ana.garcia@email.com", "password456");
            Cliente cliente3 = new Cliente(3, "34567890C", "Luis Martínez", "Calle del Sol 22", "564738291", "luis.martinez@email.com", "password789");
            Cliente cliente4 = new Cliente(4, "45678901D", "María López", "Paseo de la Luna 7", "473829102", "maria.lopez@email.com", "password987");
            Cliente cliente5 = new Cliente(5, "56789012E", "Carlos Fernández", "Calle del Mar 34", "837192645", "carlos.fernandez@email.com", "password654");
            Cliente cliente6 = new Cliente(6, "67890123F", "Laura Sánchez", "Plaza Mayor 15", "726839401", "laura.sanchez@email.com", "password321");
        }; 

     
       
         Pedido p = new Pedido(0,new Date(), 2.2f, EstadoPedido.ENTREGADO);

      public void RegistrarCliente(String dni 
        , String nombre
        , String dirreccion 
        , String  telefono 
        , String  email 
        , String password){

            int numeros = 0 ; 
            /*
             * 
             * 
             * 
             */
                   

           clientes.add( new Cliente(numeros++, dni, nombre, dirreccion, telefono, email, password));


      }


      public void loginCliente(String nombreUsuario , String passwordUsuario){

                     for (Cliente cliente : clientes) {
                          if(cliente.equals(cliente)  &&  passwordUsuario  == cliente.getPassword() )  System.out.println("cliente registrado");
                          else System.out.println("Usuario no acptado");
                         
                     } 

      }


      public  void agregarLineaPedido(LinePedido p){
        
      }



}
