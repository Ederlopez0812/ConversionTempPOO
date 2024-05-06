import java.util.Scanner;

public class MainConversionTemp {
    public static void main(String[] args) {
        Scanner t1 = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en grados celsius");
        double temperaturaCelsius = t1.nextDouble();
        ConversionTemp conversor = new ConversionTemp(temperaturaCelsius);
        double temperaturaFarenheit = conversor.convertiraFarenheit();
        System.out.println(temperaturaCelsius+ "grados Celsius es igual a :" + temperaturaFarenheit + "grados Farenheit");
    }
}