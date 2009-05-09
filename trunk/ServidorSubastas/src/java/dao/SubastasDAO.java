/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.*;
import subastas.Usuario;

/**
 *
 * @author Louis
 */
public class SubastasDAO
{
    private Connection conexion = null;

    // <editor-fold defaultstate="collapsed" desc="Conexion a la Base de Datos">
    public SubastasDAO()
    {
        String url = "jdbc:derby://localhost:1527/casasubastas";
	    String dbdriver = "org.apache.derby.jdbc.ClientDriver";
	    String username = "dad";
	    String password = "dad";

		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		try {
			conexion = DriverManager.getConnection(url, username, password);
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
    }
    // </editor-fold>

    public boolean insertarUsuario(Usuario u)
    {
        boolean resultado = false;
		try {
            String consulta = "INSERT INTO DAD.CLIENTES (USUARIO, CLAVE, EMAIL, NOMBRE, APELLIDOS, DIRECCION, CIUDAD, PAIS) VALUES ('"+
            	u.getUsuario()+"', '"+u.getClave()+"', '"+
                u.getEmail()+"', '"+u.getNombre()+"', '"+
                u.getApellidos()+"', '"+u.getDireccion()+
                u.getCiudad()+"', '"+u.getPais()+"')";

            PreparedStatement ps = conexion.prepareStatement(consulta);
            int f = ps.executeUpdate();
            resultado = f > 0;

            ps.close();
        } catch (SQLException ex) { }

        return resultado;
    }

    public Usuario obtenerUsuario(String user)
    {
        Usuario usu = null;
        try {
            String consulta = "SELECT * FROM DAD.CLIENTES WHERE USUARIO = '"+user+"'";

            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                usu = new Usuario();
                usu.setNombre(rs.getString("usuario"));
                usu.setClave(rs.getString("clave"));
                usu.setEmail(rs.getString("email"));
                usu.setNombre(rs.getString("nombre"));
                usu.setApellidos(rs.getString("apellidos"));
                usu.setDireccion(rs.getString("direccion"));
                usu.setCiudad(rs.getString("ciudad"));
                usu.setPais(rs.getString("pais"));
            }

            ps.close();
        } catch (SQLException ex) { }
        return usu;
    }
}





























