import java.util.Scanner;
public class MainGasolinera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de galones para surtir: ");
        double cantGal = sc.nextDouble();
        System.out.println("Ingrese el costo por litro: ");
        double costLit = sc.nextDouble();

        Gasolinera gasolinera = new Gasolinera();
        gasolinera.setGalones(cantGal); // 10 galones surtidos
        gasolinera.setPrecioPorLitro(costLit); // $1.5 por litro

        System.out.println(gasolinera.toString());
    }
}