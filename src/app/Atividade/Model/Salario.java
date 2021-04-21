package app.Atividade.Model;

public class Salario {

	int id_funcionario;
	int id_desconto;
	double vl_desconto;

	public Salario(int id_desconto,int id_funcionario, double vl_desconto) {
		super();
		this.id_desconto = id_desconto;
		this.id_funcionario = id_funcionario;
		this.vl_desconto = vl_desconto;
	}

	public int getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	public int getId_desconto() {
		return id_desconto;
	}
	public void setId_desconto(int id_desconto) {
		this.id_desconto = id_desconto;
	}
	public double getVl_desconto() {
		return vl_desconto;
	}
	public void setVl_desconto(double vl_desconto) {
		this.vl_desconto = vl_desconto;
	}

}
