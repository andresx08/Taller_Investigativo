import java.util.Arrays;

public class EjemploArraysSort {

    public static void main(String[] args) {

        double[] notas = {4.5, 3.2, 5.0, 2.8, 4.0};

        System.out.println("NOTAS DEL ESTUDIANTE");

        System.out.println("\nNotas antes de ordenar:");
        System.out.println(Arrays.toString(notas));

        // Ordenar las notas de menor a mayor
        Arrays.sort(notas);

        System.out.println("\nNotas después de ordenar:");
        System.out.println(Arrays.toString(notas));

        System.out.println("\nNota más baja: " + notas[0]);
        System.out.println("Nota más alta: " + notas[notas.length - 1]);

    }

}