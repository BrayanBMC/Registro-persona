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
public class Docente extends Persona{
    
    public String area;
    private String tipo_v;

    public Docente() {
        super();
    }

    public Docente(String area, String tipo_v, int id, long cedula, String nombres, String apellidos, char sexo, String nacionalidad, String correo_p) {
        super(id, cedula, nombres, apellidos, sexo, nacionalidad, correo_p);
        this.area = area;
        this.tipo_v = tipo_v;
    }

    public Docente(int id, long cedula, String nombres, String apellidos, char sexo, String nacionalidad, String correo_p) {
        super(id, cedula, nombres, apellidos, sexo, nacionalidad, correo_p);
    }

    public String getTipo_v() {
        return tipo_v;
    }

    public void setTipo_v(String tipo_v) {
        this.tipo_v = tipo_v;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.area);
        hash = 79 * hash + Objects.hashCode(this.tipo_v);
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
        final Docente other = (Docente) obj;
        if (!Objects.equals(this.area, other.area)) {
            return false;
        }
        return Objects.equals(this.tipo_v, other.tipo_v);
    }

    @Override
    public String toString() {
        return "Docente "+ getNombres();
    }
    
    
    
}
