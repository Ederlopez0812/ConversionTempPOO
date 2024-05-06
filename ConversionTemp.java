
public class ConversionTemp {
    double celsius;

    public ConversionTemp(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double convertiraFarenheit() {
        return celsius * 9 / 5 + 32;
    }

}