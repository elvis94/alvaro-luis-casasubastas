/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesubastas.acceso;

import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Administrator
 */
public class UtilidadesFechas {

    public static Date gregorianToDate(XMLGregorianCalendar g) {
        return g.toGregorianCalendar().getTime();
    }

    public static XMLGregorianCalendar dateToXMLGregorian(Date d) {
        XMLGregorianCalendar calendar=null;
        Calendar cal = new GregorianCalendar();
        cal.setTime(d);
        try {
            calendar = DatatypeFactory.newInstance().
                    newXMLGregorianCalendar((GregorianCalendar)cal);
        } catch (DatatypeConfigurationException ex) {
            
        }

        return calendar;
    }
}


