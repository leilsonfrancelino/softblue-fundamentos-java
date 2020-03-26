import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Scanner lerString = new Scanner(System.in);
		
		int menu;
		String nome;
		int telefone;
		Contatos pessoa;
		
		do {
			exibirmenu();
			menu = ler.nextInt();
			
			switch (menu) {
			
			case 1: //adiciona
				System.out.println("Digite o nome:");
				nome = lerString.nextLine();
				System.out.println("Digite o telefone");
				telefone = ler.nextInt();
				
				pessoa = new Contatos(nome, telefone);
				Agenda.adicionar(pessoa);
				
				break;
            case 2: //lista
            	if (! (Agenda.getAgendaContatos().isEmpty())) {
            		System.out.println(Agenda.listar());
            	}else {
            		System.out.println("A agenda esta vazia.");
            	}
            	
				
				break;
            case 3: //pesquisar por nome
            	System.out.println("Digite o nome a ser procurado");
            	nome = lerString.nextLine();
            	System.out.println("Encontrado(s) \n"+Agenda.pesquisar(nome)+"\n");
            	
         	
	            break;
            case 4: //remover
            	System.out.println("Digite o nome a ser removido");
            	nome = lerString.nextLine();
            	if (! (Agenda.getAgendaContatos().isEmpty())) {
            		if (Agenda.remove(nome)) {
            			System.out.println("Contato removido com sucesso");
            		}else {
            			System.out.println("Contato não encontrado");
            		}
            	}else {	
            		System.out.println("A agenda esta vazia");
            		}
            	
	
	            break;
            case 5: //sair da aplicação
            	System.out.println("Você saiu da agenda.");
	
	            break;
	            
	            default:
	            	System.out.println("Opção inválida.");
			}
			
			
		} while (menu!=5);

	}
	
	static void exibirmenu () {
		System.out.println("=========Agenda de Contatos=========\n");
		System.out.println("==> Escolha uma das opções.");
		System.out.println("");
		System.out.println("1 - Cadastrar um contato");
		System.out.println("2 - Listar todos os contatos");
		System.out.println("3 - Pesquisar contato pelo nome");
		System.out.println("4 - Remover um contato");
		System.out.println("5 - Sair");
				
	}

}
