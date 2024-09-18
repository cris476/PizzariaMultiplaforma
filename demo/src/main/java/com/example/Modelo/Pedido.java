import java.util.Date;

public class Pedido {

    private int id; 
    private Date fecha; 
    private Float precioTotal; 
    private EstadoPedido estado; 

    // Constructor
    public Pedido(int id, Date fecha, Float precioTotal, EstadoPedido estado) {
        this.id = id;
        this.fecha = fecha;
        this.precioTotal = precioTotal;
        this.estado = estado;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    // Método para finalizar el pedido
    public void finalizarPedido() {
        this.estado = EstadoPedido.ENTREGADO; 
    }
}
