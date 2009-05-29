/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesubastas;

import com.sun.rave.faces.data.DefaultTableDataModel;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.PasswordField;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.Option;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
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
 * @version NuevoCliente.java
 * @version Created on 28-abr-2009, 1:15:34
 * @author 
 */

public class NuevoCliente extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
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
    private PasswordField passClaveRepetida = new PasswordField();

    public PasswordField getPassClaveRepetida() {
        return passClaveRepetida;
    }

    public void setPassClaveRepetida(PasswordField pf) {
        this.passClaveRepetida = pf;
    }
    private TextField txtEmail = new TextField();

    public TextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(TextField tf) {
        this.txtEmail = tf;
    }
    private TextField txtLocalidad = new TextField();

    public TextField getTxtLocalidad() {
        return txtLocalidad;
    }

    public void setTxtLocalidad(TextField tf) {
        this.txtLocalidad = tf;
    }
    private TextField txtCalle = new TextField();

    public TextField getTxtCalle() {
        return txtCalle;
    }

    public void setTxtCalle(TextField tf) {
        this.txtCalle = tf;
    }
    private TextField txtNombre = new TextField();

    public TextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(TextField tf) {
        this.txtNombre = tf;
    }
    private TextField txtApellidos = new TextField();

    public TextField getTxtApellidos() {
        return txtApellidos;
    }

    public void setTxtApellidos(TextField tf) {
        this.txtApellidos = tf;
    }
    private Button btRegistrar = new Button();

    public Button getBtRegistrar() {
        return btRegistrar;
    }

    public void setBtRegistrar(Button b) {
        this.btRegistrar = b;
    }
    private Button btBorrar = new Button();

    public Button getBtBorrar() {
        return btBorrar;
    }

    public void setBtBorrar(Button b) {
        this.btBorrar = b;
    }
    private DropDown listPais = new DropDown();

    public DropDown getListPais() {
        return listPais;
    }

    public void setListPais(DropDown dd) {
        this.listPais = dd;
    }
    private StaticText outText = new StaticText();

    public StaticText getOutText() {
        return outText;
    }

    public void setOutText(StaticText st) {
        this.outText = st;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public NuevoCliente() {
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
            log("NuevoCliente Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
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
        getRequestBean1().setMensajeAyuda("Rellene el formulario con sus datos para darse de alta");
        //listPais.
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
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
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
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public String hlSubastasPublicas_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.

        return "subastasPublicas";
    }

    public String hlIniciarSesion_action() {
        // TODO: Replace with your code
        return "iniciarSesion";
    }

    public String btBorrar_action() {

        limpiarCampos();
        return "limpiar";
    }

    public String btRegistrar_action() {
        boolean res;
        res = clientesubastas.servicios.ServicioWebSubastas.nuevoUsuario(
                (String) txtUsuario.getText(),
                clientesubastas.acceso.HerramientaCifrado.cifrar((String) passClave.getText()),
                (String) txtEmail.getText(),
                (String) txtNombre.getText(),
                (String) txtApellidos.getText(),
                (String) txtCalle.getText(),
                (String) txtLocalidad.getText(),
                (String)(listPais.getValue()));



        outText.setText(res?"Usuario registrado":"Error en el servidor");

        limpiarCampos();

        return null;
    }

    public void passClaveRepetida_validate(FacesContext context, UIComponent component, Object value) {
        String s = String.valueOf(value);
        if (!s.equals((String) passClave.getLocalValue())) {
            throw new ValidatorException(new FacesMessage("Las contraseñas deben coincidir"));
        }
    }

    public void txtEmail_validate(FacesContext context, UIComponent component, Object value) {
        String s = String.valueOf(value);
        if (!s.matches("\\w+((-[A-Za-z0-9]+)|(\\.[A-Za-z0-9]+)|(\\_[A-Za-z0-9]+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z]{2,5}")) {
            throw new ValidatorException(new FacesMessage("No es una dirección de correo válida."));
        }

    }

    public void txtUsuario_validate(FacesContext context, UIComponent component, Object value) {
        String s = String.valueOf(value);
        if (s.length() < 4 || !s.matches("\\w+\\s*\\w+")) {
            throw new ValidatorException(new FacesMessage("Usuario no válidos"));
        }

        if(clientesubastas.servicios.ServicioWebSubastas.usuarioUsado(s))
            throw new ValidatorException(new FacesMessage("Usuario ya registrado, elija otro por favor"));
    }

    public void passClave_validate(FacesContext context, UIComponent component, Object value) {
        String s = String.valueOf(value);
        if (s.length() < 8) {
            throw new ValidatorException(new FacesMessage("La contraseña tiene que ser de al menos 8 caracteres"));
        }
    }

    public void txtLocalidad_validate(FacesContext context, UIComponent component, Object value) {
        String s = String.valueOf(value);
        if (s.length() < 4 || !s.matches("\\w+\\s*\\w+")) {
            throw new ValidatorException(new FacesMessage("Localidad incorrecta"));
        }
    }

    public void txtCalle_validate(FacesContext context, UIComponent component, Object value) {
        String s = String.valueOf(value);
        if (s.length() < 8) {
            throw new ValidatorException(new FacesMessage("Calle no válida"));
        }
    }

    public void txtNombre_validate(FacesContext context, UIComponent component, Object value) {
        String s = String.valueOf(value);
        if (s.length() < 4 || !s.matches("\\w+")) {
            throw new ValidatorException(new FacesMessage("Nombre inválido"));
        }
    }

    public void txtApellidos_validate(FacesContext context, UIComponent component, Object value) {
        String s = String.valueOf(value);
        if (!s.matches("\\w+\\s*\\w+")) {
            throw new ValidatorException(new FacesMessage("Apellidos no válidos"));
        }
    }

    private void limpiarCampos()
    {
        txtUsuario.resetValue();
        passClave.resetValue();
        passClaveRepetida.resetValue();
        txtEmail.resetValue();
        listPais.resetValue();
        txtLocalidad.resetValue();
        txtCalle.resetValue();
        txtNombre.resetValue();
        txtApellidos.resetValue();
    }
}

