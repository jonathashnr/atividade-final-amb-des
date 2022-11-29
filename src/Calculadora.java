import java.lang.Math;

public class Calculadora {
  //public double soma(double parcelaA, double parcelaB) {}
  //public double subtracao(double minuendo, double subtraendo) {}

  public double multiplicacao(double fatorA, double fatorB) {
    return fatorA*fatorB;
  }

  public double divisao(double dividendo, double divisor) {
    return dividendo/divisor; 
  }

  public double exponencial(double base, double expoente) {
    return Math.pow(base, expoente);
  }

  public double raizQuadrada(double radicando) {
    return Math.sqrt(radicando);
  }
  //public double piso(double num) {}
  //public double teto(double num) {}
}