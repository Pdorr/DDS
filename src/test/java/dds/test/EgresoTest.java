package dds.test;

import org.junit.Test;

import dds.articulo.Articulo;
import dds.egreso.Egreso;
import dds.servicio.Servicio;

import org.junit.Assert;

public class EgresoTest {
	
private double suma;

@SuppressWarnings("deprecation")
@Test
	public void egresoTest(){

		Egreso egreso = new Egreso();
		Articulo art1=new Articulo();
		Articulo art2=new Articulo();
		Servicio ser1=new Servicio();
		
		art1.setPrecioUnitario(5);
		art1.setUnidades(2);
		art2.setPrecioUnitario(3);
		art2.setUnidades(1);
		ser1.setPrecioUnitario(15);
		ser1.setUnidades(1);
		this.suma = art1.getPrecioFinal() + art2.getPrecioFinal() + ser1.getPrecioFinal();
		egreso.agregarItem(art1);
		egreso.agregarItem(art2);
		egreso.agregarItem(ser1);
		egreso.getPrecioTotal();
		Assert.assertEquals(this.suma,egreso.getPrecioTotal(),0.05);
		art1.setPrecioUnitario(2);
		this.suma = art1.getPrecioFinal() + art2.getPrecioFinal() + ser1.getPrecioFinal();
		Assert.assertNotEquals(this.suma,egreso.getPrecioTotal(),0.05);
	}
@Test
	public void generaRemito() {
		Egreso egreso = new Egreso();
		Articulo art1=new Articulo();
		Articulo art2=new Articulo();
		Servicio ser1 = new Servicio();
		
		egreso.agregarItem(art1);
		egreso.agregarItem(art2);
		Assert.assertTrue(egreso.generaRemito());
		egreso.agregarItem(ser1);
		Assert.assertFalse(egreso.generaRemito());
		
	}

}
