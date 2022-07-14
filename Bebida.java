public class Bebida extends Articulo {
    private double litros;

    public Bebida(String nombre, int precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }
    @Override
    public String toString(){
        return "Nombre: " + getNombre() + " /// Litros: " + getLitros() + " /// Precio: $" + getPrecio();
    }

}
