/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_semana7;

/**
 *
 * @author leymanwu
 */
public class cliente {

    private String nombre;
    private int cedula;
    private int codigo_de_factura;
    private int productos;
    private int electricos;
    private int automotriz;
    private int construccion;

    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    cliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCodigo_de_factura() {
        return codigo_de_factura;
    }

    public void setCodigo_de_factura(int codigo_de_factura) {
        this.codigo_de_factura = codigo_de_factura;
    }

    public int getElectricos() {
        return electricos;
    }

    public void setElectricos(int electricos) {
        this.electricos = electricos;
    }

    public int getAutomotriz() {
        return automotriz;
    }

    public void setAutomotriz(int automotriz) {
        this.automotriz = automotriz;
    }

    public int getConstruccion() {
        return construccion;
    }

    public void setConstruccion(int construccion) {
        this.construccion = construccion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    private int monto;

    //Constructor
    public cliente(String nombre, int cedula, int codigo_de_factura, int productos, int electricos, int automotriz,
            int contruccion, int monto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo_de_factura = codigo_de_factura;
        this.productos = productos;
        this.electricos = electricos;
        this.automotriz = automotriz;
        this.construccion = construccion;
        this.monto = monto;

    }

}
