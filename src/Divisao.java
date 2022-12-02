public class Divisao {
	public double calcular(double valor1, double valor2) {
		if (valor2 == 0) {
			throw new ArithmeticException("Divisão por zero!");
		}
		Calculadora calc = new Calculadora();
		return calc.divisao(valor1, valor2);
	}
}