/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.tesoreria.entity.interfaces;

import mx.zazil.entity.Catalogo;
import mx.zazil.tesoreria.entity.detalle.EstatusVigenciaDetalle;

/**
 *
 * @author Hector Rodriguez
 */
public interface DivisaInterface extends Catalogo{
    public String getClaveDivisa();
    @Override
    public String getDescripcion();
    public EstatusVigenciaDetalle getEstatus();
    public String getSimbolo();
}
