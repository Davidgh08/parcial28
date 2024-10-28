public final class Laptop extends Producto implements Vendible {

    private String procesador;
    private String memoriaRAM;


    public Laptop(String nombre, String marca, double precio, int cantidadStock) {
        super(nombre, marca, precio, cantidadStock);
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    void mostrarDetalles() {
        System.out.println("-----------------------------------------------");
        System.out.println("el nombre de la laptop es: "+getNombre());
        System.out.println("procesador: "+getProcesador());
        System.out.println("memoriaRAM: "+getMemoriaRAM());
        System.out.println("precio: "+getPrecio());
        System.out.println("-----------------------------------------------");
    }


    @Override
    public void calcularPrecioVenta(int cantidad) {
        double total = getPrecio() * cantidad;
        if (cantidad> 3){
            total = total *0.10;
        }
        System.out.println("-----------------------------------------------");
        System.out.println("el precio de la Laptop es de: "+total);
        System.out.println("-----------------------------------------------");
    }
}
