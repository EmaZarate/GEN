package modelo;

import java.sql.Date;

public class AccionRiesgo {
 private int id_accion;
 private int id_riesgo;
 private String descripcion;
 private int id_usualta;
 private Date fecha_alta;
 private float latitud;
 private float longitud;
 
	public int getId_accion() {
		return id_accion;
	}
	public void setId_accion(int id_accion) {
		this.id_accion = id_accion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha_alta() {
		return fecha_alta;
	}
	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	public float getLatitud() {
		return latitud;
	}
	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}
	public float getLongitud() {
		return longitud;
	}
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	public int getId_riesgo() {
		return id_riesgo;
	}
	public void setId_riesgo(int id_riesgo) {
		this.id_riesgo = id_riesgo;
	}
	public int getId_usualta() {
		return id_usualta;
	}
	public void setId_usualta(int id_usualta) {
		this.id_usualta = id_usualta;
	}
	
}
