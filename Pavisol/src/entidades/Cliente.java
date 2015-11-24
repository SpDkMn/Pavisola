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
public class Cliente {

    private int id;
    private String codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private String contacto;

    public Cliente(int id, String codigo, String nombre, String contacto) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public Cliente() {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public static Vector<Cliente> getAll() {
        Vector vc = null;
        try {
            BaseDatos DB = new BaseDatos();
            Statement sentencia = DB.conectar().createStatement();
            String sql = "Select * From clientes";
            ResultSet rs = sentencia.executeQuery(sql);
            vc = new Vector<Cliente>();
            while (rs.next()) {
                int ids = rs.getInt("id");
                String codigos = rs.getString("codigo");
                String nombres = rs.getString("nombre");
                String contactos = rs.getString("contacto");
                Cliente c = new Cliente(ids, codigos, nombres, contactos);
                vc.add(c);
            }
            DB.desconectar();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vc;
    }
    
    public static Cliente getCliente(int id){
        Cliente c = null;
        try {
            BaseDatos DB = new BaseDatos();
            Statement sentencia = DB.conectar().createStatement();
            String sql = "Select * From clientes WHERE id = "+id;
            ResultSet rs = sentencia.executeQuery(sql);
            while (rs.next()) {
                int ids = rs.getInt("id");
                String codigos = rs.getString("codigo");
                String nombres = rs.getString("nombre");
                String contactos = rs.getString("contacto");
                c = new Cliente(ids, codigos, nombres, contactos);
            }
        } catch (SQLException sqle){
            sqle.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", contacto=" + contacto + '}';
    }

}
