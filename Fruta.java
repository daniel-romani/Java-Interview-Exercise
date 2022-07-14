public class Fruta extends Articulo{
    private String unidadDeVenta;

    public Fruta(String nombre, int precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + getUnidadDeVenta();
    }
}
