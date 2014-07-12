/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.tesoreria.interfaces;

import java.util.List;
import mx.zazil.service.Pingeable;
import mx.zazil.tesoreria.entity.interfaces.BancoInterface;
import mx.zazil.tesoreria.entity.interfaces.DivisaInterface;
import mx.zazil.tesoreria.entity.interfaces.SituacionCuentaBancariaInterface;
import mx.zazil.tesoreria.entity.interfaces.TipoCuentaBancariaInterface;

/**
 *
 * @author Hector Rodriguez
 */
public interface TesoreriaClientesCatalogos extends Pingeable{
    public DivisaInterface getDivisa(String id);
    public BancoInterface getBanco(Integer id);
    public SituacionCuentaBancariaInterface getSituacionCuentaBancaria(Integer id);
    public TipoCuentaBancariaInterface getTipoCuentaBancaria(Integer id);
    public List getListaTesoreria(Class c);
}
