public class Main {
    public static void main(String[] args) {

        Laptop lap1 = new Laptop("air","mac",3.800000,10);
        Celular cel1 = new Celular("iphone 14","aple", 3.200000,10);
        Cliente cliente1 = new Cliente("miguel","iphone",3.200000,10,"miguel","miguel@gmail.com");

        cliente1.mostrarDetalles();

        cel1.mostrarDetalles();
        cel1.calcularPrecioVenta(1);

        lap1.mostrarDetalles();
        lap1.calcularPrecioVenta(5);

        cliente1.mostrarDetalles();





    }
}