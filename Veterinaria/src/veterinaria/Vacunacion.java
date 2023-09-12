/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public class Vacunacion {
    private int id, costoVac, costoIn;
    private Mascota mascota;
    private LocalDate fechaVac;
    private String tipoVac;
    private boolean estado;
    private int totalPagar;

    public Vacunacion() {
    }

    public Vacunacion(int id, int costoVac, int costoIn, Mascota mascota, LocalDate fechaVac, String tipoVac, boolean estado) {
        this.id = id;
        this.costoVac = costoVac;
        this.costoIn = costoIn;
        this.mascota = mascota;
        this.fechaVac = fechaVac;
        this.tipoVac = tipoVac;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCostoVac() {
        return costoVac;
    }

    public void setCostoVac(int costoVac) {
        this.costoVac = costoVac;
    }

    public int getCostoIn() {
        return costoIn;
    }

    public void setCostoIn(int costoIn) {
        this.costoIn = costoIn;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public LocalDate getFechaVac() {
        return fechaVac;
    }

    public void setFechaVac(LocalDate fechaVac) {
        this.fechaVac = fechaVac;
    }

    public String getTipoVac() {
        return tipoVac;
    }

    public void setTipoVac(String tipoVac) {
        this.tipoVac = tipoVac;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public int totalAPagar(){
        
        if (costoVac > 30000){
            costoIn -= costoIn * 0.2;
            totalPagar = costoVac + costoIn + 15000; 
            System.out.println("Total a Pagar: $" + totalPagar);
        }else
        {
            totalPagar = costoVac + costoIn + 15000;
            System.out.println("Total a Pagar: $" + totalPagar);
        }
        
        return totalPagar;
    }
    
    public void imprimirDatos(){
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                
        System.out.println("\tVETERINARIA MIPETS");
        System.out.println("-----------------------------------------");
        System.out.println("\tDATOS MASCOTA");
        System.out.println("Codigo Mascota: " + mascota.getCodigo());
        System.out.println("Nombre Mascota: " + mascota.getNombre());
        System.out.println("Edad Mascota: " + mascota.calcularEdad() + " anios.");
        System.out.println("-----------------------------------------");
        System.out.println("\tDATOS VACUNACION");
        System.out.println("ID Vacunacion: " + id);
        System.out.println("Fecha Vacunacion: " + fechaVac.format(formato));
        System.out.println("Tipo de Vacuna: " + tipoVac);
        System.out.println("Costo de la Vacuna: $" + costoVac);
        if (estado){
            System.out.println("Estado: Vacunado.");
        }else {
            System.out.println("Estado: No vacunado.");
        }
        System.out.println("Costo Insumos: $" + costoIn);
        System.out.println("-----------------------------------------");
        totalAPagar();
    }
    
}
