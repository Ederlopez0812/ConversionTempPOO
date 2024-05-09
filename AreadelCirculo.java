
class AreadelCirculo {
    private double area;
    private final static double pi = 3.1416;

    public AreadelCirculo() {

    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double mostrarResultado() {
        return pi * Math.pow(this.area, 2);

    }

    @Override
    public String toString() {
        return "AreadelCirculo [area=" + area + ", pi=" + pi + "]";
    }

}