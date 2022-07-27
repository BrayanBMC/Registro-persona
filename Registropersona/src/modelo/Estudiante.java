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
public class Estudiante extends Persona{
    public String carrera;
    public String codigo;

    public Estudiante() {
        super();
    }

    public Estudiante(String carrera, String codigo, int id, long cedula, String nombres, String apellidos, char sexo, String nacionalidad, String correo_p) {
        super(id, cedula, nombres, apellidos, sexo, nacionalidad, correo_p);
        this.carrera = carrera;
        this.codigo = codigo;
    }

    public Estudiante(int id, long cedula, String nombres, String apellidos, char sexo, String nacionalidad, String correo_p) {
        super(id, cedula, nombres, apellidos, sexo, nacionalidad, correo_p);
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.carrera);
        hash = 53 * hash + Objects.hashCode(this.codigo);
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
        final Estudiante other = (Estudiante) obj;
        if (!Objects.equals(this.carrera, other.carrera)) {
            return false;
        }
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "Estudiante "+getNombres();
    }

    
    
    
    
}
