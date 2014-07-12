/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.tesoreria.interfaces;

import java.util.List;
import mx.zazil.service.Pingeable;
import mx.zazil.tesoreria.entity.interfaces.DivisaInterface;

/**
 *
 * @author Hector Rodriguez
 */
public interface TesoreriaFondoCatalogos extends Pingeable{
    public DivisaInterface getDivisa(String id);
    public List getListaTesoreria(Class c);
}
