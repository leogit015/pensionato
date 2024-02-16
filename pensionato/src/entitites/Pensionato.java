package entitites;

public class Pensionato {
	
	private String aluno;
	private String email;
	private int quarto;
	
	
	public Pensionato(String aluno, String email, int quarto) {
		super();
		this.aluno = aluno;
		this.email = email;
		this.quarto = quarto;
	}


	public String getAluno() {
		return aluno;
	}


	public void setAluno(String aluno) {
		this.aluno = aluno;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getQuarto() {
		return quarto;
	}


	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	
	
	 public String toString() {
	        return "Aluno: " + aluno + ", Email: " + email + ", Quarto: " + quarto;
	    }

	
}
