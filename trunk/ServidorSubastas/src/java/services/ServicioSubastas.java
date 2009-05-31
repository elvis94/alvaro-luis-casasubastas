/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import dao.SubastasDAO;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import subastas.Subasta;
import subastas.Usuario;

/**
 *
 * @author
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
	@WebMethod(operationName = "actualizarSubasta")
	public boolean actualizarSubasta(@WebParam(name = "subasta")
	Subasta subasta)
	{
		//TODO write your implementation code here:
		return subastasDAO.actualizarSubasta(subasta);
	}

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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "comprobarCliente")
    public boolean comprobarCliente(@WebParam(name = "usuario")
    String usuario, @WebParam(name = "password")
    String password) {
        //TODO write your implementation code here:
        return comprobarUsuario(usuario, password);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearSubasta")
    public boolean crearSubasta(@WebParam(name = "usuario")
    String usuario, @WebParam(name = "password")
    String password, @WebParam(name = "subasta")
    Subasta subasta) {
        //TODO write your implementation code here:
        if(comprobarUsuario(usuario, password)) {
            // Insertar el usuario
            Usuario subastador = subastasDAO.obtenerUsuario(usuario);
            subasta.setSubastador(subastador);
            // Preparar el objeto de subasta
			return subastasDAO.insertarSubasta(subasta, usuario);
        } else
			return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarSubasta")
    public Subasta consultarSubasta(@WebParam(name = "id")
    int id) {
        //TODO write your implementation code here:
        Subasta sub = subastasDAO.obtenerSubasta(id);
        if(sub != null)
        {
            sub.getSubastador().setClave(null);
            if(sub.getPujadorActual() != null)
                sub.getPujadorActual().setClave(null);
        }
        return sub;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "borrarSubasta")
    public boolean borrarSubasta(@WebParam(name = "usuario")
    String usuario, @WebParam(name = "password")
    String password, @WebParam(name = "id")
    int id) {
        //TODO write your implementation code here:
        if(comprobarUsuario(usuario, password))
			return subastasDAO.borrarSubasta(id);
		else
			return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "isUsuarioInserted")
    public Boolean isUsuarioInserted(@WebParam(name = "Usuario")
    String Usuario) {
        if(Usuario==null || Usuario.isEmpty()) return false;
        else return subastasDAO.isUsuario(Usuario);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerSubastasLideradas")
    public subastas.Subasta[] obtenerSubastasLideradas(@WebParam(name = "usuario")
    String usuario, @WebParam(name = "password")
    String password) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "pujar")
    public boolean pujar(@WebParam(name = "usuario")
    String usuario, @WebParam(name = "password")
    String password, @WebParam(name = "idSubasta")
    int idSubasta, @WebParam(name = "puja")
    double puja) {
        //TODO write your implementation code here:
        return false;
    }
}
