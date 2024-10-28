import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Producto {
    private String nombre;
    private String correo;
    private List<Producto> productosComprados = new ArrayList<>();
    private List<Integer> cantidadesCompradas  = new ArrayList<>();

    public Cliente(String nombre, String marca, double precio, int cantidadStock, String nombre1, String correo) {
        super(nombre, marca, precio, cantidadStock);
        this.nombre = nombre1;
        this.correo = correo;
    }

    public void comprarProducto(String producto, int cantidad){
        cantidad = reducirStock(cantidad);
        producto = getMarca();
    }

    @Override
    void mostrarDetalles() {

    }
}
