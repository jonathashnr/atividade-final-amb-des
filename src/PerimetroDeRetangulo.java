public class PerimetroDeRetangulo {

    public static double calculaPerimetro(double ladoA, double ladoB) {
        Calculadora calc = new Calculadora();
        double ladoA2 = calc.multiplicacao(ladoA, 2);
        double ladoB2 = calc.multiplicacao(ladoB, 2);
        return calc.soma(ladoA2, ladoB2); // Esse é o perímetro
    }
}