import java.util.Scanner;

public class EjemploSwitchExpression {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("MENÚ DE OPCIONES");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Realizar depósito");
        System.out.println("3. Realizar retiro");
        System.out.println("4. Salir");

        System.out.print("\nSeleccione una opción: ");
        int opcion = teclado.nextInt();

        String mensaje = switch (opcion) {

            case 1 -> "Su saldo actual es de $850.000";
            case 2 -> "Depósito realizado correctamente.";
            case 3 -> "Retiro realizado correctamente.";
            case 4 -> "Gracias por utilizar el sistema.";
            default -> "Opción no válida.";

        };

        System.out.println("\n" + mensaje);

       

    }

}
