/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesubastas.acceso;

import java.security.MessageDigest;

/**
 *
 * @author 
 */
public class HerramientaCifrado
{
    public static String cifrar(String stringParaCifrar)
    {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return new String(md.digest(stringParaCifrar.getBytes()));
        } catch (Exception ex) {
            return "";
        }
    }
}
