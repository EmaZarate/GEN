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
				ta.setId_tipoa(rs.getInt("id_tipo"));
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
}


	