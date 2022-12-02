public class Soma{
	float numero1;
	float numero2;
	Soma(float numero1, float numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	public void resultado() {
		Calculadora calc = new Calculadora();
		double resultado = calc.soma(numero1, numero2);
		System.out.println ("Resultado da soma eh de "+ resultado);
	}
}