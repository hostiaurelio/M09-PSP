package conceptos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
	
	private String nombre;
	private BigDecimal sueldo;
	private String seccion;
	////PART B///////
	private Date altacontrato;
	////FIN  B//////
	
	public Empleado(String nombre,  String seccion) {
		this.nombre = nombre;
		this.seccion = seccion;
	}
	
	public Empleado(String nombre, BigDecimal sueldo, String seccion) {
		this.nombre = nombre;
		this.sueldo=sueldo;
		this.seccion = seccion;
		
	}
	
	public Empleado() {
		this.nombre = dameNombre();
		this.sueldo=dameSueldo();
		this.seccion = dameSeccion();
	}
	
	/////////////////
	////PART B//////
	///////////////
	
	public Empleado(String nombre,  String seccion, int dia, int mes, int anyo) {
		this.nombre = nombre;
		this.seccion = seccion;
		GregorianCalendar olasollelcalendario = new GregorianCalendar();
		olasollelcalendario.set(GregorianCalendar.DATE, dia);
		olasollelcalendario.set(GregorianCalendar.MONTH, mes);
		olasollelcalendario.set(GregorianCalendar.YEAR, anyo);
		this.altacontrato=olasollelcalendario.getTime();
		
	}
	
	public Empleado(String nombre, BigDecimal sueldo, String seccion, int dia, int mes, int anyo) {
		this.nombre = nombre;
		this.sueldo=sueldo;
		this.seccion = seccion;
		
		GregorianCalendar olasollelcalendario = new GregorianCalendar();
		olasollelcalendario.set(GregorianCalendar.DATE, dia);
		olasollelcalendario.set(GregorianCalendar.MONTH, mes);
		olasollelcalendario.set(GregorianCalendar.YEAR, anyo);
		this.altacontrato=olasollelcalendario.getTime();
	}
	
	/////////////////
	////FIN  B//////
	///////////////

	public BigDecimal subeSueldo(BigDecimal sueldo, int porcentaje) {
		
		return sueldo.add(((sueldo.multiply(new BigDecimal(porcentaje))).divide(new BigDecimal (100))));
	}
	
	public String dameNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal dameSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}
	
	public void setAltaContrato(Date altacontrato) {
		this.altacontrato=altacontrato;
	}
	
	public Date dameAltaContrato() {
		return altacontrato;
	}
	
	public String dameSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
}
