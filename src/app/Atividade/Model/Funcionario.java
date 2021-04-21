package app.Atividade.Model;


public class Funcionario {
	
	int id_funcionario;
	String nm_cliente;
	double vl_salario_bruto;

	public Funcionario(int id_funcionario, String nm_cliente, double vl_salario_bruto) {
		super();
		this.id_funcionario = id_funcionario;
		this.nm_cliente = nm_cliente;
		this.vl_salario_bruto = vl_salario_bruto;
	}
	

	public int getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	public String getNm_cliente() {
		return nm_cliente;
	}
	public void setNm_cliente(String nm_cliente) {
		this.nm_cliente = nm_cliente;
	}
	public double getVl_salario_bruto() {
		return vl_salario_bruto;
	}
	public void setVl_salario_bruto(double vl_salario_bruto) {
		this.vl_salario_bruto = vl_salario_bruto;
	}

}
