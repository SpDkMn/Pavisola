/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Vector;

/**
 *
 * @author Pedro
 */
public class Pedido {
    private int id;
    private String codigo;
    private int numero_orden;
    private Cliente cliente;
    private String fecha_recepcion;
    private String fecha_entrega;
    private int entregado;
    private int pagado;
    private int generado;
    private int anulado;
    private Double sub_total;
    private Double IGV;
    private Double total;
    private Vector<Producto> vp;

    public Pedido() {
    }

    public Pedido(int id, String codigo, int numero_orden, Cliente cliente, String fecha_recepcion, String fecha_entrega, int entregado, int pagado, int generado, int anulado, Double sub_total, Double IGV, Double total) {
        this.id = id;
        this.codigo = codigo;
        this.numero_orden = numero_orden;
        this.cliente = cliente;
        this.fecha_recepcion = fecha_recepcion;
        this.fecha_entrega = fecha_entrega;
        this.entregado = entregado;
        this.pagado = pagado;
        this.generado = generado;
        this.anulado = anulado;
        this.sub_total = sub_total;
        this.IGV = IGV;
        this.total = total;
    }
    
    public Vector<Producto> getVp() {
        return vp;
    }

    public void setVp(Vector<Producto> vp) {
        this.vp = vp;
    }
    
    public void setProducto(Producto p){
        this.vp.add(p);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumero_orden() {
        return numero_orden;
    }

    public void setNumero_orden(int numero_orden) {
        this.numero_orden = numero_orden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(String fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public int getEntregado() {
        return entregado;
    }

    public void setEntregado(int entregado) {
        this.entregado = entregado;
    }

    public int getPagado() {
        return pagado;
    }

    public void setPagado(int pagado) {
        this.pagado = pagado;
    }

    public int getGenerado() {
        return generado;
    }

    public void setGenerado(int generado) {
        this.generado = generado;
    }

    public int getAnulado() {
        return anulado;
    }

    public void setAnulado(int anulado) {
        this.anulado = anulado;
    }

    public Double getSub_total() {
        return sub_total;
    }

    public void setSub_total(Double sub_total) {
        this.sub_total = sub_total;
    }

    public Double getIGV() {
        return IGV;
    }

    public void setIGV(Double IGV) {
        this.IGV = IGV;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
}
