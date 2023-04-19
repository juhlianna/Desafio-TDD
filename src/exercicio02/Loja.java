package exercicio02;

import static org.junit.Assert.assertNotNull;

import java.util.List;

public class Loja {
	private static String nome;
	private String cnpj;
	static List<Livro> livros;
	static List<VideoGame> videoGames;
	
		
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
		}
	
	public Loja() {
		
	}	
	
	public static String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public void listaLivros() {
		if(!livros.isEmpty()) {
			imprimirListaLivros();
			return;						
		} else {
			System.out.println("Esta loja não tem livros no seu estoque.");
			return;
		}
	}
	
	private void imprimirListaLivros() {
		System.out.println("----------------------");
		System.out.println("A loja " + getNome() + "possui estes livros para venda:");
		for (Livro livro : livros) {
			System.out.println("Título: " + livro.getNome() + ", preço: R$ " + livro.getPreco() + ", quantidade" + livro.getQtd() +  "em estoque");
		}
		
	}

	public void listaVideoGames() {
		if(videoGames.isEmpty()) {
			System.out.println("A loja não tem livros em estoque.");
			return;
						
		}
		
		System.out.println("A loja " + getNome() + "possui estes livros para venda: ");
		
		for(VideoGame videoGame : videoGames) {
			System.out.println("Título " + videoGame.getNome() + ", preço " + videoGame.getPreco() + " quantidade: " +  VideoGame.getQtd() + " em estoque");
			
		}
	}
	
	public static double calculaPatrimonio() {
		double somatoria = 0;
		for (Livro livro : livros) {
			somatoria += (livro.getPreco() * livro.getQtd());
		}
		for (VideoGame videoGame : videoGames) {
			somatoria += (videoGame.getPreco() * VideoGame.getQtd() );			
		}
		System.out.println("----------------------------------------");
		System.out.println("O patrimonio da loja: " + getNome() + "é de R$" + somatoria);
		return somatoria;
			
		}


}
