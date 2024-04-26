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

    public OrdenCompra addProducto(Producto producto){
        if(indiceProductos < this.productos.length){
            this.productos[indiceProductos++] = producto;
        }
        return this;
    }

    public double calcularTotal(Producto producto) {
        double precio=0;
        double total = 0;
        for (Producto p : this.getProductos()) {
                precio = p.getPrecio();
                total += precio;
        }
        return total;
    }

    public String verDetalle(){
        String detalle = "compra.id = "+ this.getId() +
                "\ncompra.descripcion = " + this.getDescripcion() +
                "\ncompra.fecha = " + this.getFecha();
        if(this.getCliente()!=null){
            detalle+="\ncompra.cliente = " + this.getCliente();
        }
        if(this.getProductos()!=null){
            detalle+="\nProductos de la orden:";
            for(Producto p: this.getProductos()){
                detalle+="\n"+p.getFabricante() + ", Nombre: " + p.getNombre()+ ", precio: " + p.getPrecio();
            };
        }
        return detalle;
    }
}
