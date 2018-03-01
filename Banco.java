
public abstract class Banco {
	
	private double saldo;
	private Protocolo p;
	
	public void setValidacion(Protocolo p){
		this.p = p;
	}
	
	public Protocolo getValidacion(){
		return this.p;
	}
	
	public void transferencia(){
		System.out.println("Transfiriendo");
		
	}
}
