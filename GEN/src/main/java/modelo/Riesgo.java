package modelo;
import java.sql.Date;

public class Riesgo {
	private int idriesgo;
	private String nombre;
	private Date fecha_inicio;
	private Date fecha_fin;
	private String estado;
	private String descripcion;
	private int tipo_riesgo;
	private int id_usuario;
	private int prv;
	private int ciu;
	
	public int getIdriesgo() {
		return idriesgo;
	}
	public void setIdriesgo(int idriesgo) {
		this.idriesgo = idriesgo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario= id_usuario;
	}
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public int getTipo_riesgo() {
		return tipo_riesgo;
	}
	public void setTipo_riesgo(int tipo_riesgo) {
		this.tipo_riesgo = tipo_riesgo;
	}
	public int getPrv() {
		return prv;
	}
	public void setPrv(int prv) {
		this.prv = prv;
	}
	public int getCiu() {
		return ciu;
	}
	public void setCiu(int ciu) {
		this.ciu = ciu;
	}
}
