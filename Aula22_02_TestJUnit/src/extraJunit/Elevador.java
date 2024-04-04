package extraJunit;

public class Elevador {
	
	private int id;
	private double cargaMaxima = 200, cargaAtual = 0;
	private boolean sinalAlerta;
	
	Calculadora calc = new Calculadora();
	Pessoa pessoa = new Pessoa();
	
	public double entrarNoElevador(double peso) {
			return cargaAtual = calc.somar(cargaAtual, peso);
	}
	
	public double sairDoElevador(double peso) {
		return cargaAtual = calc.subtrair(cargaAtual, peso);
	}
	
	public boolean avaliarpeso(double peso) {
		if (peso > cargaMaxima) {
			return !sinalAlerta;
		} else {
			return sinalAlerta;
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	public double getCargaAtual() {
		return cargaAtual;
	}
	public void setCargaAtual(double cargaAtual) {
		this.cargaAtual = cargaAtual;
	}
	public boolean isSinalAlerta() {
		return sinalAlerta;
	}
	public void setSinalAlerta(boolean sinalAlerta) {
		this.sinalAlerta = sinalAlerta;
	}
}