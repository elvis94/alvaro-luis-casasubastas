/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesubastas;

import clientesubastas.acceso.DatosAcceso;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import java.util.Date;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version NuevaSubasta.java
 * @version Created on 28-abr-2009, 1:19:01
 * @author Louis
 */

public class NuevaSubasta extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private TextField txtNombre = new TextField();

    public TextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(TextField tf) {
        this.txtNombre = tf;
    }
    private DropDown txtCategoria = new DropDown();

    public DropDown getTxtCategoria() {
        return txtCategoria;
    }

    public void setTxtCategoria(DropDown dd) {
        this.txtCategoria = dd;
    }
    private TextField txtPrecio = new TextField();

    public TextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(TextField tf) {
        this.txtPrecio = tf;
    }
    private Calendar txtFecha = new Calendar();

    public Calendar getTxtFecha() {
        return txtFecha;
    }

    public void setTxtFecha(Calendar c) {
        this.txtFecha = c;
    }
    private StaticText outText = new StaticText();

    public StaticText getOutText() {
        return outText;
    }

    public void setOutText(StaticText st) {
        this.outText = st;
    }
    
    private Button bBorrar = new Button();

    public Button getBBorrar() {
        return bBorrar;
    }

    public void setBBorrar(Button b) {
        this.bBorrar = b;
    }
    private TextArea txtDescripcion = new TextArea();

    public TextArea getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(TextArea ta) {
        this.txtDescripcion = ta;
    }
    private Button bCrear = new Button();

    public Button getBCrear() {
        return bCrear;
    }

    public void setBCrear(Button b) {
        this.bCrear = b;
    }
    private TextField txtCompra = new TextField();

    public TextField getTxtCompra() {
        return txtCompra;
    }

    public void setTxtCompra(TextField tf) {
        this.txtCompra = tf;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public NuevaSubasta() {
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
            log("NuevaSubasta Initialization Failure", e);
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
        getRequestBean1().setMensajeAyuda("Aquí puede definir un artículo para subastarlo");
        txtFecha.setMinDate(new Date(System.currentTimeMillis()));
        txtFecha.setMaxDate(new Date(System.currentTimeMillis()+1296000000));
        txtFecha.setSelectedDate(new Date(System.currentTimeMillis()+86400000));
        txtFecha.setValue(new Date(System.currentTimeMillis()+86400000));
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

    public String bCrear_action() {
        DatosAcceso da = getSessionBean1().getDatosPersonalesSesion();
        clientesubastas.servicios.ServicioWebSubastas.crearSubasta(
                (String)txtNombre.getText(),
                (String)txtDescripcion.getText(),
                (String)txtCategoria.getValue(),
                Double.parseDouble((String)txtPrecio.getText()),
                Double.parseDouble((String)txtCompra.getText()),
                txtFecha.getSelectedDate(),
                da.getUsuario(), da.getPassword());
        return "misSubastas";
    }

    public String bBorrar_action() {
        txtNombre.resetValue();
        txtDescripcion.resetValue();
        txtCategoria.resetValue();
        txtPrecio.resetValue();
        txtCompra.resetValue();
        txtFecha.resetValue();
        txtFecha.setValue(txtFecha.getMinDate());
        txtFecha.setSelectedDate(txtFecha.getMinDate());
        return null;
    }

    public void txtNombre_validate(FacesContext context, UIComponent component, Object value) {
        String s = String.valueOf(value);
        if (s.length() < 4 || !s.matches("\\w+")) {
            throw new ValidatorException(new FacesMessage("Nombre inválido"));
        }
    }

    public void txtDescripcion_validate(FacesContext context, UIComponent component, Object value) {
        String s = String.valueOf(value);
        if (s.length() < 10) {
            throw new ValidatorException(new FacesMessage("Descripción no válida"));
        }
    }

    public void txtPrecio_validate(FacesContext context, UIComponent component, Object value) {
        String s = String.valueOf(value);
        if (s.length() < 1 || !s.matches("\\d+\\.?\\d*")) {
            throw new ValidatorException(new FacesMessage("Precio inválido"));
        }
    }

    public String hlSubastasPublicas_action() {
        // TODO: Replace with your code
        return "subastasPublicas";
    }

    public String hlMisSubastas_action() {
        // TODO: Replace with your code
        return "misSubastas";
    }

    public String hlCerrarSesion_action() {
        // TODO: Replace with your code
        getSessionBean1().setDatosPersonalesSesion(null);
        return "subastasPublicas";
    }

    public void txtCompra_validate(FacesContext context, UIComponent component, Object value) {
        String s = String.valueOf(value);

        try{

            Double v1 = Double.parseDouble((String)txtPrecio.getLocalValue());
            if (s.length() < 1 ||
                    v1.compareTo(Double.parseDouble(s)) >= 0) {
                throw new ValidatorException(new FacesMessage("Precio de compra directa inválido"));
            }
        }catch(Exception e){
            throw new ValidatorException(new FacesMessage("Precio de compra directa inválido"));
        }
    }

    public String imghlMisSubastas_action() {
        // TODO: Replace with your code
        return "misSubastas";
    }

    public String imghlSubPublicas_action() {
        // TODO: Replace with your code
        return "subastasPublicas";
    }

    public String imghlCerrarSesion_action() {
        // TODO: Replace with your code
        getSessionBean1().setDatosPersonalesSesion(null);
        return "subastasPublicas";
    }
    
}

