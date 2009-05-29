/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesubastas.acceso;

import java.io.Serializable;

/**
 *
 * @author Louis
 */
public class DatosAcceso implements Serializable
{
	private String usuario;
	private String password;

	public DatosAcceso() { }

	public DatosAcceso(String usuario, String password)
	{
		this.usuario = usuario;
		this.password = password;
	}

	public String getUsuario()
	{
		return usuario;
	}

	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
}
