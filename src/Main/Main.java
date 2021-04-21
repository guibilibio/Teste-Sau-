package Main;

import app.Atividade.Controller.SalarioController;

public class Main {

	public static void main(String[] args) {
		// 1
		System.out.println(parseHexInt("F"));     
		// 2
		SomaLista();
		
		// 3
		SalarioController slController = new SalarioController();
		SalarioController.calcularSalarioLiquido();
		
	}

	public static int parseHexInt(String valor){

		int resultado = 0;

		for (int i = valor.length() - 1; i >= 0; i--){
			int valor2 = valor.charAt(i);

			if(valor.equals("A")) {
				return 10;
			}
			if(valor.equals("B")) {
				return 11;
			}

			if(valor.equals("C")) {
				return 12;
			}

			if(valor.equals("D")) {
				return 13;
			}
			if(valor.equals("E")) {
				return 14;
			}

			if(valor.equals("F")) {
				return 15;
			}

			if (valor2 < 48 || valor2 > 57) {
				return 0;
			}

			valor2 -= 48;

			for (int j = 1; j < (valor.length() - i); j++) {
				valor2 = valor2 * 10;
			}
			resultado = resultado + valor2;
		}

		if(resultado == 1) {
			return 1;
		}

		if(resultado == 2) {
			return 2;
		}

		if(resultado == 3) {
			return 3;
		}

		if(resultado == 4) {
			return 4;
		}
		if(resultado == 5) {
			return 5;
		}

		if(resultado == 6) {
			return 6;
		}
		if(resultado == 7) {
			return 7;
		}

		if(resultado == 8) {
			return 8;
		}
		if(resultado == 9) {
			return 9;
		}


		return resultado;
	}

	public static void SomaLista(){

		int[] valores = {178,100,128,99,51,10,66,4545,88,3,11,12,56,77};
		int i = 0;
		int maior=0;
		int maior2=0;

		while (i <= valores[i]) {
			if(valores[i] > maior) {
				maior2=maior;
				maior = valores[i];
			}else if(valores[i] > maior2) {
				maior2 = valores[i];
			}
			i++;
		}
		System.out.println("A soma dos dois maiores números é: " + maior + " + " + maior2 + " = " + (maior+maior2));
	}
	
	
}

