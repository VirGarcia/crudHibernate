package pacm06_virginia;
import java.util.Date;

public class Prestamo {
	
	private int idPrestamo;
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	
	private Libro pLibro;
	private Lector pLector;
	
	public Prestamo() {
		// TODO Auto-generated method stub

	}
	public Prestamo(Date fechaPrestamo, Date fechaDevolucion, Libro objLibro, Lector objLector) {
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;	
		this.pLibro = objLibro;
		this.pLector = objLector;		
		
	}
	public Prestamo (int idPrestamo, Date fechaPrestamo, Date fechaDevolucion, Libro objLibro, Lector objLector) {
		this.idPrestamo = idPrestamo;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;	
		this.pLibro = objLibro;
		this.pLector = objLector;
	}
	public int getIdPrestamo() {
		return this.idPrestamo;
	}
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	/*public Libro getPrestamoLibro(String titulo, String autor, int anio_publicacion, boolean disponible)
	{
		return prestamoLibro;
				//libro(titulo, autor, anio_publicacion, disponible);
		
	}*/
	
	@Override
	public String toString() {
		return "Prestamo:" + getIdPrestamo() + " , fechaPrestamo=" + getFechaPrestamo() + " , fechaDevolucion=" + getFechaDevolucion() +".";
	}

}
