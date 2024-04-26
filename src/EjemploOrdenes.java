import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        Date fecha = new Date();

        Cliente cliente1 = new Cliente("Jorge", "Gutierrez");
        OrdenCompra orden1 = new OrdenCompra("Orden de Hot wheels");
        orden1.setFecha(fecha);
        orden1.setCliente(cliente1);


        orden1.addProducto(new Producto("Mattel","Batimovil", 300));
        orden1.addProducto(new Producto("Mattel","Lamborghini", 200));
        orden1.addProducto(new Producto("Mattel","Bugatti", 370));
        orden1.addProducto(new Producto("Mattel","McLaren", 300));

        Cliente cliente2 = new Cliente("Jorge", "Gutierrez");
        OrdenCompra orden2 = new OrdenCompra("Orden de dulces");
        orden2.setFecha(fecha);
        orden2.setCliente(cliente2);

        orden2.addProducto(new Producto("Ferrero","Paquete de 10 Kinder Sorpresa", 250));
        orden2.addProducto(new Producto("Hershey","Paquete de 10 Chocolates blancos", 260));
        orden2.addProducto(new Producto("Vero","Paquete de 50 Picafresas", 200));
        orden2.addProducto(new Producto("Sonrics","Paquete de 18 rockaletas", 230));

        Cliente cliente3 = new Cliente("Fernando", "Gonzalez");
        OrdenCompra orden3 = new OrdenCompra("Orden de videojuegos");
        orden3.setFecha(fecha);
        orden3.setCliente(cliente3);

        orden3.addProducto(new Producto("Ubisoft","Far cry 6", 900));
        orden3.addProducto(new Producto("Rockstar games","GTA V", 500));
        orden3.addProducto(new Producto("Fromsoftware","Elden ring", 900));
        orden3.addProducto(new Producto("Konami","Metal gear solid V", 600));

        System.out.println(orden1.verDetalle());
        System.out.println(orden2.verDetalle());
        System.out.println(orden3.verDetalle());

    }
}