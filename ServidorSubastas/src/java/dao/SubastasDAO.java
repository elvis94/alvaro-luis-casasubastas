/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.*;
import java.util.ArrayList;
import subastas.*;

/**
 *
 * @author 
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
                u.getApellidos()+"', '"+u.getDireccion()+"', '"+
                u.getCiudad()+"', '"+u.getPais()+"')";

            PreparedStatement ps = conexion.prepareStatement(consulta);
            int f = ps.executeUpdate();
            resultado = f > 0;

            ps.close();
        } catch (SQLException ex) { }

        return resultado;
    }

	public String obtenerPassword(String user)
	{
		String pass = "";
        try {
            String consulta = "SELECT clave FROM DAD.CLIENTES WHERE USUARIO = '"+user+"'";

            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if(rs.next())
				pass = rs.getString("clave");

            ps.close();
        } catch (SQLException ex) { }

        return pass;
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
                usu.setUsuario(rs.getString("usuario"));
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

    public boolean isUsuario(String user)
    {
        boolean isInserted = true;
        try {
            String consulta = "SELECT COUNT(usuario) AS total FROM DAD.CLIENTES WHERE USUARIO = '"+user+"'";

            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            rs.next();
            isInserted = rs.getInt("total") > 0? true:false;

            ps.close();
        } catch (SQLException ex) { }

        return isInserted;
    }

	public Subasta[] obtenerTodasLasSubastas()
	{
		ArrayList<Subasta> subs = new ArrayList<Subasta>();
		try {
            String consulta = "SELECT * FROM DAD.SUBASTAS";

            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
				Subasta sub = new Subasta();
				sub.setId(rs.getInt("id"));
				sub.setNombre(rs.getString("nombre"));
				sub.setSubastador(obtenerUsuario(rs.getString("subastador")));
				sub.setDescripcion(rs.getString("descripcion"));
				sub.setCategoria(rs.getString("categoria"));
				sub.setPrecioSalida(rs.getDouble("precio_salida"));
				sub.setPujaActual(rs.getDouble("puja_actual"));
				sub.setPrecioCompra(rs.getDouble("precio_compra"));

				sub.setFechaSalida(new java.util.Date(rs.getDate("fecha_salida").getTime()));
				sub.setFechaCierre(new java.util.Date(rs.getDate("fecha_cierre").getTime()));

				Date d = rs.getDate("fecha_puja_actual");
				if(d != null)
					sub.setFechaPujaActual(new java.util.Date(d.getTime()));

				sub.setPujadorActual(obtenerUsuario(rs.getString("pujador_actual")));

				subs.add(sub);
            }

            ps.close();
        } catch (SQLException ex) { }

		return (Subasta[])subs.toArray(new Subasta[]{});
	}

	public Subasta[] obtenerTodasLasSubastasAbiertas()
	{
		ArrayList<Subasta> subs = new ArrayList<Subasta>();
		try {
            String consulta = "SELECT * FROM DAD.SUBASTAS WHERE fecha_cierre > CURRENT_TIMESTAMP ORDER BY fecha_cierre";

            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
				Subasta sub = new Subasta();
				sub.setId(rs.getInt("id"));
				sub.setNombre(rs.getString("nombre"));
				sub.setSubastador(obtenerUsuario(rs.getString("subastador")));
				sub.setDescripcion(rs.getString("descripcion"));
				sub.setCategoria(rs.getString("categoria"));
				sub.setPrecioSalida(rs.getDouble("precio_salida"));
				sub.setPujaActual(rs.getDouble("puja_actual"));
				sub.setPrecioCompra(rs.getDouble("precio_compra"));

				sub.setFechaSalida(new java.util.Date(rs.getDate("fecha_salida").getTime()));
				sub.setFechaCierre(new java.util.Date(rs.getDate("fecha_cierre").getTime()));

				Date d = rs.getDate("fecha_puja_actual");
				if(d != null)
					sub.setFechaPujaActual(new java.util.Date(d.getTime()));

				sub.setPujadorActual(obtenerUsuario(rs.getString("pujador_actual")));

				subs.add(sub);
            }

            ps.close();
        } catch (SQLException ex) { }

		return (Subasta[])subs.toArray(new Subasta[]{});
	}

	public Subasta[] obtenerSubastasDeUsuario(String u)
	{
		ArrayList<Subasta> subs = new ArrayList<Subasta>();
		try {
            String consulta = "SELECT * FROM DAD.SUBASTAS WHERE subastador='"+u+"' ORDER BY fecha_cierre";

            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
				Subasta sub = new Subasta();
				sub.setId(rs.getInt("id"));
				sub.setNombre(rs.getString("nombre"));
				sub.setSubastador(obtenerUsuario(rs.getString("subastador")));
				sub.setDescripcion(rs.getString("descripcion"));
				sub.setCategoria(rs.getString("categoria"));
				sub.setPrecioSalida(rs.getDouble("precio_salida"));
				sub.setPujaActual(rs.getDouble("puja_actual"));
				sub.setPrecioCompra(rs.getDouble("precio_compra"));

				sub.setFechaSalida(new java.util.Date(rs.getDate("fecha_salida").getTime()));
				sub.setFechaCierre(new java.util.Date(rs.getDate("fecha_cierre").getTime()));

				Date d = rs.getDate("fecha_puja_actual");
				if(d != null)
					sub.setFechaPujaActual(new java.util.Date(d.getTime()));

				sub.setPujadorActual(obtenerUsuario(rs.getString("pujador_actual")));

				subs.add(sub);
            }

            ps.close();
        } catch (SQLException ex) { }

		return (Subasta[])subs.toArray(new Subasta[]{});
	}

    public Subasta[] obtenerSubastasLideradas(String u)
	{
		ArrayList<Subasta> subs = new ArrayList<Subasta>();
		try {
            String consulta = "SELECT * FROM DAD.SUBASTAS WHERE pujador_actual='"+u+"' ORDER BY fecha_cierre";

            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
				Subasta sub = new Subasta();
				sub.setId(rs.getInt("id"));
				sub.setNombre(rs.getString("nombre"));
				sub.setSubastador(obtenerUsuario(rs.getString("subastador")));
				sub.setDescripcion(rs.getString("descripcion"));
				sub.setCategoria(rs.getString("categoria"));
				sub.setPrecioSalida(rs.getDouble("precio_salida"));
				sub.setPujaActual(rs.getDouble("puja_actual"));
				sub.setPrecioCompra(rs.getDouble("precio_compra"));

				sub.setFechaSalida(new java.util.Date(rs.getDate("fecha_salida").getTime()));
				sub.setFechaCierre(new java.util.Date(rs.getDate("fecha_cierre").getTime()));

				Date d = rs.getDate("fecha_puja_actual");
				if(d != null)
					sub.setFechaPujaActual(new java.util.Date(d.getTime()));

				sub.setPujadorActual(obtenerUsuario(rs.getString("pujador_actual")));

				subs.add(sub);
            }

            ps.close();
        } catch (SQLException ex) { }

		return (Subasta[])subs.toArray(new Subasta[]{});
	}

	public Subasta obtenerSubasta(int id)
	{
		Subasta sub = null;
		try {
            String consulta = "SELECT * FROM DAD.SUBASTAS WHERE ID="+id;

            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
				sub = new Subasta();
				sub.setId(id);
				sub.setNombre(rs.getString("nombre"));
				sub.setSubastador(obtenerUsuario(rs.getString("subastador")));
				sub.setDescripcion(rs.getString("descripcion"));
				sub.setCategoria(rs.getString("categoria"));
				sub.setPrecioSalida(rs.getDouble("precio_salida"));
				sub.setPujaActual(rs.getDouble("puja_actual"));
				sub.setPrecioCompra(rs.getDouble("precio_compra"));

				sub.setFechaSalida(new java.util.Date(rs.getDate("fecha_salida").getTime()));
				sub.setFechaCierre(new java.util.Date(rs.getDate("fecha_cierre").getTime()));

				Date d = rs.getDate("fecha_puja_actual");
				if(d != null)
					sub.setFechaPujaActual(new java.util.Date(d.getTime()));

				sub.setPujadorActual(obtenerUsuario(rs.getString("pujador_actual")));
            }

            ps.close();
        } catch (SQLException ex) { }

		return sub;
	}

	public boolean insertarSubasta(Subasta s)
	{
		boolean resultado = false;
		try {
			String columnas = "INSERT INTO DAD.SUBASTAS (NOMBRE,SUBASTADOR,DESCRIPCION,CATEGORIA,PRECIO_SALIDA,PUJA_ACTUAL,PRECIO_COMPRA,FECHA_SALIDA,FECHA_CIERRE,FECHA_PUJA_ACTUAL,PUJADOR_ACTUAL) VALUES ";
			StringBuffer values = new StringBuffer("(");

			values.append("'"+s.getNombre()+"'");
			values.append(",'"+s.getSubastador().getUsuario()+"'");
			if(s.getDescripcion() != null)
				values.append(",'"+s.getDescripcion()+"'");
			else
				values.append(",NULL");
			if(s.getCategoria() != null)
				values.append(",'"+s.getCategoria()+"'");
			else
				values.append(",DEFAULT");
			values.append(","+s.getPrecioSalida());
			values.append(","+s.getPujaActual());
			values.append(","+s.getPrecioCompra());

			Timestamp ts = new Timestamp(s.getFechaSalida().getTime());
			values.append(",'"+ts+"'");
			ts.setTime(s.getFechaCierre().getTime());
			values.append(",'"+ts+"'");
			if (s.getFechaPujaActual() != null) {
				ts.setTime(s.getFechaPujaActual().getTime());
				values.append(",'"+ts+"'");
			} else
				values.append(",NULL");
			if (s.getPujadorActual() != null)
				values.append(",'"+s.getPujadorActual().getUsuario()+"'");
			else
				values.append(",NULL");

			values.append(")");

            PreparedStatement ps = conexion.prepareStatement(columnas+values.toString());
            int f = ps.executeUpdate();
            resultado = f > 0;

            ps.close();
        } catch (SQLException ex) { }

        return resultado;
	}

	public boolean borrarSubasta(int id)
	{
		boolean resultado = false;
		try {
			String consulta = "DELETE FROM DAD.SUBASTAS WHERE ID="+id;

            PreparedStatement ps = conexion.prepareStatement(consulta);
            int f = ps.executeUpdate();
            resultado = f > 0;

            ps.close();
        } catch (SQLException ex) { }

        return resultado;
	}

	public boolean actualizarSubasta(Subasta s)
	{
		boolean resultado = false;
		try {
			String columnas = "UPDATE DAD.SUBASTAS SET ";
			StringBuffer values = new StringBuffer();

			values.append("NOMBRE='"+s.getNombre()+"'");
			values.append(",SUBASTADOR='"+s.getSubastador().getUsuario()+"'");
			if(s.getDescripcion() != null)
				values.append(",DESCRIPCION='"+s.getDescripcion()+"'");
			else
				values.append(",DESCRIPCION=NULL");
			if(s.getCategoria() != null)
				values.append(",CATEGORIA='"+s.getCategoria()+"'");
			else
				values.append(",CATEGORIA=DEFAULT");
			values.append(",PRECIO_SALIDA="+s.getPrecioSalida());
			values.append(",PUJA_ACTUAL="+s.getPujaActual());
			values.append(",PRECIO_COMPRA="+s.getPrecioCompra());

			Timestamp ts = new Timestamp(s.getFechaSalida().getTime());
			values.append(",FECHA_SALIDA='"+ts+"'");
			ts.setTime(s.getFechaCierre().getTime());
			values.append(",FECHA_CIERRE='"+ts+"'");
			if (s.getFechaPujaActual() != null) {
				ts.setTime(s.getFechaPujaActual().getTime());
				values.append(",FECHA_PUJA_ACTUAL='"+ts+"'");
			} else
				values.append(",FECHA_PUJA_ACTUAL=NULL");
			if (s.getPujadorActual() != null)
				values.append(",PUJADOR_ACTUAL='"+s.getPujadorActual().getUsuario()+"'");
			else
				values.append(",PUJADOR_ACTUAL=NULL");

			values.append(" WHERE ID="+s.getId());

            PreparedStatement ps = conexion.prepareStatement(columnas+values.toString());
            int f = ps.executeUpdate();
            resultado = f > 0;

            ps.close();
        } catch (SQLException ex) { }

        return resultado;
	}
}
