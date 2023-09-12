/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public class Mascota {
    private String codigo, raza, nombre;
    private LocalDate fechaNac;
    private int edad;

    public Mascota() {
    }

    public Mascota(String codigo, String raza, String nombre, LocalDate fechaNac) {
        this.codigo = codigo;
        this.raza = raza;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
       
    public int calcularEdad(){
        LocalDate fechaActual = LocalDate.now();       
        Period periodo = Period.between(fechaNac, fechaActual);
        edad = periodo.getYears();  
        return edad;
    }  

}
