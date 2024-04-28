import java.text.SimpleDateFormat;
import java.util.Date;

public class OrdenCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProductos;
    private static int ultimoId;

    public OrdenCompra() {
        this.id = ++OrdenCompra.ultimoId;
        this.productos = new Producto[4];
    }

    public OrdenCompra(String descripcion) {
        this();
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto){
        if(indiceProductos < this.productos.length){
            this.productos[indiceProductos++] = producto;
        }
    }

    public double calcularTotal() {
        double precio;
        double total = 0;
        for (Producto p : this.getProductos()) {
                precio = p.getPrecio();
                total += precio;
        }
        return total;
    }

    public String fechaString(){
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return df.format(this.fecha);
    }

    public String verDetalle(){
        String detalle="Detalles de la orden "+this.getId();
        detalle += "\nID de la compra: "+ this.getId() +
                "\nDescripción de la compra: " + this.getDescripcion() +
                "\nFecha de la compra: " + fechaString();
        if(this.getCliente()!=null){
            detalle+="\nNombre del comprador: " + this.getCliente();
        }
        if(this.getProductos()!=null){
            int i=1;
            for(Producto p: this.getProductos()){
                detalle+="\nProducto "+i+": "+p.getFabricante() + ", Nombre: " + p.getNombre()+ ", precio: " + p.getPrecio();
                i++;
            }
            detalle+="\nTotal de la orden "+this.calcularTotal();
            System.out.println();
        }
        return detalle;
    }
}
