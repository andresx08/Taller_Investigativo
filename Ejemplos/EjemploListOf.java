import java.util.List;

public class EjemploListOf {

    public static void main(String[] args) {

        List<String> lenguajes = List.of(
                "Java",
                "Python",
                "C#",
                "JavaScript",
                "PHP"
        );

        System.out.println("Lenguajes de programación");

        for (String lenguaje : lenguajes) {
            System.out.println("- " + lenguaje);
        }



    }
}
