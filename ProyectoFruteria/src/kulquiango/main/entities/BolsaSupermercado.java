package kulquiango.main.entities;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {

    private List<T> productos = new ArrayList<>();
    private final int MAX = 5;

    public void addProducto(T producto) {
        if (this.productos.size() < MAX) {
            productos.add(producto);
        } else {
            throw new RuntimeException("Item de 5 alcanzado");
        }

    }

    public List<T> getProducto() {
        return productos;
    }

}
