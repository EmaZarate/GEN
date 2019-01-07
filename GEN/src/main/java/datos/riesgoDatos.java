package datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import datos.conexion;
import java.sql.ResultSet;

import modelo.Riesgo;

public class riesgoDatos {
	public static void nuevoRiesgo(Riesgo rie) {
		Connection conn = null;
		long id=0;
		boolean resp = false;
		try {
			conn = conexion.getConnection();
			conn.setAutoCommit(false);
			System.out.println("riesgoDatos - nuevoRiesgo");
			PreparedStatement pst = 
			conn.prepareStatement("INSERT INTO `riesgos` (`nombre`, `estado`, `tipo_riesgo`, `id_usuario`, `descripcion`) VALUES ( ?, ?, ?, ?, ?)");
			pst.setString(1, rie.getNombre());
			pst.setString(2, rie.getEstado());
			pst.setInt(3,rie.getTipo_riesgo());
			pst.setInt(4,rie.getId_usuario());
			pst.setString(5,rie.getDescripcion());
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
