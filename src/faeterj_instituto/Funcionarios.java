package faeterj_instituto;

public class Funcionarios extends Pessoa{
	private float salario;
	private int horasSemanais;
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getHorasSemanais() {
		return horasSemanais;
	}
	public void setHorasSemanais(int horasSemanais) {
		this.horasSemanais = horasSemanais;
	}
	public Funcionarios(String nome, String cpf, String birthDate, float salario, int horasSemanais) {
		super(nome, cpf, birthDate);
		this.salario = salario;
		this.horasSemanais = horasSemanais;
	}
	
	
	
}