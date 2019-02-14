package datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import datos.conexion;
import java.sql.ResultSet;

import modelo.Accion;
import modelo.AccionRiesgo;
import modelo.TipoAccion;

public class AccionRiesgoDatos {
	
	
	public static void nuevoAR(AccionRiesgo ar) {
		Connection conn = null;
		try {
			conn = conexion.getConnection();
			conn.setAutoCommit(false);
			//Insert con parametros para que no hagan SQL Inject
			PreparedStatement pst = 
			conn.prepareStatement("INSERT INTO `accion_riesgo` (`id_riesgo`,`id_accion`,`descripcion`,`id_usualta`,`fecha_alta`,`latitud`,`longitud`) VALUES ( ?, ?, ?, ?, NOW(),?,?)");
			pst.setInt(1, ar.getId_riesgo());
			pst.setInt(2, ar.getId_accion());
			pst.setString(3, ar.getDescripcion());
			pst.setInt(4, ar.getId_usualta());
			pst.setFloat(5, ar.getLatitud());
			pst.setFloat(6, ar.getLongitud());
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


	