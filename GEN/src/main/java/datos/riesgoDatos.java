package datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import datos.conexion;

import modelo.Riesgo;

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
	
}
