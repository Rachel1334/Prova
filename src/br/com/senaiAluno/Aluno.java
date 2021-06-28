package br.com.senaiAluno;

import java.util.Calendar;

public class Aluno {
	//Aluno com os seguintes atributos: 
			private String nomeAluno;
			private int anoDeNascimento;
			private int idadeAluno;
			private String curso;
		
			public String getNomeAluno() {
				return nomeAluno;
			}
			public void setNomeAluno(String nomeAluno) {
				this.nomeAluno = nomeAluno;
			}
			public int getAnoDeNascimento() {
				return anoDeNascimento;
			}
			public void setAnoDeNascimento(int anoDeNascimento) {
				this.anoDeNascimento = anoDeNascimento;
			}
			public int getIdade() {
				return idadeAluno;
			}
			private void setIdade() {
				Calendar calendar = Calendar.getInstance();
				
				this.idadeAluno = calendar.get(Calendar.YEAR) - getAnoDeNascimento(); 
				
			}
			public String getCurso() {
				return curso;
			}
			public void setCurso(String curso) {
				this.curso = curso;
			}
		
			
			
}
