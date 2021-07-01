package br.com.senaiCurso;

import java.util.List;
import java.util.Scanner;

import br.com.senaiCurso.Curso;
import br.com.senaiAluno.AlunoController;

public class CursoController {
	private AlunoController AlunoController;
	private static final List<Curso> cursos = null;
	private static Scanner tec;
		
	public CursoController() {
		tec = new Scanner(System.in);
		}
	public static int leopcao() {
		System.out.println("> ");
		return tec.nextInt();
		}
		
	public static Curso cadastrarCurso() {
		Curso curso = new Curso();
			
		System.out.println("--- Cadastrar Curso--- ");
		System.out.print("Informe o nome: ");
		tec.nextLine();
		curso.setNomeCurso(tec.nextLine());
				
		return curso;
		}
		
		public static List<Curso> listarCurso(List<Curso> cursos){
				
			if(cursos.isEmpty()) {
					  
			System.out.println("Não possui dados para listar.");
				return null;
				}
				
			System.out.printf(" %2s | %20s\n", 
						"Id","Nome", "idade", "Endereço", "Curso" );
				
			for(int i = 0; i<cursos.size(); i++) {
				System.out.printf(" %2d | %20s \n ", 
				i + 1,
				cursos.get(i).getNomeCurso());	
			}	
			return cursos;
			}
			public static List <Curso> editarCurso(List<Curso> cursos) {
				Curso curso = new Curso();
		   	if(cursos.isEmpty()) {
		   	}
		   	System.out.println("Informe o Id do curso para editar: ");
			  int idCurso = tec.nextInt() - 1;
			   	
			System.out.println("1) Nome do Curso");
		   	System.out.println("Informe o campo para ser editado:" );
		   	int opcao = tec.nextInt();
		   		
			switch(opcao) {
	   		case 1: 
	   			System.out.println("--- Editar nome do curso ---");
	   			System.out.println("Informe o novo nome do curso: ");
	   			curso.setNomeCurso(null);
	   			
				cursos.set(idCurso, curso);
				break;
	
			default:
					
				System.out.println("opção inválida!");
				break;
			}
	
			return cursos;	
			}
	        public void excluirCurso(List<Curso>cursos) {
	 			listarCurso(cursos);
	 		 int idCurso = tec.nextInt() - 1;
	 			 
	 		if(cursos.isEmpty()) {
	   			
	   			return;
	 		}
	 		System.out.println("-----Excluir Curso-----");
		
	 		System.out.println("Informe o Id d o Curso para excluir:");
		    int idAluno = tec.nextInt() - 1;
		
		   if(cursos.size() <= idCurso) {
			System.out.println("Curso não cadastrado.");
			return;
		   }
		cursos.remove(idAluno);
		
	        }

	 	public void menu2(List<Curso> cursos) {
	 	System.out.println("----MENU----");
		System.out.println("1)Cadastrar Curso");	
		System.out.println("2)Listar Cursos cadastrados");
		System.out.println("3)Editar Curso");
		System.out.println("4)Excluir Curso");
		

		System.out.println("Informe a opção desejada: ");
		int opcao = tec.nextInt();
		switch (opcao) {

				case 1:
					cursos.add(cadastrarCurso());
					break;
				case 2:
					listarCurso(cursos);
					break;
				case 3:
					editarCurso(cursos);
					break;
				case 4:
					excluirCurso(cursos);
					break;
				default:
					System.out.println("Opção ivalida");
					break;
				}
			
			System.out.println("Sistema finalizado!!");
	 	}
	}

	  
	 

	
	