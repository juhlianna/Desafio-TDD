package exercicio02;

public class VideoGame extends Produto implements Imposto {
	
	private String marca;
	private String modelo;
	private boolean isUsado;
	
		
	public VideoGame(String nome,double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
		
	}
	
	public VideoGame() {		
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isUsado() {
		return isUsado;
	}
	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calculaimposto() {
		double imposto;
		if (isUsado) {
			imposto = 0.25 * getPreco();
			System.out.println("Imposto " + getNome() + " " + getModelo() + "usado" + "R$" + imposto);
			return imposto;
		} else {
			imposto = 0.45 * getPreco();
			System.out.println("Imposto" + getNome() + " " + getModelo() + "R$" + imposto);
			return imposto;
		}
		
		
	}

	

	

}
