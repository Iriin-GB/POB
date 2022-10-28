package faeterj_instituto;

public class Professor extends Funcionarios{
private String matricula;
private String crc;
private String nivelFormac;
private int numTurmas;

public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public String getCrc() {
	return crc;
}
public void setCrc(String crc) {
	this.crc = crc;
}
public String getNivelFormac() {
	return nivelFormac;
}
public void setNivelFormac(String nivelFormac) {
	this.nivelFormac = nivelFormac;
}
public int getNumTurmas() {
	return numTurmas;
}
public void setNumTurmas(int numTurmas) {
	this.numTurmas = numTurmas;
}
public Professor(String nome, String cpf, String birthDate, float salario, int horasSemanais, String matricula,
		String crc, String nivelFormac, int numTurmas) {
	super(nome, cpf, birthDate, salario, horasSemanais);
	this.matricula = matricula;
	this.crc = crc;
	this.nivelFormac = nivelFormac;
	this.numTurmas = numTurmas;
}



}
