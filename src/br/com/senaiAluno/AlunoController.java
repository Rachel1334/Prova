package br.com.senaiAluno;

import java.util.List;
import java.util.Scanner;
import br.com.senaiAluno.Aluno;
import br.com.senaiEndereço.Endereço;

public class AlunoController extends Endereço {

	private static final List<Aluno> alunos = null;
	private static Scanner tec;
		
	public AlunoController() {
		tec = new Scanner(System.in);
		}
	public static int leopcao() {
		System.out.println("> ");
		return tec.nextInt();
		}
	public static Aluno cadastrarAluno() {
		Aluno aluno = new Aluno();
			
		System.out.println("--- Cadastrar Aluno--- ");
		System.out.print("Informe o nome: ");
		tec.nextLine();
		aluno.setNomeAluno(tec.nextLine());
				
		System.out.print("Informe o ano de Nascimento: ");
		aluno.setAnoDeNascimento(tec.nextInt());
		
		System.out.println("--Informe o Endereço--");
			
		System.out.print("Informe a Cidade: ");
		tec.nextLine();
		aluno.setCidade(tec.nextLine());
			
		System.out.print("Informe o Estado: ");
		aluno.setEstado(tec.nextLine());
			
		System.out.print("Informe o Pais: ");
		aluno.setPais(tec.nextLine());
		
		System.out.println("Informe o curso: ");
		aluno.setCurso(tec.nextLine());;
			
		return aluno;
		}
		
		public  List<Aluno> listarAluno(List<Aluno> alunos){
				
			if(alunos.size() <= 0) {
					  
			System.out.println("Não possui Alunos para listar.");
			System.out.println("Impossivel Edição e/ou Exclusão.");
			
				return null;
				}
				
			System.out.printf(" %2s | %15s | %5s | %10s | %10s | %10s | %10s \n", 
						"Id","Nome", "idade", "Cidade", "Estado" , "País","Curso" );
				
			for(int i = 0; i<alunos.size(); i++) {
				System.out.printf(" %2s | %15s | %5d | %10s | %10s | %10s | %10S \n ", 
				i + 1,
				alunos.get(i).getNomeAluno(),
				alunos.get(i).getIdadeAluno(),
				alunos.get(i).getCidade(),
				alunos.get(i).getEstado(),
				alunos.get(i).getPais(),
				alunos.get(i).getCurso());	
			}	
			return alunos;
		}
			public static List <Aluno> editarAluno(List<Aluno> alunos) {
				Aluno aluno = new Aluno();
		   	if(alunos.isEmpty()) {
		   	}
		   	System.out.println("Informe o Id da produto para editar: ");
			  int idAluno = tec.nextInt() - 1;
			   	
			System.out.println("1) Nome do Aluno");
		   	System.out.println("2) Idade");
		   	System.out.println("3) Cidade");
		   	System.out.println("5) Estado");
		   	System.out.println("4) Pais");
		   	System.out.println("5) Curso");
		   	System.out.println("Informe o campo para ser editado:" );
		   	int opcao = tec.nextInt();
		   		
			switch(opcao) {
	   		case 1: 
	   			System.out.println("--- Editar nome da Pessoa ---");
	   			System.out.println("Informe o novo nome da Pessoa: ");
	   			aluno.setNomeAluno(null);
	
				aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
				aluno.setAnoDeNascimento(alunos.get(idAluno).getIdadeAluno());
				aluno.setCidade(alunos.get(idAluno).getCidade());
				aluno.setEstado(alunos.get(idAluno).getEstado());
				aluno.setPais(alunos.get(idAluno).getPais());
				
				alunos.set(idAluno, aluno);
				break;
				
			case 2:
				System.out.println("--- Editar Ano de Nascimento ---");
				System.out.println("Informe o novo ano de nascimento: ");
				aluno.setAnoDeNascimento(tec.nextInt());
					
				aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
				aluno.setAnoDeNascimento(alunos.get(idAluno).getIdadeAluno());
				aluno.setCidade(alunos.get(idAluno).getCidade());
				aluno.setEstado(alunos.get(idAluno).getEstado());
				aluno.setPais(alunos.get(idAluno).getPais());
				
						
				alunos.set(idAluno, aluno);
				break;
					
			case 3:
				System.out.println("--- Editar a Cidade ---");
				System.out.println("Informe a nova altura: ");
				aluno.setCidade(tec.next());
					
				aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
				aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
				aluno.setAnoDeNascimento(alunos.get(idAluno).getIdadeAluno());
				aluno.setEstado(alunos.get(idAluno).getEstado());
				aluno.setPais(alunos.get(idAluno).getPais());
				
			    break;
			    
			case 4 :
				System.out.println("Editar o Estado");
				System.out.println("Informe novo Estado");
				aluno.setEstado(tec.next());
				
				aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
				aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
				aluno.setAnoDeNascimento(alunos.get(idAluno).getIdadeAluno());
				aluno.setCidade(alunos.get(idAluno).getCidade());
				aluno.setPais(alunos.get(idAluno).getPais());
				
				break;
				
			case 5:
				System.out.println("Editar o  Pais");
				System.out.println("Informe o novo país: ");
				aluno.setPais(tec.next());
					
				aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
				aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
				aluno.setAnoDeNascimento(alunos.get(idAluno).getIdadeAluno());
				aluno.setCidade(alunos.get(idAluno).getCidade());
				aluno.setEstado(alunos.get(idAluno).getEstado());

				break;
					
			case 6:
				System.out.println("Editar o Curso");
				System.out.println("Informe novo Curso: ");
				aluno.setCurso(tec.next());
				
				aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
				aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
				aluno.setAnoDeNascimento(alunos.get(idAluno).getIdadeAluno());
				aluno.setCidade(alunos.get(idAluno).getCidade());
				aluno.setEstado(alunos.get(idAluno).getEstado());
				aluno.setPais(alunos.get(idAluno).getPais());

			default:	
				System.out.println("opção inválida!");
				break;
			}
	
			return alunos;	
}
	        public void excluirAluno(List<Aluno>alunos) {
	 			listarAluno(alunos);
	 			
	 			if(alunos.isEmpty()) {
	   			
	   			return;
	 		}
	 		System.out.println("-----Excluir Aluno-----");
		
	 		System.out.println("Informe o Id de Aluno para excluir:");
		    int idAluno = tec.nextInt() - 1;
		
		   if(alunos.size() <= idAluno) {
			System.out.println("Aluno não cadastrado.");
			return;
		}
		alunos.remove(idAluno);
	        }
	 	public void menu(List<Aluno> alunos) {
	 	System.out.println("----MENU----");
		System.out.println("1)Cadastrar Aluno");	
		System.out.println("2)Listar Alunos cadastrados");
		System.out.println("3)Editar Aluno");
		System.out.println("4)Excluir Aluno");
		System.out.println("Informe a opção desejada: ");
		int opcao = tec.nextInt();
		switch (opcao) {

				case 1:
					alunos.add(cadastrarAluno());
					break;
				case 2:
					listarAluno(alunos);
					break;
				case 3:
					editarAluno(alunos);
					break;
				case 4:
					excluirAluno(alunos);
					break;
				default:
					System.out.println("Opção ivalida");
					break;
				}
			
			System.out.println("Sistema finalizado!!");
		
		}

	  }
	 
