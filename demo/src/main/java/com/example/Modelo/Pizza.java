public class Pizza extends Producto {
 
     private Size size ; 
 
     public Pizza(int id , String nombre ,  double  precio , Size tamaño    ){
              super(id, nombre, precio) ; 
              this.size = tamaño ; 

     }

    
}
