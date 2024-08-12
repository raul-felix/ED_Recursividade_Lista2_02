package controller;

public class DivisaoController {
	
	public DivisaoController() {
		super();
	}
	
	public int restoDivisaoPorSubtracao(int dividendo, int divisor) {
		if (divisor == 0) {
			System.out.println("N�o � poss�vel dividir por 0");
			return -1;
		} else if (dividendo < divisor) {
			return dividendo;
		} else {
			return restoDivisaoPorSubtracao(dividendo - divisor, divisor);
		}
	}
}
