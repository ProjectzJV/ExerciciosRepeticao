package ExercicioHeranca;

public class Cachorro extends Animal {
	
	private String raca;
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getEmitir() {
		return emitir;
	}
	public void setEmitir(String emitir) {
		this.emitir = emitir;
	}
	private String emitir;

}
