package dds.egreso;
import java.util.ArrayList;
import dds.items.*;
import dds.articulo.*;
import dds.servicio.*;

public class Egreso {
	
	private double precioTotal;
	private boolean yaEjecutado=false;
	ArrayList<Items> listaItems = new ArrayList<Items>();
	ArrayList<Items> listaItemsEjec = new ArrayList<Items>();
	//ArrayList<Servicio> listaServicio = new ArrayList<Servicio>();
	public boolean listaVacia () {
		return this.listaItems.isEmpty();
	}
	
	public void agregarItem(Items a){
		this.listaItems.add(a);
	}
	public void calculoTotal() {
		this.listaItemsEjec = this.listaItems;
			for(int indice = 0;indice<this.listaItemsEjec.size();indice++) {
				this.precioTotal+=this.listaItemsEjec.get(indice).getPrecioFinal();
			}
	}//ff
	public double getPrecioTotal() {
		if(this.yaEjecutado==false) {
			this.calculoTotal();
			this.yaEjecutado=true;
		}
		return this.precioTotal;
		
	}
	public boolean generaRemito() {
		boolean flag=true;
		
		for(int indice = 0;indice<this.listaItems.size();indice++) {
			if(this.listaItems.get(indice).generaCertificado()==false) {
				flag=false;
			}
		}
		return flag;
	}
	
}
