package faeterj_instituto;

public class Empregados extends Funcionarios{

	private String idCadastro;
	private String escolaridade;
	private String funcao;
	public String getIdCadastro() {
		return idCadastro;
	}
	public void setIdCadastro(String idCadastro) {
		this.idCadastro = idCadastro;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public Empregados(String nome, String cpf, String birthDate, float salario, int horasSemanais, String idCadastro,
			String escolaridade, String funcao) {
		super(nome, cpf, birthDate, salario, horasSemanais);
		this.idCadastro = idCadastro;
		this.escolaridade = escolaridade;
		this.funcao = funcao;
	}
	
	
}
