public class PotenciasDeDois {
  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    for(int i = 0; i <= 10; i++) {
      System.out.println("Potencia de 2^" + i + " é igual a " + calc.exponencial(2, i));
    }
  }
}
