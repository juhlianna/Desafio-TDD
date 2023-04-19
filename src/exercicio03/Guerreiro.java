package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Guerreiro {

	private static List<String> habilidadeList = new ArrayList<String>();

	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidades) {
		super();
	}

	public static String aprenderHabilidade(String novaHabilidade) {
		habilidadeList.add(novaHabilidade);
		System.out.println("Magia " + novaHabilidade + "adicionada com sucesso!");
		return getHabilidadeList().get(habilidadeList.size()-1);
		
				
	}

	public static List<String> getHabilidadeList() {		
		return getHabilidadeList();
		
	}
	
	public void sethabilidadeList(List<String> habilidadeList) {
		Guerreiro.habilidadeList = habilidadeList;
	}
	

}
