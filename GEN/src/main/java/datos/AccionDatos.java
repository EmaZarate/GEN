package datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import datos.conexion;
import java.sql.ResultSet;

import modelo.Accion;

public class AccionDatos {
	public static  List<Accion> mostrarTodos() {
		Connection conn = null;
		List<Accion> as=new ArrayList<Accion>();
		try {
			conn = conexion.getConnection();
			conn.setAutoCommit(false);
			PreparedStatement pst = 
			conn.prepareStatement("SELECT * from accion order by nombre asc");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
				{                           
				Accion a=new Accion();
				a.setId_accion(rs.getInt("id_accion"));
				a.setId_tipo_Accion(rs.getInt("id_tipo_accion"));
				a.setDescripcion(rs.getString("descripcion"));
				a.setNombre(rs.getString("nombre"));
				as.add(a);
				}
			conn.close();
		} 
		catch (SQLException e) {System.out.println(e.toString());}
		finally {if(conn!=null)	try {conn.close();} catch (SQLException e) {System.out.println(e.toString());}
		}
		return as;
	}
	
	public static void nuevoA(Accion a) {
		Connection conn = null;
		try {
			conn = conexion.getConnection();
			conn.setAutoCommit(false);
			//Insert con parametros para que no hagan SQL Inject
			PreparedStatement pst = 
			conn.prepareStatement("INSERT INTO `accion` (`id_tipo_Accion`,`descripcion`,`nombre`) VALUES ( ?, ?, ?)");
			pst.setInt(1, a.getId_tipo_Accion());
			pst.setString(1, a.getDescripcion());
			pst.setString(1, a.getNombre());
			pst.executeUpdate();
			conn.commit();
			conn.close();
		} 
		catch (SQLException e) {System.out.println(e.toString());try {conn.rollback();} catch (SQLException e1) {e1.printStackTrace();	}}
		finally {if(conn!=null)	try {conn.close();} catch (SQLException e) {System.out.println(e.toString());}

		}	
	}
}


	