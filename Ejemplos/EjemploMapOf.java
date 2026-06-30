import java.util.Map;

public class EjemploMapOf {

    public static void main(String[] args) {

        Map<Integer, String> estudiantes = Map.of(
                101, "Andrés",
                102, "Laura",
                103, "Carlos",
                104, "María",
                105, "Juan"
        );

        System.out.println("LISTA DE ESTUDIANTES\n");

        
        for (Map.Entry<Integer, String> estudiante : estudiantes.entrySet()) {

            System.out.println("Código: " + estudiante.getKey()+ " | Nombre: " + estudiante.getValue());

        }

    }

}