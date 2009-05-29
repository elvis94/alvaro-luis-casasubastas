/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesubastas.servicios;

import java.util.List;
import services.*;

/**
 *
 * @author Louis
 */
public class ServicioWebSubastas {

    public static List<Subasta> subastasPublicas()
    {
        try { // Call Web Service Operation
            services.ServicioSubastasService service = new services.ServicioSubastasService();
            services.ServicioSubastas port = service.getServicioSubastasPort();
            // TODO process result here
            List<services.Subasta> result = port.subastasPublicas();
            System.out.println(result.size()+" ELEMENTOS");
            return result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            return null;
        }
    }

    public static List<Subasta> subastasMias(String usuario, String password)
    {
        try { // Call Web Service Operation
            services.ServicioSubastasService service = new services.ServicioSubastasService();
            services.ServicioSubastas port = service.getServicioSubastasPort();
            // TODO process result here
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
            ServicioSubastasService service = new services.ServicioSubastasService();
            ServicioSubastas port = service.getServicioSubastasPort();

            return port.crearCliente(user);

        } catch (Exception ex) {
            return false;
        }

    }

    public static boolean usuarioUsado(String usuario)
    {
        boolean isInserted = true;

        try {
            services.ServicioSubastasService service = new services.ServicioSubastasService();
            services.ServicioSubastas port = service.getServicioSubastasPort();

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
            services.ServicioSubastasService service = new services.ServicioSubastasService();
            services.ServicioSubastas port = service.getServicioSubastasPort();

            resultado = port.comprobarCliente(usuario, password);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        return resultado;
    }
}
