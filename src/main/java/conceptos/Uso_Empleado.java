package conceptos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Uso_Empleado {
	
	private Empleado empleado;
	
	public Uso_Empleado(Empleado empleado) {
		this.empleado=empleado;
	}
	
	public static void creaEmpleado() {
		Empleado empleado1= new Empleado("Luis", "Administracion");
		
		empleado1.setSueldo(new BigDecimal(20000));
		
		Empleado empleado2= new Empleado("Ana", "Ventas");
		
		empleado2.setSueldo(new BigDecimal(25000));
		empleado2.setSueldo(empleado2.subeSueldo(empleado2.dameSueldo(), 5));
		
		Empleado empleado3= new Empleado("Marta", "Departamento de exterminacion de unicornios");
		
		empleado3.setSueldo(new BigDecimal(25000));
		
		List<Empleado> listaEmpleados=new ArrayList<Empleado>();
		listaEmpleados.add(empleado1);
		listaEmpleados.add(empleado2);
		listaEmpleados.add(empleado3);
		
		muestraEmpleado(listaEmpleados);
		
		Jefe jefe1=new Jefe("Ninon", new BigDecimal(25000), "Devoradores de mundos", new BigDecimal(1000));
		
		Empleado[] empleoDeEmpleadosQueSeEmpleanEnEmplearse = new Empleado [4];
		
		empleoDeEmpleadosQueSeEmpleanEnEmplearse[0]=empleado1;
		empleoDeEmpleadosQueSeEmpleanEnEmplearse[1]=empleado2;
		empleoDeEmpleadosQueSeEmpleanEnEmplearse[2]=empleado3;
		empleoDeEmpleadosQueSeEmpleanEnEmplearse[3] = jefe1;
		
		muestraplantilla(empleoDeEmpleadosQueSeEmpleanEnEmplearse);
		
		//// PART B ////
		listaEmpleados=new ArrayList<Empleado>();
		Empleado empleado5=new Empleado("Albert",new BigDecimal(25000),"Aspiradora",27,10,1896);
		Empleado empleado6=new Empleado("Júquero",new BigDecimal(25000),"Tipo con traumas",11,8,1993);
		Empleado empleado7=new Empleado("Burfo",new BigDecimal(25000),"Perritos adoptados por la empresa",19,2,2010);
//		Jefe jefe2 =new Jefe("Burfo",new BigDecimal(25000),"Perritos adoptados por la empresa",19,2,2010, new BigDecimal(20000));
		listaEmpleados.add(empleado5);
		listaEmpleados.add(empleado6);
		listaEmpleados.add(empleado7);
		muestraEmpleado(listaEmpleados);
		//// FIN B ////
		
	}

	public static void muestraEmpleado(List<Empleado> listaEmpleados) {
		int i=0;
			System.out.println("***********************");
		for (Empleado empleado : listaEmpleados) {
			i++;
			System.out.println("Empleado "+i);
			System.out.println("-----------------------");
			System.out.println(empleado.dameNombre());
			System.out.println(empleado.dameSueldo().toString());
			System.out.println(empleado.dameSeccion());
			//// PART B ////
			if (empleado.dameAltaContrato()!=null) {
				System.out.println(empleado.dameAltaContrato());
			}
			//// FIN B ////
			System.out.println("***********************");
		}	
		System.out.println("");
		System.out.println("FIN");
		System.out.println("");
	}
	
	public static void muestraplantilla(Empleado[] e) {
		int i=0;
		for (Empleado empleado : e) {
			
			i++;
			System.out.println("Empleado "+i);
			System.out.println("-----------------------");
			System.out.println(empleado.dameNombre());
			System.out.println(empleado.dameSueldo().toString());
			System.out.println(empleado.dameSeccion());
			System.out.println("***********************");
		}	
	}
	
	public static void main(String[] args) {
		creaEmpleado();
	}
}
