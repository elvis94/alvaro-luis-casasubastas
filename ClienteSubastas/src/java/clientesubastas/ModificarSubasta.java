/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesubastas;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.HiddenField;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.model.Option;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import services.Subasta;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version ModificarSubasta.java
 * @version Created on 28-abr-2009, 1:19:32
 */

public class ModificarSubasta extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private TextArea txtDescripcion = new TextArea();

    public TextArea getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(TextArea ta) {
        this.txtDescripcion = ta;
    }

    // </editor-fold>

    private Subasta subastaElegida=null;
    private StaticText txtNombre = new StaticText();

    public StaticText getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(StaticText st) {
        this.txtNombre = st;
    }
    private DropDown txtCategoria = new DropDown();

    public DropDown getTxtCategoria() {
        return txtCategoria;
    }

    public void setTxtCategoria(DropDown dd) {
        this.txtCategoria = dd;
    }
    private StaticText txtPrecio = new StaticText();

    public StaticText getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(StaticText st) {
        this.txtPrecio = st;
    }
    private StaticText txtFecha = new StaticText();

    public StaticText getTxtFecha() {
        return txtFecha;
    }

    public void setTxtFecha(StaticText st) {
        this.txtFecha = st;
    }
    private StaticText txtPuja = new StaticText();

    public StaticText getTxtPuja() {
        return txtPuja;
    }

    public void setTxtPuja(StaticText st) {
        this.txtPuja = st;
    }
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public ModificarSubasta() {
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
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("ModificarSubasta Initialization Failure", e);
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
    public void prerender() {
        getRequestBean1().setMensajeAyuda("Aquí podrá modificar la descripción de su artículo");
        if(subastaElegida != null)
        {
            txtNombre.setText((String)subastaElegida.getNombre());
            txtPrecio.setText((String)((Double)subastaElegida.getPrecioSalida()).toString()+" €");
            txtPuja.setText((String)((Double)subastaElegida.getPujaActual()).toString()+" €");
            txtFecha.setText((String)subastaElegida.getFechaCierre().toString());
            txtDescripcion.setText((String)subastaElegida.getDescripcion());
            getSessionBean1().setSubastaModificable(subastaElegida);
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

    public void txtDescripcion_validate(FacesContext context, UIComponent component, Object value) {
        String s = String.valueOf(value);
        if (s.length() < 10) {
            throw new ValidatorException(new FacesMessage("Descripción no válida"));
        }
    }

    public String bModificar_action() {
        subastaElegida=getSessionBean1().getSubastaModificable();
        if(subastaElegida!=null)
        {
            subastaElegida.setDescripcion((String)txtDescripcion.getText());
            subastaElegida.setCategoria((String)txtCategoria.getValue());
            clientesubastas.servicios.ServicioWebSubastas.actualizarSubasta(subastaElegida);
            getSessionBean1().setSubastaModificable(null);
            subastaElegida=null;
            return "misSubastas";
        }
        return null;
    }

    /**
     * @return the subastaElegida
     */
    public Subasta getSubastaElegida() {
        return subastaElegida;
    }

    /**
     * @param subastaElegida the subastaElegida to set
     */
    public void setSubastaElegida(Subasta subastaElegida) {
        this.subastaElegida = subastaElegida;
    }

    public String hlSubastasPublicas_action() {
        // TODO: Replace with your code
        return "subastasPublicas";
    }

    public String hlMisSubastas_action() {
        // TODO: Replace with your code
        return "misSubastas";
    }

    public String hlNuevaSubasta_action() {
        // TODO: Replace with your code
        return "nuevaSubasta";
    }

    public String hlCerrarSesion_action() {
        // TODO: Replace with your code
        getSessionBean1().setDatosPersonalesSesion(null);
        return "subastasPublicas";
    }
    
}

