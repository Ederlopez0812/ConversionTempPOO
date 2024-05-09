import java.util.Scanner;

public class MainSegundosdeldia {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer la cantidad de días
        System.out.print("Ingrese la cantidad de días: ");
        int dias = scanner.nextInt();

        // Crear objeto SecondsByDay
        Segundosdeldia secondsByDay = new Segundosdeldia(dias);

        // Imprimir la cantidad de segundos
        System.out.println(secondsByDay.toString());
    }
}