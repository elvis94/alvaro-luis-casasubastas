/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesubastas.acceso;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author Louis
 */
public class ControlAcceso implements PhaseListener
{

	public void afterPhase(PhaseEvent event)
	{
		// Comprobar si el usuario ha iniciado la sesión y actuar en consecuencia

		// si ha iniciado -> acceder a todo menos login y registro
		// no ha iniciado -> sólo acceder a listapublica, login y registro
	}

	public void beforePhase(PhaseEvent event) { }

	// <editor-fold defaultstate="collapsed" desc="Get phase id">
	public PhaseId getPhaseId()
	{
		return PhaseId.RESTORE_VIEW;
	}
	// </editor-fold>

}
