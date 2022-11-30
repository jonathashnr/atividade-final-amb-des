public class Retangulo {
    private double ladoA;
    private double ladoB;

    Retangulo(double a, double b) {
        this.ladoA = a;
        this.ladoB = b;
    }

    public void setladoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public double getladoA() {
        return this.ladoA;
    }
    public void setladoB(double ladoB) {
        this.ladoB = ladoB;
    }
    public double getladoB() {
        return this.ladoB;
    }

    public double getArea() {
        Calculadora calc = new Calculadora();
        double area = calc.multiplicacao(this.ladoB, this.ladoA);
        return area;
    }

}
