/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import dao.SubastasDAO;
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

//	/**
//	 * Web service operation
//	 */
//	@WebMethod(operationName = "crearSubasta")
//	public boolean crearSubasta(@WebParam(name = "subasta")
//	Subasta subasta)
//	{
//		//TODO write your implementation code here:
//		return subastasDAO.insertarSubasta(subasta);
//	}

	private boolean comprobarUsuario(String usuario, String password)
	{
		return subastasDAO.obtenerPassword(usuario).equals(password);
	}

	/**
	 * Web service operation
	 */
	@WebMethod(operationName = "misSubastas")
	public subastas.Subasta[] misSubastas(@WebParam(name = "usuario")
	String usuario, @WebParam(name = "password")
	String password)
	{
		//TODO write your implementation code here:
		if(comprobarUsuario(usuario, password))
			return subastasDAO.obtenerSubastasDeUsuario(usuario);
		else
			return null;
	}

	/**
	 * Web service operation
	 */
	@WebMethod(operationName = "subastasPublicas")
	public subastas.Subasta[] subastasPublicas()
	{
		//TODO write your implementation code here:
		return subastasDAO.obtenerTodasLasSubastasAbiertas();
	}
}
