/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.tesoreria.entity.interfaces;

import java.sql.Time;
import java.util.Date;
import mx.zazil.entity.Catalogo;

/**
 *
 * @author Hector Rodriguez
 */
public interface SituacionCuentaBancariaInterface extends Catalogo{
    @Override
    public String getDescripcion();
    public Integer getEstatusCuentaBancaria();
    public Date getFechaCaptura();
    public Time getHoraCaptura();
    public String getUsuarioCapturo();
}
