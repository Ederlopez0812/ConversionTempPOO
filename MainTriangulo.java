import java.util.Scanner;
public class MainTriangulo{
    public static void main(String[]args){
        // objeto Scanner
        Scanner obj = new Scanner(System.in);
        int a;
        //inicio de la sentencia de control
        do {
            System.out.println("Elija una opcion");
            System.out.println("1. Area del triangulo");
            System.out.println("0. Salir ");
            a = obj.nextInt();
            // la condicon que debera ser cumplida, para que se ejecute el programa
            if (a==1){
                System.out.println("Ingresa la base:");
                int base=obj.nextInt();
                System.out.println("Ingresa la altura:");
                int altura=obj.nextInt();
                // creacion de objeto para referenciar las variables encapsuladas
                Triangulo figura = new Triangulo();
                figura.setBase(base);
                figura.setAltura(altura);
                // impresion de los datos obtenidos
                System.out.println(figura.toString());
                System.out.println(("El area es: "+ figura.mostrarAreaTriangulo()) + " cm2");
            }
            // cierre de la sentencia de control
        } while (a > 0);
    }
}