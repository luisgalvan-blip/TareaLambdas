import java.util.*;
import java.util.stream.*;

public class UtileriaNumeros {

    // Multiplicador
    public static void multiplicarArrayList(ArrayList<Integer> lista, int factor) {
        if (lista == null) return;

        lista.replaceAll(n -> n * factor);
    }

    // Cuadrados Únicos
    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> lista) {
        if (lista == null) return new HashSet<>();

        return lista.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toCollection(HashSet::new));
    }

    // Modificador de Inventario
    public static void mostrarInventarioConDescuento(HashMap<String, Double> inventario) {
        if (inventario == null) return;

        inventario.forEach((producto, precio) -> {
            double descuento = precio * 0.9;
            System.out.printf("%s -> Precio con descuento: $%.2f%n", producto, descuento);
        });
    }

    // Tope de Frecuencias
    public static void limitarFrecuencias(HashMap<String, Integer> mapa, int max) {
        if (mapa == null) return;

        mapa.replaceAll((k, v) -> v > max ? max : v);
    }
}
