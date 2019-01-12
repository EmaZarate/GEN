package datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import datos.conexion;
import java.sql.ResultSet;

import modelo.TipoAccion;

public class tipoAccionDatos {
	public static  List<TipoAccion> mostrarTodos() {
		Connection conn = null;
		List<TipoAccion> tas=new ArrayList<TipoAccion>();
		try {
			conn = conexion.getConnection();
			conn.setAutoCommit(false);
			PreparedStatement pst = 
			conn.prepareStatement("SELECT * from tipo_accion order by nombre asc");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
				{                           
				TipoAccion ta=new TipoAccion();
				ta.setIdtipo_accion(rs.getInt("id_tipo"));
				ta.setDescripcion(rs.getString("descripcion"));
				tas.add(ta);
				}
			conn.close();
		} 
		catch (SQLException e) {System.out.println(e.toString());}
		finally {if(conn!=null)	try {conn.close();} catch (SQLException e) {System.out.println(e.toString());}
		}
		return tas;
	}
	
	public static void nuevoTA(TipoAccion ta) {
		Connection conn = null;
		try {
			conn = conexion.getConnection();
			conn.setAutoCommit(false);
			//Insert con parametros para que no hagan SQL Inject
			PreparedStatement pst = 
			conn.prepareStatement("INSERT INTO `tipo_accion` (`descripcion`,`usu_alta_ta`,`fecha_alta_ta`,`nombre`) VALUES ( ?, ?, NOW()), ?");
			pst.setString(1, ta.getDescripcion());
			pst.setInt(2,ta.getUsu_alta_ta());
			pst.setString(3,ta.getNombre());
			pst.executeUpdate();
			conn.commit();
			conn.close();
		} 
		catch (SQLException e) {System.out.println(e.toString());try {conn.rollback();} catch (SQLException e1) {e1.printStackTrace();	}}
		finally {if(conn!=null)	try {conn.close();} catch (SQLException e) {System.out.println(e.toString());}

		}	
	}
}


	