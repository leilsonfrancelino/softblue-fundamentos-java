import java.util.ArrayList;

public class Agenda {
	
	private static ArrayList<Contatos> agendaContatos = new ArrayList<>();

	
	public static ArrayList<Contatos> getAgendaContatos() {
		return agendaContatos;
	}

	public static void setAgendaContatos(ArrayList<Contatos> agendaContatos) {
		Agenda.agendaContatos = agendaContatos;
	}

	//adicionar
	static public void adicionar (Contatos c) {
		agendaContatos.add(c);
	}
	
	//listar
	static public String listar () {
		String lista = "";
		int i = 1;
		for (Contatos c : agendaContatos) {
			lista += "\n=========Contato "+(i++)+"=========\n";
			lista += c.imprimir()+ "\n";
		}
		return lista;
	}
	
	//pesquisa por nome
	static public String pesquisar (String nome) {
		String encontrados = "";
		for (Contatos c : agendaContatos) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				encontrados += c.imprimir()+"\n";
		}
			//método de iteração usando for comum
//		for (int i = 0; i < agendaContatos.size(); i++) {
//			if (agendaContatos.get(i).getNome().equalsIgnoreCase(nome)) {
//				encontrados += agendaContatos.get(i).imprimir()+"\n";
//			}
		}
		return encontrados;
	}
	
	//remover
	static public boolean remove (String nome) {
		for (Contatos c : agendaContatos) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				agendaContatos.remove(c);
				return true;
			}
		}
		return false;
	}
	
}
