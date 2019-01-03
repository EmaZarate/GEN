package modelo;

public class Accion {
 private int id_accion;
 private String nombre;
 private int id_tipo_Accion;
 private String descripcion;
 
	public int getId_accion() {
		return id_accion;
	}
	public void setId_accion(int id_accion) {
		this.id_accion = id_accion;
	}
	public int getId_tipo_Accion() {
		return id_tipo_Accion;
	}
	public void setId_tipo_Accion(int id_tipo_Accion) {
		this.id_tipo_Accion = id_tipo_Accion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
