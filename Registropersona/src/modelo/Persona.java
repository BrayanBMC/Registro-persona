/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Estudiante
 */
public class Persona {

    private int id;
    private long cedula;
    private String nombres;
    private String apellidos;
    private char sexo;
    public String nacionalidad;
    protected String correo_p;

    public Persona() {
    }

    public Persona(int id, long cedula, String nombres, String apellidos, char sexo, String nacionalidad, String correo_p) {
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.correo_p = correo_p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCorreo_p() {
        return correo_p;
    }

    public void setCorreo_p(String correo_p) {
        this.correo_p = correo_p;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.id;
        hash = 31 * hash + (int) (this.cedula ^ (this.cedula >>> 32));
        hash = 31 * hash + Objects.hashCode(this.nombres);
        hash = 31 * hash + Objects.hashCode(this.apellidos);
        hash = 31 * hash + this.sexo;
        hash = 31 * hash + Objects.hashCode(this.nacionalidad);
        hash = 31 * hash + Objects.hashCode(this.correo_p);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.cedula != other.cedula) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        return Objects.equals(this.correo_p, other.correo_p);
    }

    
    
}
