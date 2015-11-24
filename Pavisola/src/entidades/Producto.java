/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import BD.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Pedro
 */
public class Producto {
    private int id;
    private String producto;
    private String unidad;
    private int cantidad;
    private Double costo;
    private Double precio;

    public Producto(int id, String producto, String unidad, int cantidad, Double costo, Double precio) {
        this.id = id;
        this.producto = producto;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.costo = costo;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductoN() {
        return producto;
    }

    public void setProductoN(String producto) {
        this.producto = producto;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public static Vector<Producto> getAll() {
        Vector vp = null;
        try {
            BaseDatos DB = new BaseDatos();
            Statement sentencia = DB.conectar().createStatement();
            String sql = "Select * From Productos";
            ResultSet rs = sentencia.executeQuery(sql);
            vp = new Vector<Producto>();
            while (rs.next()) {
                int ids = rs.getInt("id");
                String productos = rs.getString("producto");
                String unidads = rs.getString("unidad");
                int cantidads = rs.getInt("cantidad");
                Double costos = rs.getDouble("costo");
                Double precios = rs.getDouble("p_venta");
                Producto p = new Producto(ids, productos, unidads, cantidads,costos,precios);
                vp.add(p);
            }
            DB.desconectar();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vp;
    }
    
    public static Producto getProducto(int id){
        Producto p = null;
        try {
            BaseDatos DB = new BaseDatos();
            Statement sentencia = DB.conectar().createStatement();
            String sql = "Select * From productos WHERE id = "+id;
            ResultSet rs = sentencia.executeQuery(sql);
            while (rs.next()) {
                int ids = rs.getInt("id");
                String productos = rs.getString("producto");
                String unidads = rs.getString("unidad");
                int cantidads = rs.getInt("cantidad");
                Double costos = rs.getDouble("costo");
                Double precios = rs.getDouble("p_venta");
                p = new Producto(ids, productos, unidads, cantidads,costos,precios);
            }
        } catch (SQLException sqle){
            sqle.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }
    
    public static boolean updateProducto(Producto p){
        boolean flag = false;
        try {
            BaseDatos DB = new BaseDatos();
            Statement sentencia = DB.conectar().createStatement();
            String sql = "UPDATE productos SET"+
                    " producto = '"+ p.getProductoN()+"'," +
                    " unidad = '"+ p.getUnidad()+"',"  +
                    " cantidad = "+ p.getCantidad()+","+
                    " costo = "+ p.getCosto()+","+
                    " p_venta = "+ p.getPrecio()+
                    " WHERE id = "+p.getId();
            if(sentencia.executeUpdate(sql) > 0){
                flag = true;
            }
        } catch (SQLException sqle){
            sqle.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", producto=" + producto + ", unidad=" + unidad + ", cantidad=" + cantidad + ", costo=" + costo + ", precio=" + precio + '}';
    }

    
}
