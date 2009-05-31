/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesubastas;

import clientesubastas.acceso.DatosAcceso;
import clientesubastas.acceso.HerramientaCifrado;
import clientesubastas.servicios.ServicioWebSubastas;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.PasswordField;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextField;
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
 * @version IniciarSesion.java
 * @version Created on 18-may-2009, 17:28:49
 * @author Louis
 */

public class IniciarSesion extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    // </editor-fold>

    private DatosAcceso datosPersonalesFormularios;
    private TextField txtUsuario = new TextField();

    public TextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(TextField tf) {
        this.txtUsuario = tf;
    }
    private PasswordField passClave = new PasswordField();

    public PasswordField getPassClave() {
        return passClave;
    }

    public void setPassClave(PasswordField pf) {
        this.passClave = pf;
    }
    private StaticText outText = new StaticText();

    public StaticText getOutText() {
        return outText;
    }

    public void setOutText(StaticText st) {
        this.outText = st;
    }
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public IniciarSesion() {
        datosPersonalesFormularios = new DatosAcceso();
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
            log("IniciarSesion Initialization Failure", e);
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
        getRequestBean1().setMensajeAyuda("Introduzca sus datos para acceder al sistema");
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
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public String hlSubastasPublicas_action() {
        // TODO: Replace with your code
        return "subastasPublicas";
    }

    public String hlRegistrarse_action() {
        // TODO: Replace with your code
        return "registro";
    }

    public void txtUsuario_validate(FacesContext fc, UIComponent uic, Object o) {
        String s = String.valueOf(o);

        if(!clientesubastas.servicios.ServicioWebSubastas.usuarioUsado(s))
            throw new ValidatorException(new FacesMessage("El usuario especificado no existe"));
    }

    public String btLogin_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        datosPersonalesFormularios.setUsuario((String)txtUsuario.getText());
        datosPersonalesFormularios.setPassword(
                HerramientaCifrado.cifrar((String)passClave.getText()) );

        boolean esValido = ServicioWebSubastas.comprobarCliente(
                datosPersonalesFormularios.getUsuario(),
                datosPersonalesFormularios.getPassword());

        if(!esValido) {
            outText.setText("Log-in incorrecto");
            return null;
        }
        else {
            getSessionBean1().setDatosPersonalesSesion(datosPersonalesFormularios);
            return "sesionIniciada";
        }
    }

    public String imghlSubPublicas_action() {
        // TODO: Replace with your code
        return "subastasPublicas";
    }

    public String imghlRegistrarse_action() {
        // TODO: Replace with your code
        return "registro";
    }
    
}

