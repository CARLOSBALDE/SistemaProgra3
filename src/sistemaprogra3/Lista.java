/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaprogra3;

/**
 *
 * @author CARLOS BALDERRAMA
 */
public class Lista {
    
    private String ID;
    private String Nombre;
    private String Correo;
    private String Edad;

    public Lista(String ID, String Nombre, String Correo, String Edad) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Edad = Edad;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getEdad() {
        return Edad;
    }
    
    
    
    
    
}
