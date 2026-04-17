import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Multiplicador
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, -2, 3));
        System.out.println("Antes: " + nums);
        UtileriaNumeros.multiplicarArrayList(nums, -2);
        System.out.println("Después: " + nums);

        // Filtro Selectivo
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("Taco", "perro", "gato", "taquito", "sol"));
        System.out.println("\nAntes filtro: " + palabras);
        UtileriaCadenas.filtroSelectivo(palabras, 't', 4);
        System.out.println("Después filtro: " + palabras);

        // Conversor Mayúsculas
        ArrayList<String> mayus = UtileriaCadenas.convertirMayusculas(palabras);
        System.out.println("\nMayúsculas: " + mayus);
        System.out.println("Lista original (sin cambios): " + palabras);

        // Cuadrados únicos
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(2, 2, -4, 3));
        System.out.println("\nCuadrados únicos: " + UtileriaNumeros.cuadradosUnicos(nums2));

        // Mapa longitudes
        System.out.println("\nMapa longitudes: " + UtileriaCadenas.mapaLongitudes(palabras));

        // Inventario
        HashMap<String, Double> inventario = new HashMap<>();
        inventario.put("Laptop", 1000.0);
        inventario.put("Mouse", 200.0);
        System.out.println("\nInventario con descuento:");
        UtileriaNumeros.mostrarInventarioConDescuento(inventario);

        // Contador de frecuencias
        ArrayList<String> repetidas = new ArrayList<>(Arrays.asList("a", "b", "a", "c", "b", "a"));
        HashMap<String, Integer> freq = UtileriaCadenas.contadorFrecuencias(repetidas);
        System.out.println("\nFrecuencias: " + freq);

        // Clasificador
        System.out.println("Frecuencia menor a 3: " + UtileriaCadenas.clasificadorPalabras(freq, 3));

        // Deduplicación
        String frase = "Hola, hola mundo! taco Taco mundo.";
        System.out.println("\nDeduplicadas: " + UtileriaCadenas.deduplicacionPalabras(frase, 4));

        // Tope
        System.out.println("\nAntes tope: " + freq);
        UtileriaNumeros.limitarFrecuencias(freq, 2);
        System.out.println("Después tope: " + freq);

        // Edge cases
        System.out.println("\nLista vacía:");
        ArrayList<Integer> vacia = new ArrayList<>();
        UtileriaNumeros.multiplicarArrayList(vacia, 5);
        System.out.println(vacia);

        System.out.println("\nNull:");
        UtileriaNumeros.multiplicarArrayList(null, 2);
    }
}