package Corte1.semana3.Ejercicio6;
import java.util.ArrayList;
import java.util.List;

public class Caja implements Item {

    private List<Item> items = new ArrayList<>();

    public void agregar(Item item) {
        items.add(item);
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrecio();
        }
        return total;
    }
}
