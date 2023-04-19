package exercicio01;

public class veiculo {
	private static int combustivel;
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private String km;
	private static boolean isLigado;
	private static int litrosCombustivel;
	private static int velocidade;
	private double preco;
	
	

	public veiculo(String marca, String modelo, String placa, String cor, String km, boolean isLigado, int litrosCombustivel, int velocidade, double preco ) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPlaca(placa);
		this.setCor(cor);
		this.setKm(km);
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.setPreco(preco);
	}
	
	
	public static void ligar() {
		if(isLigado()) {		
			System.out.println("Carro ligado com sucesso!");
			
			} else {
				System.out.println("Ligando o veiculo!");
				isLigado = true;
			}
		
		
	}
	
	public static void desligar() {
		if (isLigado()) {
			if(velocidade > 0) {
				System.out.println("Não é possível desligar, carro em movimento!");
			} else {
				System.out.println("Carro desligado com sucesso!");
				setLigado(false);
			}
		}
	}
	
	public static void acelerar() {
		velocidade += 20;
			System.out.println("Carro acelerado com sucesso!");
		
	}
	
	public void frear() {
		if (isLigado() && veiculo.velocidade > 0) {
			velocidade -= 20;
			System.out.println("Carro freado com sucesso!");
		} else {
			System.out.println("Não é possível frear pois o veículo está parado!");
		}
	}
	
	public void pintar(String cor) {
		this.setCor(cor);
		System.out.println("Carro pintado com sucesso da cor");		
		
	}
	
	public static void abastecer() {
		if (combustivel > 60) {
			System.out.println("Carro não suporta mais que 60 litros !");
			litrosCombustivel += combustivel;			
		}else if  (combustivel + litrosCombustivel > 60)
			System.out.println("Não é possível abastecer mais" + combustivel + "Litros," + 
					"pois ultrapassa a capacidade do tanque, quantidade de litros no tanque:" + litrosCombustivel);
			
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public static int getVelocidade() {
		return 20;
	}

	public static int getLitrosCombustivel() {
		return 60;
	}

	public static boolean isLigado() {
		return isLigado;
	}

	public static void setLigado(boolean isLigado) {
		veiculo.isLigado = isLigado;
	}

	
	

	


}
