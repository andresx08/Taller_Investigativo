public class EjemploStringFormat {

    public static void main(String[] args) {

        String nombre = "Andrés Pabón";
        int ficha = 3407799;
        String programa = "Análisis y Desarrollo de Software";

        String Info = String.format(
                """
                FICHA DEL ESTUDIANTE
                Nombre    : %s
                Ficha     : %d
                Programa  : %s
                """,
                nombre,
                ficha,
                programa
        );

        System.out.println(Info);

    }
}
