package datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import datos.conexion;
import java.sql.ResultSet;

import modelo.Usuario;

public class usuarioDatos {
	public static boolean validarUsuario(Usuario usu) {
		Connection conn = null;
		boolean resp = false;
		try {
			conn = conexion.getConnection();
		    //Asi se hace una consulta para que no metan SQL inject
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM usuarios WHERE BINARY usuario=? and  password=?");
			pst.setString(1, usu.getUsuario()); 
			pst.setString(2, usu.getClave());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				resp = true;
				usu.setNombre(rs.getString("nombre"));
				usu.setApellido(rs.getString("apellido"));
				usu.setEmail(rs.getString("email"));
				usu.setUsuario(rs.getString("usuario"));
				usu.setClave(rs.getString("password"));
				usu.setIdusuario(rs.getInt("id_usuario"));
				usu.setHabilitado(rs.getBoolean("habilitado"));
				usu.setTipoUsuario(rs.getInt("tipo_usuario"));
				System.out.println(usu.getApellido());
			}
		
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.toString());
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println(e.toString());
				}
		}
		return resp;
	}
	
		
	
	
}
