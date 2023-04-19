package exercicio03;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
	
	List<String> magias = new ArrayList<>();
	List<String> habilidades = new ArrayList<>();
	
	@BeforeEach
	public void setup() throws Exception{
		
	}
	@Test
	void deveAdicionarPersonagemAoGame() throws Exception {
		new Game ();
		new Mago("Mestre dos Magos", 2, 5, 2500, 60, 80, 3, magias);
		new Guerreiro("Guerreiro Viking", 1, 6, 3000, 75, 60, 2, habilidades);
		int qtdPersonagens = Game.getQtdPersonagens();
		assertEquals(2, qtdPersonagens);
		
				
	}
	@Test
	void deveAdicionarMagiaAoMago() throws Exception {
		String magia = Mago.aprenderMagia("Soltar Fogo");
		assertEquals("Soltar Fogo", magia);		
			
	}
	
	@Test
	void deveAdicionarHabilidadeaoGuerreiro() throws Exception {
		String habilidade = Guerreiro.aprenderHabilidade("Leitura de mentes");		
		assertEquals("Leitura de mentes", habilidade);		
		
	}
	
	
	
	
	
	
	

}
