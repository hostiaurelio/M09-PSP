package conceptos;

import java.math.BigDecimal;

public class Jefe extends Empleado {

	private BigDecimal incentivo;
	
	
	public void estableceIncentivo(BigDecimal incentivo) {
		this.incentivo=incentivo;
	}
	
	public BigDecimal dameIncentivo() {
		return incentivo;
	}
	
	@Override
	public BigDecimal dameSueldo() {
		return super.dameSueldo().add(incentivo);
		
	}

	public Jefe(String nombre, BigDecimal sueldo, String seccion, BigDecimal incentivo) {
		super(nombre, sueldo, seccion);
		this.incentivo = incentivo;
	}
	
	
}
