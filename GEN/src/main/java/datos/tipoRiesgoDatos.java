package datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import datos.conexion;
import java.sql.ResultSet;

import modelo.TipoRiesgo;

public class tipoRiesgoDatos {
	public static  List<TipoRiesgo> mostrarTodos() {
		Connection conn = null;
		List<TipoRiesgo> trs=new ArrayList<TipoRiesgo>();
		try {
			conn = conexion.getConnection();
			conn.setAutoCommit(false);
			PreparedStatement pst = 
			conn.prepareStatement("SELECT * from tipo_riesgo order by nombre asc");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
				{                           
				TipoRiesgo tr=new TipoRiesgo();
				tr.setId_tipor(rs.getInt("id_tipo"));
				tr.setNombre(rs.getString("nombre"));
				tr.setDescripcion(rs.getString("descripcion"));
				trs.add(tr);
				}
			conn.close();
		} 
		catch (SQLException e) {System.out.println(e.toString());}
		finally {if(conn!=null)	try {conn.close();} catch (SQLException e) {System.out.println(e.toString());}
		}
		return trs;
	}
	
	public static void nuevoTR(TipoRiesgo tr) {
		Connection conn = null;
		try {
			conn = conexion.getConnection();
			conn.setAutoCommit(false);
			//Insert con parametros para que no hagan SQL Inject
			PreparedStatement pst = 
			conn.prepareStatement("INSERT INTO `tipo_riesgo` (`descripcion`,`nombre`,`usu_alta_tr`,`fecha_alta_tr`) VALUES (?, ?, ?, NOW())");
			pst.setString(1, tr.getDescripcion());
			pst.setString(2, tr.getNombre());
			pst.setInt(3, tr.getId_usu_atr());
			pst.executeUpdate();
			conn.commit();
			conn.close();
		} 
		catch (SQLException e) {System.out.println(e.toString());try {conn.rollback();} catch (SQLException e1) {e1.printStackTrace();	}}
		finally {if(conn!=null)	try {conn.close();} catch (SQLException e) {System.out.println(e.toString());}

		}	
	}
}
	