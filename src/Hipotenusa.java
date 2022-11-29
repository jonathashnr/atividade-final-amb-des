public class Hipotenusa {
  public static double calcula(double catetoA, double catetoB) {
    Calculadora calc = new Calculadora();
    return calc.raizQuadrada(calc.exponencial(catetoA, 2) + calc.exponencial(catetoB, 2));
  }
}