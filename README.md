# Taller Investigativo: Buenas Prácticas y Métodos Abreviados en Java

Este repositorio contiene la investigación y los ejemplos prácticos correspondientes al **Taller Investigativo** sobre las nuevas APIs, operadores compactos y azúcar sintáctico introducidos en versiones modernas de Java.

---

## 📋 Información del Proyecto y Aprendiz

* **Aprendiz:** Andrés Felipe Pabón Ardila
* **Programa de Formación:** Análisis y Desarrollo de Software (ADSO)
* **Ficha:** 3407799
* **Instructora:** Carlos Julio Cadena
* **Centro de Formación:** SENA - Neiva
* **Año:** 2026
* **Documento Base de Investigación:** [taller.txt](file:///C:/Users/andre/OneDrive/Documents/Taller_Investigativo/taller.txt)
* **Documento Word de Soporte:** [Taller_Investigativo_Andres_Pabon.docx](file:///C:/Users/andre/OneDrive/Documents/Taller_Investigativo/Taller_Investigativo_Andres_Pabon.docx)

---

## 🔍 Resumen del Taller Investigativo

La investigación aborda **20 temas clave** de optimización de sintaxis en Java, desde operadores tradicionales simplificados hasta estructuras y métodos de colección agregados en Java 8, 9, 10, 11 y 14. 

El objetivo principal es conocer cómo escribir un código más limpio, legible, y eficiente, reduciendo el código repetitivo (*boilerplate*) y aprovechando las características modernas del lenguaje.

### Tabla de Temas Investigados

| Nro. | Tema | Descripción Sintética | Introducido / Popularizado |
| :--- | :--- | :--- | :--- |
| **1** | [Operador Ternario (`?:`)](#1-operador-ternario) | Condicional abreviado para asignaciones rápidas. | Tradicional |
| **2** | [Asignación Compuesta (`+=`, `-=`, `*=`, `/=`, `%=`)](#2-operadores-de-asignación-compuesta) | Abreviación de operaciones matemáticas sobre sí mismo. | Tradicional |
| **3** | [Incremento y Decremento (`++`, `--`)](#3-operadores-de-incremento-y-decremento) | Operadores unarios de adición y sustracción unitaria. | Tradicional |
| **4** | [Ciclo for-each](#4-ciclo-for-each) | Iteración simplificada de arreglos y colecciones sin índices. | Java 5 |
| **5** | [Inferencia de Tipos con `var`](#5-inferencia-de-tipos-con-var) | Declaración de variables locales sin tipo explícito. | Java 10 |
| **6** | [Método `List.of()`](#6-método-listof) | Creación rápida de listas inmutables en una sola línea. | Java 9 |
| **7** | [Método `Map.of()`](#7-método-mapof) | Creación rápida de mapas inmutables llave-valor. | Java 9 |
| **8** | [Método `forEach()`](#8-método-foreach) | Recorrido de colecciones mediante Lambdas o Referencias. | Java 8 |
| **9** | [Operador Diamond (`<>`)](#9-operador-diamond) | Inferencia de tipos de datos en la instanciación de genéricos. | Java 7 |
| **10** | [Método `String.format()`](#10-método-stringformat) | Creación estructurada de cadenas mediante marcadores de formato. | Java 5 |
| **11** | [Método `removeIf()`](#11-método-removeif) | Eliminación condicional directa en colecciones usando predicados. | Java 8 |
| **12** | [Método `Set.of()`](#12-método-setof) | Creación rápida de conjuntos inmutables con elementos únicos. | Java 9 |
| **13** | [Clase `Optional`](#13-clase-optional) | Contenedor para representar valores opcionales y evitar NullPointer. | Java 8 |
| **14** | [Switch Expression](#14-switch-expression) | Evolución de `switch` que devuelve valores usando sintaxis de flecha. | Java 14 |
| **15** | [Referencias a Métodos (`::`)](#15-referencias-a-métodos) | Sintaxis ultra-compacta para llamar métodos con Lambdas. | Java 8 |
| **16** | [Método `String.join()`](#16-método-stringjoin) | Concatenación de cadenas de texto empleando un delimitador común. | Java 8 |
| **17** | [Método `String.repeat()`](#17-método-stringrepeat) | Duplicación repetitiva de una cadena en una sola instrucción. | Java 11 |
| **18** | [Método `Arrays.toString()`](#18-método-arraystostring) | Representación en texto amigable de arreglos de datos. | Tradicional |
| **19** | [Método `Arrays.sort()`](#19-método-arrayssort) | Ordenación óptima y automatizada de arreglos. | Tradicional |
| **20** | [Métodos `Math.max()` y `Math.min()`](#20-métodos-mathmax-y-mathmin) | Evaluación del valor máximo y mínimo entre dos números. | Tradicional |

---

## 📂 Archivos de Código Práctico (`.java`)

En este directorio se encuentran cinco archivos `.java` creados por el estudiante para ilustrar y probar los conceptos abordados en la investigación. 

Haga clic en los enlaces a continuación para ver o editar la implementación:

### 1. 🗃️ [EjemploArraysSort.java](file:///C:/Users/andre/OneDrive/Documents/Taller_Investigativo/EjemploArraysSort.java)
* **Temas demostrados:** 
  * **Tema 18:** `Arrays.toString()` para visualizar de forma amigable el contenido del arreglo de notas.
  * **Tema 19:** `Arrays.sort()` para ordenar el arreglo `double[] notas` de menor a mayor.
* **Propósito:** Mostrar cómo ordenar notas de un estudiante y extraer con facilidad la nota más baja (índice 0) y la nota más alta (índice `length - 1`).

### 2. 📜 [EjemploListOf.java](file:///C:/Users/andre/OneDrive/Documents/Taller_Investigativo/EjemploListOf.java)
* **Temas demostrados:**
  * **Tema 6:** `List.of()` para la instanciación inmutable de una lista de lenguajes de programación en una línea.
  * **Tema 4:** Ciclo `for-each` para recorrer e imprimir los lenguajes de la lista.
* **Propósito:** Simplificar la creación y recorrido de listas constantes (fijas), previniendo modificaciones no deseadas.

### 3. 🗺️ [EjemploMapOf.java](file:///C:/Users/andre/OneDrive/Documents/Taller_Investigativo/EjemploMapOf.java)
* **Temas demostrados:**
  * **Tema 7:** `Map.of()` para crear un mapa inmutable que relaciona Códigos (Integer) y Nombres (String) de estudiantes.
  * **Tema 4:** Recorrido con un ciclo `for-each` sobre el conjunto de entradas del mapa (`estudiantes.entrySet()`).
* **Propósito:** Ejemplificar cómo asociar claves y valores de manera compacta y listarlos rápidamente.

### 4. 🖨️ [EjemploStringFormat.java](file:///C:/Users/andre/OneDrive/Documents/Taller_Investigativo/EjemploStringFormat.java)
* **Temas demostrados:**
  * **Tema 10:** `String.format()` aplicado en bloques de texto (*Text Blocks* de Java 15+) utilizando marcadores `%s` (para texto) y `%d` (para números enteros).
* **Propósito:** Generar una ficha del estudiante estructurada y limpia sin recurrir a concatenaciones repetitivas con el operador `+`.

### 5. 🎛️ [EjemploSwitchExpression.java](file:///C:/Users/andre/OneDrive/Documents/Taller_Investigativo/EjemploSwitchExpression.java)
* **Temas demostrados:**
  * **Tema 14:** *Switch Expression* para procesar una opción ingresada desde consola y asignar un mensaje de estado en una variable en una única expresión, usando la sintaxis de flecha `->`.
* **Propósito:** Implementar la lógica de un menú de opciones bancarias (Saldo, Depósito, Retiro, Salir) de manera compacta, evitando el uso de la palabra clave `break` por cada opción y disminuyendo la probabilidad de errores.

---

## 📖 Detalle de los Temas del Taller

A continuación se realiza una síntesis explicativa de cada tema basada en la información del documento investigativo:

### 1. Operador Ternario
* **Sintaxis:** `condición ? valorSiVerdadero : valorSiFalso;`
* **Uso ideal:** Asignaciones y retornos sencillos de una sola línea. Evita bloques `if-else` repetitivos pero no se recomienda anidar para no complicar la legibilidad.

### 2. Operadores de Asignación Compuesta
* **Sintaxis:** `+=`, `-=`, `*=`, `/=`, `%=`
* **Uso ideal:** Abreviar operaciones sobre una misma variable. Ejemplo: `numero += 5;` en lugar de `numero = numero + 5;`. Común en contadores y acumuladores.

### 3. Operadores de Incremento y Decremento
* **Sintaxis:** `variable++` (Postincremento), `++variable` (Preincremento), `variable--`, `--variable`
* **Uso ideal:** Aumentar o disminuir variables enteras de una en una unidad. Esencial en ciclos indexados.

### 4. Ciclo for-each
* **Sintaxis:** `for (Tipo elemento : coleccion) { ... }`
* **Uso ideal:** Lectura de elementos de arreglos y colecciones. Más limpio que el `for` indexado, aunque no proporciona el índice actual del elemento de forma nativa.

### 5. Inferencia de Tipos con `var`
* **Sintaxis:** `var variable = valor;` (Introducido en Java 10)
* **Uso ideal:** Declarar variables locales cuando el tipo de dato se infiere claramente del lado derecho. No cambia el tipado estático (una vez definido no cambia de tipo). No aplica a atributos de clase.

### 6. Método `List.of()`
* **Sintaxis:** `List<Tipo> lista = List.of(elem1, elem2, ...);` (Desde Java 9)
* **Uso ideal:** Crear colecciones inmutables (de solo lectura). Modificar la lista arrojará `UnsupportedOperationException`.

### 7. Método `Map.of()`
* **Sintaxis:** `Map<Clave, Valor> mapa = Map.of(k1, v1, k2, v2, ...);` (Desde Java 9)
* **Uso ideal:** Inicializar mapas de solo lectura con hasta 10 pares clave-valor de forma instantánea.

### 8. Método `forEach()`
* **Sintaxis:** `coleccion.forEach(elemento -> accion);` (Desde Java 8)
* **Uso ideal:** Ejecutar una acción sobre cada elemento de una lista o conjunto mediante expresiones Lambda o referencias a métodos.

### 9. Operador Diamond
* **Sintaxis:** `List<String> lista = new ArrayList<>();` (Desde Java 7)
* **Uso ideal:** Evitar redundancias al instanciar colecciones con tipos genéricos. El compilador infiere los tipos del lado derecho basándose en la declaración izquierda.

### 10. Método `String.format()`
* **Sintaxis:** `String.format("Texto %s", variable);`
* **Uso ideal:** Generación de cadenas estructuradas con formato. Reemplaza concatenaciones confusas y permite dar formato a decimales, enteros y textos.

### 11. Método `removeIf()`
* **Sintaxis:** `coleccion.removeIf(elem -> condicion);` (Desde Java 8)
* **Uso ideal:** Eliminar elementos de colecciones mutables que cumplan una condición dada en un predicado Lambda.

### 12. Método `Set.of()`
* **Sintaxis:** `Set<Tipo> conjunto = Set.of(elem1, elem2);` (Desde Java 9)
* **Uso ideal:** Creación rápida de conjuntos inmutables. Arrojará error si se intentan declarar elementos duplicados en la firma.

### 13. Clase `Optional`
* **Sintaxis:** `Optional<Tipo> op = Optional.ofNullable(valor);` (Desde Java 8)
* **Uso ideal:** Evitar el retorno de referencias `null` y forzar un manejo seguro de la existencia de datos a través de métodos como `isPresent()`, `ifPresent()` u `orElse()`.

### 14. Switch Expression
* **Sintaxis:** `Tipo msg = switch(opcion) { case 1 -> "A"; default -> "B"; };` (Estable en Java 14)
* **Uso ideal:** Estructurar bifurcaciones múltiples que devuelven un resultado de forma limpia, segura y compacta. No requiere sentencias `break`.

### 15. Referencias a Métodos
* **Sintaxis:** `Clase::metodo` (Desde Java 8)
* **Uso ideal:** Abreviar aún más las expresiones Lambda que solo invocan a un método existente. Ejemplo: `System.out::println` en lugar de `x -> System.out.println(x)`.

### 16. Método `String.join()`
* **Sintaxis:** `String.join(", ", "Elemento A", "Elemento B");` (Desde Java 8)
* **Uso ideal:** Unir cadenas separadas por un delimitador común sin necesidad de escribir ciclos lógicos.

### 17. Método `String.repeat()`
* **Sintaxis:** `cadena.repeat(n);` (Desde Java 11)
* **Uso ideal:** Generar repeticiones de texto rápidamente (por ejemplo, separadores gráficos como `"=".repeat(50)`).

### 18. Método `Arrays.toString()`
* **Sintaxis:** `Arrays.toString(arreglo);`
* **Uso ideal:** Impresión directa de arreglos en formato de texto. Convierte un arreglo a una representación del estilo `[1, 2, 3]`.

### 19. Método `Arrays.sort()`
* **Sintaxis:** `Arrays.sort(arreglo);`
* **Uso ideal:** Ordenamiento rápido *in-place* de arreglos basándose en su orden natural o usando comparadores personalizados.

### 20. Métodos `Math.max()` y `Math.min()`
* **Sintaxis:** `Math.max(a, b);` / `Math.min(a, b);`
* **Uso ideal:** Determinar de forma unívoca el mayor o menor entre dos números sin recurrir a ramificaciones lógicas `if-else`.

---

## 📚 Referencias Bibliográficas

1. Oracle. (s. f.). *Java Documentation*. [https://docs.oracle.com/en/java/](https://docs.oracle.com/en/java/)
2. Oracle. (s. f.). *The Java(tm) Tutorials*. [https://docs.oracle.com/javase/tutorial/](https://docs.oracle.com/javase/tutorial/)
3. Oracle. (s. f.). *Java Platform, Standard Edition API Specification*. [https://docs.oracle.com/en/java/javase/](https://docs.oracle.com/en/java/javase/)
4. Baeldung. (s. f.). *Java Tutorials*. [https://www.baeldung.com/java-tutorial](https://www.baeldung.com/java-tutorial)
5. GeeksforGeeks. (s. f.). *Java Programming Language*. [https://www.geeksforgeeks.org/java/](https://www.geeksforgeeks.org/java/)
6. OpenJDK. (s. f.). *OpenJDK Documentation*. [https://openjdk.org/](https://openjdk.org/)
7. Bloch, J. (2018). *Effective Java* (3.ª ed.). Addison-Wesley Professional.
8. Sierra, K., & Bates, B. (2022). *Head First Java* (3.ª ed.). O'Reilly Media.
