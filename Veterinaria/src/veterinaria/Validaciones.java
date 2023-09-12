/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

import java.time.LocalDate;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public class Validaciones {
    public boolean validarCod(String codigo){
        return !"".equals(codigo);
    }
    public boolean validarRaza(String raza){
        return !"".equals(raza);
    }
    public boolean validarNombre(String nombre){
        return !"".equals(nombre);
    }
    public boolean validarFechaNac(LocalDate fechaNac){
        return fechaNac != null;
    }   
    public boolean validarFechaVac(LocalDate fechaVac){
        LocalDate fechaActual = LocalDate.now();
        return fechaVac.isBefore(fechaActual) || fechaVac.isEqual(fechaActual);       
    }    
    public boolean validarCostoInsumo(int costoIn){
        return costoIn > 1000 && costoIn < 40000;
    }   
    public boolean validarCostoVacuna(int costoVac){
        return costoVac >= 10000;
    }
}
