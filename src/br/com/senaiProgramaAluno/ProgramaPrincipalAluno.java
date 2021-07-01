package br.com.senaiProgramaAluno;

	import java.util.ArrayList;
	import java.util.List;

import br.com.senaiAluno.Aluno;
import br.com.senaiAluno.AlunoController;
import br.com.senaiCurso.Curso;
import br.com.senaiCurso.CursoController;
	
public class ProgramaPrincipalAluno {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();
		List<Curso> cursos = new ArrayList<>();
		
		AlunoController alunoController = new AlunoController();
		CursoController cursoController = new CursoController();
		
		boolean sair = false;
	
		do {
				
	System.out.println("-----MENU PRINCIPAL-----");
			System.out.println("1)--Cadastrar Aluno--");
			System.out.println("2)--Curso--");
			System.out.println("3)--Sair do Sistema--");
					
			int opcao = AlunoController.leopcao();
			switch(opcao) {
				case 1:
					alunoController.menu(alunos);
					break;
					
				case 2:
					cursoController.menu2(cursos);
					
				default:
					System.out.println("Opção invalida! ");
					break;
			}
			
			}while(!sair);
		
		System.out.println("Sistema finalizado!");
	
	}	
}
