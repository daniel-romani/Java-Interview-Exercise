import java.util.ArrayList;
import java.util.Collections;

public class Supermercado {
    private ArrayList<Articulo> listaDeArticulos = new ArrayList<Articulo>();
    
    public void cargarListado(){
        listaDeArticulos.add(new Bebida("Coca-Cola Zero", 20, 1.5));
        listaDeArticulos.add(new Bebida("Coca-Cola", 18, 1.5));
        listaDeArticulos.add(new Higiene("Shampoo Sedal", 19, 500));
        listaDeArticulos.add(new Fruta("Frutillas", 64, "Kilo"));
    }
    public void mostrarListado(){
        for (Articulo i:listaDeArticulos) {
            System.out.println(i.toString());
        }
        System.out.println("==============================");
    }
    public void ordenarListaPorPrecio(){
        Collections.sort(listaDeArticulos);
    }
    public void artMasCaro(){
        int ultimoArt = listaDeArticulos.size();
        System.out.println("Producto más caro: " + listaDeArticulos.get(ultimoArt - 1).getNombre());
    }
    public void artMasBarato(){
        System.out.println("Producto más barato: " + listaDeArticulos.get(0).getNombre());
    }
}
