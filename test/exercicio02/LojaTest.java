package exercicio02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LojaTest {
	
	@BeforeEach
	public void setup() throws Exception{
		ArrayList<Livro> livros = null;
		ArrayList<VideoGame> games = null;
		new Loja("Americanas", "12345678", livros, games);		
		
	}
	
	@Test
	void listarLivros() throws Exception {
		Livro l1 = new Livro("Harry Potter", 40, 50, "J.K.Rowling", "fantasia", 300);		
		assertTrue(true);		
		
	}
	
	@Test
	void listarVideoGames() throws Exception {
		VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
		assertNotNull(xbox);
		
	}
	
			
		
	

	

		
	

}
