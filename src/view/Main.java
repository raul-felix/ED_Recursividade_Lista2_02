package view;

import controller.DivisaoController;

public class Main {
	
	public static void main(String[] args) {
		
		DivisaoController divController = new DivisaoController();
		
		int dividendo = 15;
		int divisor = 4;
		
		int resultado = divController.restoDivisaoPorSubtracao(dividendo, divisor);
		
		if (resultado != -1) {
			System.out.println(String.format("O resto da divis�o de %d por %d �: %d", dividendo, divisor, resultado));
		}
	}
}
