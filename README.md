# Tarea Lambdas en Java

## Descripción

Este proyecto implementa una serie de métodos estáticos en Java que hacen uso de expresiones lambda, Streams y colecciones como ArrayList, HashSet y HashMap. El objetivo es aplicar programación funcional para manipular datos numéricos y cadenas de texto de manera eficiente.

El programa está organizado en dos clases principales: una para operaciones numéricas y otra para manipulación de cadenas. Además, se incluye una clase Main que contiene pruebas completas para demostrar el funcionamiento de todos los métodos.


## Métodos implementados

1. multiplicarArrayList
   Multiplica cada elemento de un ArrayList de enteros por un factor dado utilizando replaceAll y una expresión lambda.

2. filtroSelectivo
   Elimina elementos de un ArrayList de cadenas si comienzan con una letra específica o si su longitud es menor a un valor dado.

3. convertirMayusculas
   Convierte todas las cadenas de una lista a mayúsculas utilizando stream y map, regresando una nueva lista sin modificar la original.

4. cuadradosUnicos
   Genera un HashSet con los cuadrados de los números pares únicos de una lista.

5. mapaLongitudes
   Crea un HashMap donde cada palabra es la clave y su longitud es el valor.

6. mostrarInventarioConDescuento
   Imprime un catálogo de productos aplicando un descuento del 10% a cada precio sin modificar el mapa original.

7. contadorFrecuencias
   Cuenta cuántas veces aparece cada palabra en una lista utilizando merge y expresiones lambda.

8. clasificadorPalabras
   Filtra palabras cuya frecuencia es menor a un umbral dado y las regresa en una lista.

9. deduplicacionPalabras
   Procesa una frase, elimina palabras cortas, convierte a minúsculas y elimina duplicados utilizando un HashSet.

10. limitarFrecuencias
    Limita los valores de un mapa de frecuencias a un máximo definido utilizando replaceAll.


## Estructura del proyecto

* UtileriaNumeros.java
  Contiene métodos relacionados con operaciones numéricas.

* UtileriaCadenas.java
  Contiene métodos para manipulación de cadenas.

* Main.java
  Clase de pruebas donde se ejecutan todos los métodos con ejemplos.


## Instrucciones de compilación y ejecución

1. Compilar los archivos:
   javac *.java

2. Ejecutar el programa:
   java Main

## Ejemplo de salida

Antes: [1, -2, 3]
Después: [-2, 4, -6]

Antes filtro: [Taco, perro, gato, taquito, sol]
Después filtro: [perro, gato]

Mayúsculas: [PERRO, GATO]

Cuadrados únicos: [4, 16]

Mapa longitudes: {perro=5, gato=4}

Inventario con descuento:
Laptop -> Precio con descuento: $900.00
Mouse -> Precio con descuento: $180.00

Frecuencias: {a=3, b=2, c=1}
Frecuencia menor a 3: [b, c]

Deduplicadas: [hola, mundo, taco]

Antes tope: {a=3, b=2, c=1}
Después tope: {a=2, b=2, c=1}

## Consideraciones

El programa maneja correctamente casos especiales como listas vacías y valores nulos.
Las operaciones que lo requieren modifican las estructuras de datos directamente, mientras que otras generan nuevas colecciones sin alterar las originales.
Se siguen las convenciones de Java para nombres y organización del código.

## Repositorio

Este proyecto debe subirse a un repositorio público de GitHub con un nombre descriptivo.
Asegúrate de incluir todos los archivos fuente y este README correctamente formateado.
