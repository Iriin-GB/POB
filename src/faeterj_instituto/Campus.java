package faeterj_instituto;
public class Campus {
	public String Nome;
	private String Id;
	private int aluno;
	private int empregados;
	private int funcionarios;
	private int materias;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public int getAluno() {
		return aluno;
	}
	public void setAluno(int aluno) {
		this.aluno = aluno;
	}
	public int getEmpregados() {
		return empregados;
	}
	public void setEmpregados(int empregados) {
		this.empregados = empregados;
	}
	public int getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}
	public int getMaterias() {
		return materias;
	}
	public void setMaterias(int materias) {
		this.materias = materias;
	}
	
	
}
