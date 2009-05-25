/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesubastas;

import com.sun.rave.web.ui.appbase.AbstractApplicationBean;
import com.sun.webui.jsf.model.Option;
import javax.faces.FacesException;

/**
 * <p>Application scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available to all users
 *  and pages in the application.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 *
 * @version ApplicationBean1.java
 * @version Created on 28-abr-2009, 1:14:02
 * @author Louis
 */

public class ApplicationBean1 extends AbstractApplicationBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    // </editor-fold>

    /**
     * <p>Construct a new application data bean instance.</p>
     */
    private Option[] paises;

    public ApplicationBean1() {
        inicializarPaises();
    }

    /**
     * <p>This method is called when this bean is initially added to
     * application scope.  Typically, this occurs as a result of evaluating
     * a value binding or method binding expression, which utilizes the
     * managed bean facility to instantiate this bean and store it into
     * application scope.</p>
     * 
     * <p>You may customize this method to initialize and cache application wide
     * data values (such as the lists of valid options for dropdown list
     * components), or to allocate resources that are required for the
     * lifetime of the application.</p>
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
            log("ApplicationBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>This method is called when this bean is removed from
     * application scope.  Typically, this occurs as a result of
     * the application being shut down by its owning container.</p>
     * 
     * <p>You may customize this method to clean up resources allocated
     * during the execution of the <code>init()</code> method, or
     * at any later time during the lifetime of the application.</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Return an appropriate character encoding based on the
     * <code>Locale</code> defined for the current JavaServer Faces
     * view.  If no more suitable encoding can be found, return
     * "UTF-8" as a general purpose default.</p>
     *
     * <p>The default implementation uses the implementation from
     * our superclass, <code>AbstractApplicationBean</code>.</p>
     */
    @Override
    public String getLocaleCharacterEncoding() {
        return super.getLocaleCharacterEncoding();
    }

    // <editor-fold defaultstate="collapsed" desc="Crear los paises">
    private void inicializarPaises()
    {
        paises= new Option[]{new Option("España"),
new Option("Afghanistán"), new Option("Albania"), new Option("Alemania"),new Option("Argeria"),
new Option("Andorra"), new Option("Angola"), new Option("Antigua y Barbuda"), new Option("Argentina"),
new Option("Armenia"), new Option("Australia"), new Option("Austria"), new Option("Azerbaiyán"),
new Option("Bahamas"), new Option("Bahréin"), new Option("Bangladesh"), new Option("Barbados"),
new Option("Bélgica"), new Option("Belice"), new Option("Benín"),
new Option("Bolivia"), new Option("Bosnia y Hercegovina"),
new Option("Brasil"), new Option("Brunei"), new Option("Bulgaria"),
new Option("Canadá"), new Option("Chile"), new Option("China"), new Option("Colombia"), new Option("Costa Rica"),
new Option("Croacia"), new Option("Cuba"), new Option("Denmark"), new Option("Ecuador"), new Option("Egipto"), 
new Option("Eslovaquia"), new Option("Eslovenia"), new Option("El Salvador"), new Option("Estados Unidos"),
new Option("Estonia"), new Option("Etiopía"), new Option("Filipinas"), new Option("Finlandia"),
new Option("Francia"),new Option("Gambia"), new Option("Georgia"), new Option("Ghana"),
new Option("Greece"), new Option("Greenland"), new Option("Grenada"), new Option("Guatemala"),
new Option("Guinea"), new Option("Haití"), new Option("Holanda"), new Option("Honduras"),
new Option("Hong Kong"), new Option("Hungría"), new Option("India"),
new Option("Indonesia"), new Option("Irán"), new Option("Iraq"), new Option("Ireland"),
new Option("Israel"), new Option("Islandia"), new Option("Italia"), new Option("Jamaica"), new Option("Japón"),
new Option("Jordania"), new Option("Kazakhstán"), new Option("Kenya"),
new Option("Korea"), new Option("Korea"), new Option("Kuwait"), new Option("Kyrgyzstan"),
new Option("Libia"), new Option("Liechtenstein"), new Option("Lituania"), new Option("Luxemburgo"),
new Option("Macedonia"), new Option("Madagascar"), new Option("Malawi"), new Option("Malasia"),
new Option("Malí"), new Option("Malta"), new Option("Marruecos"), new Option("Mauritania"), new Option("México"),
new Option("Micronesia"), new Option("Mongolia"), new Option("Mónaco"),
new Option("Mozambique"), new Option("Namibia"), new Option("Nepal"),
new Option("Nicaragua"), new Option("Niger"), new Option("Nigeria"), new Option("Noruega"),
new Option("Nueva Zelanda"), new Option("Omán"), new Option("Otro"), new Option("Pakistán"),
new Option("Panamá"), new Option("Paraguay"), new Option("Perú"),
new Option("Polonia"), new Option("Portugal"), new Option("Qatar"), new Option("Reino Unido"),
new Option("Rumania"), new Option("Rusia"), new Option("Rwanda"), new Option("Samoa"),
new Option("San Marino"), new Option("Senegal"),
new Option("Serbia y Montenegro"), new Option("Seychelles"), new Option("Sierra Leone"),
new Option("Singapúr"),  new Option("Somalia"), new Option("Sri Lanka"), new Option("Sudáfrica"),
new Option("Sudan"), new Option("Suecia"), new Option("Suiza"), new Option("Syria"),
new Option("Taiwan"), new Option("Tajikistán"),
new Option("Tanzania"), new Option("Thailandia"), new Option("Trinidad y Tobago"),
new Option("Turkia"), new Option("Uganda"), new Option("Ukrania"),
new Option("Uruguay"), new Option("Uzbekistán"), new Option("Venezuela"), new Option("Vietnam"),
new Option("Yemen"), new Option("Zambia"), new Option("Zimbagüe")
        };
        
    }
    // </editor-fold>

    /**
     * @return the paises
     */
    public Option[] getPaises() {
        return paises;
    }

    /**
     * @param paises the paises to set
     */
    public void setPaises(Option[] paises) {
        this.paises = paises;
    }
}
