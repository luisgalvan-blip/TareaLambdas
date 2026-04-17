import java.util.*;
import java.util.stream.*;

public class UtileriaCadenas {

    // Filtro Selectivo
    public static void filtroSelectivo(ArrayList<String> lista, char letra, int n) {
        if (lista == null) return;

        lista.removeIf(s ->
                s == null ||
                        s.toLowerCase().startsWith(String.valueOf(letra).toLowerCase()) ||
                        s.length() < n
        );
    }

    // Función auxiliar
    public static boolean contieneTaco(String s) {
        return s != null && s.toLowerCase().contains("taco");
    }

    // Conversor de Mayúsculas
    public static ArrayList<String> convertirMayusculas(ArrayList<String> lista) {
        if (lista == null) return new ArrayList<>();

        return lista.stream()
                .map(s -> s == null ? null : s.toUpperCase())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // Mapa de Longitudes
    public static HashMap<String, Integer> mapaLongitudes(ArrayList<String> lista) {
        if (lista == null) return new HashMap<>();

        return lista.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(
                        s -> s,
                        s -> s.length(),
                        (a, b) -> a,
                        HashMap::new
                ));
    }

    // Contador de Frecuencias
    public static HashMap<String, Integer> contadorFrecuencias(ArrayList<String> lista) {
        HashMap<String, Integer> mapa = new HashMap<>();

        if (lista == null) return mapa;

        lista.forEach(p -> {
            if (p != null)
                mapa.merge(p, 1, Integer::sum);
        });

        return mapa;
    }

    // Clasificador de Palabras
    public static ArrayList<String> clasificadorPalabras(HashMap<String, Integer> mapa, int limite) {
        if (mapa == null) return new ArrayList<>();

        return new ArrayList<>(
                mapa.entrySet().stream()
                        .filter(e -> e.getValue() < limite)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList())
        );
    }

    // Deduplicación de Palabras
    public static HashSet<String> deduplicacionPalabras(String frase, int n) {
        if (frase == null || frase.isEmpty()) return new HashSet<>();

        return Arrays.stream(frase.split("[^a-zA-Z]+"))
                .filter(p -> p.length() >= n)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(HashSet::new));
    }
}