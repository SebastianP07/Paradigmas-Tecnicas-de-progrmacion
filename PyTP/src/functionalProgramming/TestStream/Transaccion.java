/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalProgramming.TestStream;

import java.util.Date;

/**
 *
 * @author jrudascas
 */
public class Transaccion {

    int precio;
    Date fecha;
    Proveedor proveedor;

    public Transaccion(int precio, Date fecha, Proveedor proveedor) {
        this.precio = precio;
        this.fecha = fecha;
        this.proveedor = proveedor;
    }

    public int getPrecio() {
        return precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
