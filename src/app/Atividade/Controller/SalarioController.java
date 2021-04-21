package app.Atividade.Controller;

import java.util.ArrayList;
import app.Atividade.Model.Funcionario;
import app.Atividade.Model.Salario;

public class SalarioController {

	public static void calcularSalarioLiquido() {

		double salarioLiquido = 0;
		double somaDescontos = 0;
		ArrayList<Funcionario> fList = new ArrayList<Funcionario>();

		Funcionario funcionario = new Funcionario(81, "Jonas Alberto Lekinihs", 32535.00);
		fList.add(funcionario);

		funcionario = new Funcionario(82, "Roseli Nunes", 1750.22);
		fList.add(funcionario);

		funcionario = new Funcionario(83, "Silvo Santos", 17321.55);
		fList.add(funcionario);

		funcionario = new Funcionario(84, "Maria da Gloria", 7322.00);
		fList.add(funcionario);

		funcionario = new Funcionario(85, "Roberto Robertinho", 2280.66);
		fList.add(funcionario);


		ArrayList<Salario> sList = new ArrayList<Salario>();

		Salario salario = new Salario(1,81,11.56);
		sList.add(salario);	

		salario = new Salario(2,81,54.22);
		sList.add(salario);	

		salario = new Salario(3,81,12.88);
		sList.add(salario);	

		salario = new Salario(4,81,59.54);
		sList.add(salario);	

		salario = new Salario(5,81,150.55);
		sList.add(salario);	

		salario = new Salario(6,81,56.63);
		sList.add(salario);	

		salario = new Salario(7,82,46.89);
		sList.add(salario);	

		salario = new Salario(8,82,455.53);
		sList.add(salario);	

		salario = new Salario(9,82,78.99);
		sList.add(salario);	

		salario = new Salario(10,82,78.67);
		sList.add(salario);	

		salario = new Salario(11,82,45.23);
		sList.add(salario);	

		salario = new Salario(12,83,937.29);
		sList.add(salario);	

		salario = new Salario(13,83,899.22);
		sList.add(salario);	

		salario = new Salario(14,83,789.67);
		sList.add(salario);	

		salario = new Salario(15,83,899.66);
		sList.add(salario);	

		salario = new Salario(16,84,860.57);
		sList.add(salario);	

		salario = new Salario(17,84,46.22);
		sList.add(salario);	

		salario = new Salario(18,84,68.88);
		sList.add(salario);	

		salario = new Salario(19,85,15.27);
		sList.add(salario);	

		salario = new Salario(20,85,88.55);
		sList.add(salario);	

		for (Funcionario funcionarios : fList) {

			for (Salario salarios : sList) {
				if(salarios.getId_funcionario() == funcionarios.getId_funcionario()) {
					somaDescontos += salarios.getVl_desconto();
				}
			}

			if(funcionarios.getId_funcionario() > funcionarios.getId_funcionario() - 1) {
				salarioLiquido = funcionarios.getVl_salario_bruto() - somaDescontos;
				System.out.printf(funcionarios.getNm_cliente() + " R$ %.2f %n", salarioLiquido);
				somaDescontos = 0;
			}
		}
	}	

}
