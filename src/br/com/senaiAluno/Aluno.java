package br.com.senaiAluno;

import java.util.Calendar;

import br.com.senaiEndereço.Endereço;

public class Aluno extends Endereço {
	//Aluno com os seguintes atributos: 
	private String nomeAluno;
	private int anoDeNascimento;
	private int idadeAluno;
	private String curso;
		
		public int getIdadeAluno() {
			return idadeAluno;
		}
		public void setIdadeAluno(){
			Calendar calendar = Calendar.getInstance();
			this.idadeAluno =  calendar.get(Calendar.YEAR) - getAnoDeNascimento();
		}
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
		
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		
			
			
}
