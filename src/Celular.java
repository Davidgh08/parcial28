public class Celular extends Producto implements Vendible {

    private double capacidadBateria;
    private double camaraResolucion;


    public Celular(String nombre, String marca, double precio, int cantidadStock) {
        super(nombre, marca, precio, cantidadStock);
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getCamaraResolucion() {
        return camaraResolucion;
    }

    public void setCamaraResolucion(double camaraResolucion) {
        this.camaraResolucion = camaraResolucion;
    }

    @Override
    void mostrarDetalles() {
        System.out.println("-----------------------------------------------");
        System.out.println("el nombre del celular es: "+getNombre());
        System.out.println("la bateria es de: "+getCapacidadBateria()+"mp");
        System.out.println("la camara es de: "+getMarca()+"px");
        System.out.println("el precio es: "+getPrecio());
        System.out.println("-----------------------------------------------");


    }

    @Override
    public void calcularPrecioVenta(int cantidad) {
        double total = getPrecio() * cantidad;
        if (cantidad > 2) {
            total = total * 0.10;
        }
        System.out.println("-----------------------------------------------");
        System.out.println("el precio de la Laptop es de: "+total);
        System.out.println("-----------------------------------------------");
    }
}
