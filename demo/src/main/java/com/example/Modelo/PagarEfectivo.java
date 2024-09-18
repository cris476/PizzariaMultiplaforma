public class PagarEfectivo  implements Pagable{

    @Override
    public void pagar(double cantidad) {
         System.out.println("Se  ha realizaso un pago en efectivo con la cantidad  de " + cantidad);
    }
    
}
