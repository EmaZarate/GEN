package datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import datos.conexion;

import modelo.Riesgo;
import modelo.Usuario;

public class riesgoDatos {
	public static void nuevoRiesgo(Riesgo rie) {
		Connection conn = null;
		try {
			conn = conexion.getConnection();
			conn.setAutoCommit(false);
			System.out.println("riesgoDatos - nuevoRiesgo");
			//Insert con parametros para que no hagan SQL Inject
			PreparedStatement pst = 
			conn.prepareStatement("INSERT INTO `riesgos` (`nombre`, `estado`, `tipo_riesgo`, `id_usuario`, `descripcion`,`fecha_inicio`,`id_ciudad`,`id_provincia`) VALUES ( ?, ?, ?, ?, ?,NOW(), ?, ?)");
			pst.setString(1, rie.getNombre());
			pst.setString(2, rie.getEstado());
			pst.setInt(3,rie.getTipo_riesgo());
			pst.setInt(4,rie.getId_usuario());
			pst.setString(5,rie.getDescripcion());
			pst.setInt(6,rie.getCiu());
			pst.setInt(7,rie.getPrv());
			System.out.println(pst);
			pst.executeUpdate();
			conn.commit();
			conn.close();
		} 
		catch (SQLException e) {System.out.println(e.toString());try {conn.rollback();} catch (SQLException e1) {e1.printStackTrace();	}}
		finally {if(conn!=null)	try {conn.close();} catch (SQLException e) {System.out.println(e.toString());}
		}
			
	}
	
	public static  List<Riesgo> mostrarRiesgos(int idusu) {
		Connection conn = null;
		List<Riesgo> ries=new ArrayList<Riesgo>();
		try {
			conn = conexion.getConnection();
			conn.setAutoCommit(false);
			PreparedStatement pst = 
			conn.prepareStatement("SELECT riesgos.*,tipo_riesgo.nombre trnom,ciudad.nombre ciunom,provincia.nombre prvnom FROM riesgos\r\n" + 
					"INNER JOIN tipo_riesgo ON riesgos.tipo_riesgo=tipo_riesgo.id_tipo\r\n" + 
					"INNER JOIN usuarios ON riesgos.id_usuario=usuarios.id_usuario\r\n" + 
					"INNER JOIN provincia ON riesgos.id_provincia=provincia.id_provincia\r\n" + 
					"INNER JOIN ciudad ON riesgos.id_ciudad=ciudad.id_ciudad\r\n" + 
					"WHERE riesgos.id_usuario=?");
			pst.setInt(1, idusu);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
				{                           
				Riesgo rie=new Riesgo();
				rie.setIdriesgo(rs.getInt("id_riesgo"));
				rie.setNombre(rs.getString("nombre"));
				rie.setFecha_inicio(rs.getDate("fecha_inicio"));
				rie.setFecha_fin(rs.getDate("fecha_fin"));
				rie.setEstado(rs.getString("estado"));
				rie.setTipo_riesgo(rs.getInt("tipo_riesgo"));
				rie.setId_usuario(rs.getInt("id_usuario"));
				rie.setDescripcion(rs.getString("descripcion"));
				rie.setCiu(rs.getInt("id_ciudad"));
				rie.setPrv(rs.getInt("id_provincia"));
				//rie.setIdriesgo("trnom");
				//rie.setIdriesgo("ciunom");
				//rie.setIdriesgo("prvnom");
				ries.add(rie);
				}
			conn.close();
		} 
		catch (SQLException e) {System.out.println(e.toString());}
		finally {if(conn!=null)	try {conn.close();} catch (SQLException e) {System.out.println(e.toString());}
		}
		return ries;
	}
	
}
