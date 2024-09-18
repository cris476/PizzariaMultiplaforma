public class Bebida  extends Producto{
    
    private Size size ; 
 
    public Bebida(int id , String nombre ,  double  precio , Size tamaño    ){
             super(id, nombre, precio) ; 
             this.size = tamaño ; 

    }



}
