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
public class ServicioWebSubastas
{
    public static List<Subasta> subastasPublicas()
    {
        try { // Call Web Service Operation
            ServicioSubastasService service = new ServicioSubastasService();
            ServicioSubastas port = service.getServicioSubastasPort();
            // TODO process result here
            List<Subasta> result = port.subastasPublicas();
            return result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            return null;
        }
    }
}
