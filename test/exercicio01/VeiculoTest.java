package exercicio01;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VeiculoTest {
	
			
	@BeforeEach
	public void setup() throws Exception {
		    new veiculo("Chevrolet", "Corsa", "ARX-3345", "Branco", "50.000", false, 0, 0, 25000);
	
	}
	
			
	@Test
	void testeParaAcelerar() throws Exception {
		veiculo.acelerar();
		assertEquals(20, veiculo.getVelocidade());
			
	}
	
	@Test
	void testeParaAbastecerMenosde60Litros() throws Exception {
			veiculo.abastecer();
			assertEquals(60, veiculo.getLitrosCombustivel());
				
	}
	
	@Test
	void testeParaLigar() throws Exception {
		veiculo.ligar();			
		assertEquals(veiculo.isLigado(), true);
		
		
	}	
	
	

}
