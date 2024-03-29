/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesubastas.servicios;

import clientesubastas.SessionBean1;
import java.util.Date;
import java.util.List;
import services.*;

/**
 *
 * @author 
 */
public class ServicioWebSubastas {

    private static services.ServicioSubastas port=null;

    static {
        if(port==null){
            services.ServicioSubastasService service = new services.ServicioSubastasService();
            port = service.getServicioSubastasPort();
        }
    }

    public static List<Subasta> subastasPublicas()
    {
        try { // Call Web Service Operation
            List<services.Subasta> result = port.subastasPublicas();
            //System.out.println(result.size()+" ELEMENTOS");
            return result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            return null;
        }
    }

    public static List<Subasta> subastasMias(String usuario, String password)
    {
        try { // Call Web Service Operation
            java.util.List<services.Subasta> result = port.misSubastas(usuario, password);
            return result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            return null;
        }

    }

    public static boolean nuevoUsuario(String usuario, String pass,
            String email, String nombre, String apellidos, String direccion,
            String ciudad, String pais) {
        
        Usuario user = new Usuario();
        user.setUsuario(usuario);
        user.setClave(pass);
        user.setEmail(email);
        user.setNombre(nombre);
        user.setApellidos(apellidos);
        user.setDireccion(direccion);
        user.setCiudad(ciudad);
        user.setPais(pais);

        return nuevoUsuario(user);
    }

    public static boolean nuevoUsuario(Usuario user) {

        try {
            return port.crearCliente(user);

        } catch (Exception ex) {
            return false;
        }

    }

    public static boolean usuarioUsado(String usuario)
    {
        boolean isInserted = true;

        try {
            isInserted = port.isUsuarioInserted(usuario);

        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        return isInserted;
    }

    public static boolean comprobarCliente(String usuario, String password)
    {
        boolean resultado = false;

        try {
            resultado = port.comprobarCliente(usuario, password);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        return resultado;
    }

    public static boolean borrarSubasta(String usuario, String password, int id)
    {
        boolean result = false;
        try { // Call Web Service Operation
            result = port.borrarSubasta(usuario, password, id);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return result;
    }

    public static boolean crearSubasta(String nombre, String descripcion,
            String categoria, double precio, double precioCompra, Date fechaInicio,
            String usuario, String password)
    {
        Subasta s=new Subasta();
        s.setNombre(nombre);
        s.setDescripcion(descripcion);
        s.setCategoria(categoria);
        s.setPrecioSalida(precio);
        s.setPrecioCompra(precioCompra);
        s.setFechaPujaActual(null);
        s.setPujaActual(0);
        s.setPujadorActual(null);
        s.setFechaSalida(clientesubastas.acceso.UtilidadesFechas.dateToXMLGregorian(new Date()));
        s.setFechaCierre(clientesubastas.acceso.UtilidadesFechas.dateToXMLGregorian(fechaInicio));
        
        return crearSubasta(s, usuario, password);
    }

    public static boolean crearSubasta(Subasta s, String usuario, String password)
    {
        boolean result=false;

        try { 
            result = port.crearSubasta(usuario, password, s);
            
        } catch (Exception ex) {
            result =false;
        }

        return result;
    }

    public static boolean actualizarSubasta(Subasta s, String usuario, String password)
    {
        boolean resultado=false;
        try {
            resultado = port.actualizarSubasta(usuario, password, s);

        } catch (Exception ex) {
            resultado=false;
        }
        return resultado;
    }

    public static boolean modificarSubasta(int idSubasta, String descripcion, String categoria,
            String usuario, String password)
    {
        boolean resultado=false;

        try { // Call Web Service Operation
            resultado = port.modificarSubasta(usuario, password, idSubasta, descripcion, categoria);
        } catch (Exception ex) {
            return false;
        }
        return resultado;
    }

    public static boolean pujar(int idSubasta, double nuevaPuja,
            String usuario, String password)
    {
        boolean resultado=false;


        try { // Call Web Service Operation
            resultado = port.pujar(usuario, password, idSubasta, nuevaPuja);
        } catch (Exception ex) {
            return false;
        }

        return resultado;
    }

    public static List<Subasta> subastasLideradas(String usuario, String password)
    {
        try {
            java.util.List<services.Subasta> result = port.obtenerSubastasLideradas(usuario, password);
            return result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            return null;
        }

    }
}
