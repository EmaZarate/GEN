package datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

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
			PreparedStatement pst = 
			conn.prepareStatement("INSERT INTO 'riesgos' ('nombre','fecha_inicio','fecha_fin','estado','tipo_riesgo','id_usuario','descripcion') VALUES ( ?, ?, ?, ?, ?, ?, ?)");
			pst.setString(1, rie.getNombre());
			pst.setDate(2, rie.getFecha_inicio());
			pst.setDate(3, rie.getFecha_fin());
			pst.setString(4, rie.getEstado());
			pst.setInt(5,rie.getTipo_riesgo());
			pst.setInt(6,rie.getId_usuario());
			pst.setString(7,rie.getDescripcion());
			pst.executeUpdate();
			ResultSet rs=pst.getGeneratedKeys();

			conn.commit();
			
			conn.close();
		} 
		catch (SQLException e) {System.out.println(e.toString());try {conn.rollback();} catch (SQLException e1) {e1.printStackTrace();	}}
		finally {if(conn!=null)	try {conn.close();} catch (SQLException e) {System.out.println(e.toString());}

		}
		
		
		
	}
	
	
		
	
	
}
