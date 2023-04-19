package exercicio07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {
	
	@Test
	void deveCalcularBonificacaoDeGerente() throws Exception {
		Funcionario gerente = new Gerente("Maria", 27, 18000.00);
		double bonificacao = gerente.bonificacao();
		assertEquals(28000, bonificacao);		
					
	}
	
	@Test
	void deveCalcularBonificacaoDeVendedor() throws Exception {
		Funcionario vendedor = new Vendedor("José", 28, 3000);
		double bonificacao = vendedor.bonificacao();
		assertEquals(6000, bonificacao);		
		
	}
	
	@Test
	void deveCalcularBonificacaoDeSupervisor() throws Exception {
		Funcionario supervisor = new Supervisor("João", 31, 13000);
		double bonificacao = supervisor.bonificacao();
		assertEquals(18000, bonificacao);
		
	}
	

}
