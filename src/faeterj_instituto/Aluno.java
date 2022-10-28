package faeterj_instituto;

public class Aluno extends Pessoa{

	private String matricula;
	public String semestreIn;
	private int cr;
	private int quantMat;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSemestreIn() {
		return semestreIn;
	}
	public void setSemestreIn(String semestreIn) {
		this.semestreIn = semestreIn;
	}
	public int getCr() {
		return cr;
	}
	public void setCr(int cr) {
		this.cr = cr;
	}
	public int getQuantMat() {
		return quantMat;
	}
	public void setQuantMat(int quantMat) {
		this.quantMat = quantMat;
	}
	
	public Aluno(String nome, String cpf, String birthDate, String matricula, String semestreIn, int cr, int quantMat) {
		super(nome, cpf, birthDate);
		this.matricula = matricula;
		this.semestreIn = semestreIn;
		this.cr = cr;
		this.quantMat = quantMat;
	}

	
	
}
