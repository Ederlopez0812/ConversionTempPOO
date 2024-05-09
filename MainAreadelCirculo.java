import java.util.Scanner;

class MainAreadelCirculo {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int a;
        do {
            System.out.println("ESCOGE UNA OPCION");
            System.out.println("1: AREA DEL CIRCULO");
            System.out.println("0: SALIR");
            a = op.nextInt();
            if (a == 1) {
                double area;
                System.out.println("ingresa el radio del circulo en cm: ");
                area = op.nextDouble();
                AreadelCirculo circulo = new AreadelCirculo();
                circulo.setArea(area);
                System.out.println("El area del circulo es: " + String.format("%.2f",circulo.mostrarResultado())+"cm");
            }
        } while (a > 0);
    }
}