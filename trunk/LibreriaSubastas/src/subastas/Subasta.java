/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package subastas;

import java.util.Date;

/**
 *
 * @author Louis
 */
public class Subasta
{
	private int id;
	private Usuario subastador;
	private String nombre;
	private String descripcion;
	private String categoria;

	private double precioSalida;
	private double pujaActual;
	private double precioCompra;
	/* AQUÍ NO SÉ QUÉ TIPO DE FECHA UTILIZAR */
	private Date fechaSalida;
	private Date fechaCierre;
	private Date fechaPujaActual;
	private Usuario pujadorActual;

	/**
	 * @return the subastador
	 */
	public Usuario getSubastador()
	{
		return subastador;
	}

	/**
	 * @param subastador the subastador to set
	 */
	public void setSubastador(Usuario subastador)
	{
		this.subastador = subastador;
	}

	/**
	 * @return the precioSalida
	 */
	public double getPrecioSalida()
	{
		return precioSalida;
	}

	/**
	 * @param precioSalida the precioSalida to set
	 */
	public void setPrecioSalida(double precioSalida)
	{
		this.precioSalida = precioSalida;
	}

	/**
	 * @return the pujaActual
	 */
	public double getPujaActual()
	{
		return pujaActual;
	}

	/**
	 * @param pujaActual the pujaActual to set
	 */
	public void setPujaActual(double pujaActual)
	{
		this.pujaActual = pujaActual;
	}

	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra()
	{
		return precioCompra;
	}

	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra)
	{
		this.precioCompra = precioCompra;
	}

	/**
	 * @return the fechaSalida
	 */
	public Date getFechaSalida()
	{
		return fechaSalida;
	}

	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(Date fechaSalida)
	{
		this.fechaSalida = fechaSalida;
	}

	/**
	 * @return the fechaCierre
	 */
	public Date getFechaCierre()
	{
		return fechaCierre;
	}

	/**
	 * @param fechaCierre the fechaCierre to set
	 */
	public void setFechaCierre(Date fechaCierre)
	{
		this.fechaCierre = fechaCierre;
	}

	/**
	 * @return the fechaPujaActual
	 */
	public Date getFechaPujaActual()
	{
		return fechaPujaActual;
	}

	/**
	 * @param fechaPujaActual the fechaPujaActual to set
	 */
	public void setFechaPujaActual(Date fechaPujaActual)
	{
		this.fechaPujaActual = fechaPujaActual;
	}

	/**
	 * @return the pujadorActual
	 */
	public Usuario getPujadorActual()
	{
		return pujadorActual;
	}

	/**
	 * @param pujadorActual the pujadorActual to set
	 */
	public void setPujadorActual(Usuario pujadorActual)
	{
		this.pujadorActual = pujadorActual;
	}

	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria()
	{
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria)
	{
		this.categoria = categoria;
	}
}
