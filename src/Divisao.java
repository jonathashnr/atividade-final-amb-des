Public class divisao {
	public double calcular(double valor1, double valor2) {

	if(valor2 == 0) {
		throw new ArithmeticException{"Divis�o por zero!"};
	}
	return valor1 / valor2;
	}
}