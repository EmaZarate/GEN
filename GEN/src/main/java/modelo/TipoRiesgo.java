package modelo;

public class TipoRiesgo {
	private int id_tipor;
	private String nombre;
	private String descripcion;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getId_tipor() {
		return id_tipor;
	}
	public void setId_tipor(int id_tipor) {
		this.id_tipor = id_tipor;
	}
	
}
