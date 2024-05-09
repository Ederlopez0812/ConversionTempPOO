import java.util.Scanner;

class MainConversorDolares {

    public static void main(String[] args) {
        Scanner ps = new Scanner(System.in);
        double pesos;

        System.out.print("INGRESE LA CANTIDAD EN PESOS QUE DESEA CONVERTIR A DOLARES: ");
        pesos = ps.nextDouble();

        ConversorDolares conversion = new ConversorDolares();
        conversion.setPesos(pesos);
        conversion.setDolar(16.96);
        System.out.println(pesos + "  Pesos son  " + String.format("%.2f", conversion.mostrarConversion()) + "  Dolares");

    }

}