

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "controladorMB")
@RequestScoped 

public class Controlador{
	
	
	private String fecha;
	private int cont;
	private String caracter;
	private int tam;
	
	
	
	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	

	public int getCont() {
		return cont;
	}


	public void setCont(int cont) {
		this.cont = cont;
	}
	
	
	


	public String getCaracter() {
		return caracter;
	}


	public void setCaracter(String caracter) {
		this.caracter = caracter;
	}


	public int getTam() {
		return tam;
	}


	public void setTam(int tam) {
		this.tam = tam;
	}


	public void generarFecha() {


		Calendar tiempo=new GregorianCalendar();
		SimpleDateFormat forma_dato= new SimpleDateFormat("dd-MM-yyyy");
		fecha=forma_dato.format(tiempo.getTime());
		
	}
	

	public void contar() {
		
		cont++;
		System.out.println(cont);
		
	}
	
	public void tamanio() {
		
		tam=caracter.length();
		
		
		
	}
	
	
		
	}
	
