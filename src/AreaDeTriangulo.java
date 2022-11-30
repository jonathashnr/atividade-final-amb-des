public class AreaDeTriangulo {
    public static double calcular(double base, double altura) {
      Calculadora calc = new Calculadora();
      return calc.divisao(calc.multiplicacao(base, altura), 2);
    }
  }