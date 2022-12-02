import java.lang.Math;

public class Calculadora {
  public double soma(double parcelaA, double parcelaB) {
    return parcelaA + parcelaB;
  }

  public double subtracao(double minuendo, double subtraendo) {
    return minuendo - subtraendo;
  }

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
}