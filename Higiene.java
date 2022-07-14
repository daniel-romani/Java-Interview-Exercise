public class Higiene extends Articulo{

    private int contenido;

    public Higiene(String nombre, int precio, int contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + " /// Contenido: " + getContenido() + "ml /// Precio: $" + getPrecio();
    }
}
