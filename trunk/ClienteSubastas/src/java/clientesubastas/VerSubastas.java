/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesubastas;

import clientesubastas.servicios.ServicioWebSubastas;
import com.sun.data.provider.RowKey;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Hyperlink;
import java.util.List;
import javax.faces.FacesException;
import services.Subasta;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version VerSubastas.java
 * @version Created on 28-abr-2009, 1:16:34
 */

public class VerSubastas extends AbstractPageBean {
	
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    // </editor-fold>

	private List<Subasta> listadoPublico;
    private Hyperlink hlIniciarSesion = new Hyperlink();

    public Hyperlink getHlIniciarSesion() {
        return hlIniciarSesion;
    }

    public void setHlIniciarSesion(Hyperlink h) {
        this.hlIniciarSesion = h;
    }
    private Hyperlink hlRegistrarse = new Hyperlink();

    public Hyperlink getHlRegistrarse() {
        return hlRegistrarse;
    }

    public void setHlRegistrarse(Hyperlink h) {
        this.hlRegistrarse = h;
    }
    private Hyperlink hlMisSubastas = new Hyperlink();

    public Hyperlink getHlMisSubastas() {
        return hlMisSubastas;
    }

    public void setHlMisSubastas(Hyperlink h) {
        this.hlMisSubastas = h;
    }
    private Hyperlink hlNuevaSubasta = new Hyperlink();

    public Hyperlink getHlNuevaSubasta() {
        return hlNuevaSubasta;
    }

    public void setHlNuevaSubasta(Hyperlink h) {
        this.hlNuevaSubasta = h;
    }
    private Hyperlink hlCerrarSesion = new Hyperlink();

    public Hyperlink getHlCerrarSesion() {
        return hlCerrarSesion;
    }

    public void setHlCerrarSesion(Hyperlink h) {
        this.hlCerrarSesion = h;
    }
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public VerSubastas() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        setListadoPublico(ServicioWebSubastas.subastasPublicas());
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("VerSubastas Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender()
	{
        getRequestBean1().setMensajeAyuda("Utilice la tabla para navegar por las subastas públicas");
        //setListadoPublico(ServicioWebSubastas.subastasPublicas());
        if(getSessionBean1().getDatosPersonalesSesion() != null) {
            hlIniciarSesion.setVisible(false);
            hlRegistrarse.setVisible(false);
        }
        else {
            hlMisSubastas.setVisible(false);
            hlNuevaSubasta.setVisible(false);
            hlCerrarSesion.setVisible(false);
        }
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1()
    {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1()
    {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1()
    {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

	/**
	 * @return the listadoPublico
	 */
	public List<Subasta> getListadoPublico()
	{
		return listadoPublico;
	}

	/**
	 * @param listadoPublico the listadoPublico to set
	 */
	public void setListadoPublico(List<Subasta> listadoPublico)
	{
		this.listadoPublico = listadoPublico;
	}

	public String hlIniciarSesion_action()
	{
		// TODO: Process the action. Return value is a navigation
		// case name where null will return to the same page.
		return "iniciarSesion";
	}

	public String hlRegistrarse_action()
	{
		// TODO: Process the action. Return value is a navigation
		// case name where null will return to the same page.
		return "registro";
	}

    public String hlCerrarSesion_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        getSessionBean1().setDatosPersonalesSesion(null);
        
        hlIniciarSesion.setVisible(true);
        hlRegistrarse.setVisible(true);

        return null;
    }

    public String hlMisSubastas_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "misSubastas";
    }

    public String hlNuevaSubasta_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "nuevaSubasta";
    }

    public String hlDetalles_action()
    {
        if( getSessionBean1().getDatosPersonalesSesion() == null)
            return "iniciarSesion";

        RowKey rk = (RowKey) getValue("#{currentRow.tableRow}");

        if(rk != null) {
            int fila = Integer.parseInt(rk.getRowId());
            Subasta s = getListadoPublico().get(fila);
            // Pasar la subasta por parámetro
            DetallesSubasta detsub = (DetallesSubasta)getBean("DetallesSubasta");
            detsub.setSubastaElegida(s);

            System.out.println("SUBASTA ENCONTRADA: "+s.getNombre());

            return "detallesSubasta";
        }

        return "detallesSubasta";
    }
    
}

