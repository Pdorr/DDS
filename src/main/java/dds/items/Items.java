package dds.items;

public class Items {
	private int unidades;
	private double precioUnitario;
	private double precioFinal=unidades*precioUnitario;
	
	public int getUnidades() {
		
		return unidades;
	}
	public void setUnidades(int unidades) {
		
		this.unidades = unidades;
		this.precioFinal=unidades*precioUnitario;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
		this.precioFinal=unidades*precioUnitario;
	}
	public double getPrecioFinal() {
		return precioFinal;
	}
	public boolean generaCertificado() {
		return true;
	} 
}
