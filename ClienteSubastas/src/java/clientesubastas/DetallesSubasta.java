/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesubastas;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import services.Subasta;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version DetallesSubasta.java
 * @version Created on 28-abr-2009, 1:20:19
 */

public class DetallesSubasta extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    private StaticText txtNombre = new StaticText();

    public StaticText getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(StaticText st) {
        this.txtNombre = st;
    }
    private StaticText txtID = new StaticText();

    public StaticText getTxtID() {
        return txtID;
    }

    public void setTxtID(StaticText st) {
        this.txtID = st;
    }
    private StaticText txtCategoria = new StaticText();

    public StaticText getTxtCategoria() {
        return txtCategoria;
    }

    public void setTxtCategoria(StaticText st) {
        this.txtCategoria = st;
    }
    private StaticText txtFechaCreacion = new StaticText();

    public StaticText getTxtFechaCreacion() {
        return txtFechaCreacion;
    }

    public void setTxtFechaCreacion(StaticText st) {
        this.txtFechaCreacion = st;
    }
    private StaticText txtSubastador = new StaticText();

    public StaticText getTxtSubastador() {
        return txtSubastador;
    }

    public void setTxtSubastador(StaticText st) {
        this.txtSubastador = st;
    }
    private StaticText txtFechaCierre = new StaticText();

    public StaticText getTxtFechaCierre() {
        return txtFechaCierre;
    }

    public void setTxtFechaCierre(StaticText st) {
        this.txtFechaCierre = st;
    }
    private StaticText txtPrecioSalida = new StaticText();

    public StaticText getTxtPrecioSalida() {
        return txtPrecioSalida;
    }

    public void setTxtPrecioSalida(StaticText st) {
        this.txtPrecioSalida = st;
    }
    private StaticText txtPujaActual = new StaticText();

    public StaticText getTxtPujaActual() {
        return txtPujaActual;
    }

    public void setTxtPujaActual(StaticText st) {
        this.txtPujaActual = st;
    }
    private StaticText txtPujadorActual = new StaticText();

    public StaticText getTxtPujadorActual() {
        return txtPujadorActual;
    }

    public void setTxtPujadorActual(StaticText st) {
        this.txtPujadorActual = st;
    }
    private StaticText txtFechaPujaActual = new StaticText();

    public StaticText getTxtFechaPujaActual() {
        return txtFechaPujaActual;
    }

    public void setTxtFechaPujaActual(StaticText st) {
        this.txtFechaPujaActual = st;
    }
    private TextField txfNuevaPuja = new TextField();

    public TextField getTxfNuevaPuja() {
        return txfNuevaPuja;
    }

    public void setTxfNuevaPuja(TextField tf) {
        this.txfNuevaPuja = tf;
    }
    private StaticText txtPrecioCompra = new StaticText();

    public StaticText getTxtPrecioCompra() {
        return txtPrecioCompra;
    }

    public void setTxtPrecioCompra(StaticText st) {
        this.txtPrecioCompra = st;
    }
    private TextArea txaDescripcion = new TextArea();

    public TextArea getTxaDescripcion() {
        return txaDescripcion;
    }

    public void setTxaDescripcion(TextArea ta) {
        this.txaDescripcion = ta;
    }
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    // </editor-fold>

    private Subasta subastaElegida = null;
    private Button btPujar = new Button();

    public Button getBtPujar() {
        return btPujar;
    }

    public void setBtPujar(Button b) {
        this.btPujar = b;
    }
    private Button btComprar = new Button();

    public Button getBtComprar() {
        return btComprar;
    }

    public void setBtComprar(Button b) {
        this.btComprar = b;
    }
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public DetallesSubasta() {
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
            log("DetallesSubasta Initialization Failure", e);
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
        getRequestBean1().setMensajeAyuda("En esta página puede ver los detalles de la subasta seleccionada y pujar por ella");
        if(subastaElegida != null)
        {
            txtNombre.setText(subastaElegida.getNombre());
            txtID.setText("   ("+subastaElegida.getId()+")");
            txtCategoria.setText("     ["+subastaElegida.getCategoria()+"]");
            txtFechaCreacion.setText("Fecha creación - "+subastaElegida.getFechaSalida().toString());
            txtSubastador.setText("Subastador - "+subastaElegida.getSubastador().getUsuario());
            txtFechaCierre.setText("Fecha cierre - "+subastaElegida.getFechaCierre().toString());
            txtPrecioSalida.setText("Precio salida - "+subastaElegida.getPrecioSalida()+" €");

            if(subastaElegida.getPujadorActual() != null)
            {
                txtPujaActual.setText(subastaElegida.getPujaActual()+" €");
                txtPujadorActual.setText("  "+subastaElegida.getPujadorActual().getUsuario());
                txtFechaPujaActual.setText("  ("+subastaElegida.getFechaPujaActual().toString()+")");
            }
            else
            {
                txtPujaActual.setText("Aún no se ha pujado por este objeto");
            }
            txtPrecioCompra.setText(subastaElegida.getPrecioCompra()+" €");

            txaDescripcion.setText(subastaElegida.getDescripcion());

            getSessionBean1().setSubastaModificable(subastaElegida);

            // SI ES MI SUBASTA
            // SI ESTÁ PASADA DE FECHA
            if( (false) || (false) ) {
                txfNuevaPuja.setVisible(false);
                btPujar.setVisible(false);
                btComprar.setVisible(false);
            }
        }
        else
        {
            // DESACTIVAR BOTONES
            txfNuevaPuja.setVisible(false);
            btPujar.setVisible(false);
            btComprar.setVisible(false);
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

    public String imghlSubPublicas_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "subastasPublicas";
    }

    public String imghlMisSubastas_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "misSubastas";
    }

    public String imghlNuevaSubasta_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "nuevaSubasta";
    }

    public String imghlCerrarSesion_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        getSessionBean1().setDatosPersonalesSesion(null);
        return "cerrarSesion";
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

    public void txfNuevaPuja_validate(FacesContext context, UIComponent component, Object value) {
    }
    
}

