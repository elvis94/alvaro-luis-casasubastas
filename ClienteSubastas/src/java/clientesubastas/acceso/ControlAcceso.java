/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesubastas.acceso;

import clientesubastas.SessionBean1;
import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author Louis
 */
public class ControlAcceso implements PhaseListener
{

    private static final String USER_LOGIN_OUTCOME = "login";
    private static final String USER_HOME_OUTCOME = "home";
    
	public void afterPhase(PhaseEvent event)
	{
		// Comprobar si el usuario ha iniciado la sesión y actuar en consecuencia
        /*FacesContext context = event.getFacesContext();

        if((context!=null) && sesionIniciada(context))
        {
            // si ha iniciado -> acceder a todo menos login y registro
            if(navegandoPublicas(context))
            {
                context.responseComplete();
                context.getApplication().getNavigationHandler().
                        handleNavigation(context, null, USER_HOME_OUTCOME);
            }
        }
        else
        {
            // no ha iniciado -> sólo acceder a listapublica, login y registro
            if (navegandoPrivadas(context))
            {
                context.responseComplete();
                context.getApplication().getNavigationHandler().
                        handleNavigation(context, null, USER_LOGIN_OUTCOME);
            }
        }*/
	}

	public void beforePhase(PhaseEvent event) { }

	// <editor-fold defaultstate="collapsed" desc="Get phase id">
	public PhaseId getPhaseId()
	{
		return PhaseId.RESTORE_VIEW;
	}
	// </editor-fold>

    private boolean sesionIniciada(FacesContext context)
    {
        ExternalContext extContext = context.getExternalContext();
        Map<String,Object> mapa = extContext.getSessionMap();

        SessionBean1 sb1 = (SessionBean1) mapa.get("SessionBean1");
        /*//sb1.getDatosPersonalesSesion().getUsuario();
        String s = "";
        if(sb1.getDatosPersonalesSesion() != null) s = sb1.getDatosPersonalesSesion().getUsuario();
        System.out.println("Sesion iniciada con "+s);*/

        if(sb1 == null) return false;
        return sb1.getDatosPersonalesSesion() != null;
    }

    private boolean navegandoPublicas(FacesContext context) {
        ExternalContext extContext = context.getExternalContext();
        String path = extContext.getRequestPathInfo();
        boolean condicion;
        condicion = "/NuevoCliente.jsp".equals(path) || "/IniciarSesion.jsp".equals(path);
        return condicion;
    }

    private boolean navegandoPrivadas(FacesContext context) {
        ExternalContext extContext = context.getExternalContext();
        String path = extContext.getRequestPathInfo();
        boolean condicion;
        condicion = "/VerSubastas.jsp".equals(path) ||
                "/NuevoCliente.jsp".equals(path) || "/IniciarSesion.jsp".equals(path);
        return !condicion;
    }
}
