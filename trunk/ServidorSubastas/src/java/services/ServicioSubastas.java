/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import dao.SubastasDAO;
import java.sql.*;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import subastas.Usuario;

/**
 *
 * @author Louis
 */
@WebService()
public class ServicioSubastas
{
    private SubastasDAO subastasDAO = null;

    public ServicioSubastas() {
        subastasDAO = new SubastasDAO();
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearCliente")
    public boolean crearCliente(@WebParam(name = "cliente")
    Usuario cliente)
    {
        //TODO write your implementation code here:
        return subastasDAO.insertarUsuario(cliente);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "iniciarSesion")
    public boolean iniciarSesion(@WebParam(name = "user")
    String user, @WebParam(name = "password")
    String password)
    {
        //TODO write your implementation code here:
        Usuario u = subastasDAO.obtenerUsuario(user);

        if(u == null)
            return false;

        return password.equals(u.getClave());
    }

}
