public abstract class Articulo implements Comparable<Articulo> {
    private String nombre;
    private int precio;


    public Articulo(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int compareTo(Articulo art){
        if (this.precio>art.getPrecio()){
            return 1;
        } else if (this.precio< art.getPrecio()) {
            return -1;
        }
        return 0;
    }
}
