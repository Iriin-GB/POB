package faeterj_instituto;

public class Pessoa {

public String nome;
private String cpf;
private String birthDate;


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getCpf() {
	return cpf;
}


public void setCpf(String cpf) {
	this.cpf = cpf;
}


public String getBirthDate() {
	return birthDate;
}


public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
}


public Pessoa(String nome, String cpf, String birthDate) {
	super();
	this.nome = nome;
	this.cpf = cpf;
	this.birthDate = birthDate;
}




}
