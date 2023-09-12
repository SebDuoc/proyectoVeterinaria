/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veterinaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        Validaciones val = new Validaciones();
       
        boolean vacuna = false;
       
        System.out.println("Codigo (ejemplo: MA001): ");
        String codigo = lector.nextLine();
        
        if (val.validarCod(codigo)){
            System.out.println("Raza: ");
            String raza = lector.nextLine();
            
            if (val.validarRaza(raza)){
                System.out.println("Nombre: ");
                String nombre = lector.nextLine();
                
                if (val.validarNombre(nombre))
                {
                    System.out.println("Fecha de Nacimiento: ");
                    String fechaIngre = lector.nextLine();            
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate fecha = LocalDate.parse(fechaIngre, formato);
                    
                    if (val.validarFechaNac(fecha)){
                        Mascota mascota = new Mascota(codigo, raza, nombre, fecha);
                        System.out.println("......................................");
                        System.out.println("ID Vacunacion: ");
                        int id = lector.nextInt();
                        
                        System.out.println("Fecha de Vacunacion: ");
                        String fechaIngreVac = lector.nextLine();
                        fechaIngreVac = lector.nextLine();
                        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate fechaVac = LocalDate.parse(fechaIngreVac, format);
                        
                        if(val.validarFechaVac(fechaVac)){
                            System.out.println("Tipo de Vacuna (T: Triple, S:Sextuple, A:Antirrabica, O: Otra): ");
                            String tipoVac = lector.nextLine();
                            String tipoVacu = tipoVac.toUpperCase();
                            switch (tipoVacu) {
                                case "T" -> tipoVacu = "Triple";
                                case "S" -> tipoVacu = "Sextuple";
                                case "A" -> tipoVacu = "Antirrabica";
                                case "O" -> tipoVacu = "Otra";
                                default -> System.out.println("Valor ingresado incorrecto.");
                            }
                            
                            System.out.println("Costo de la Vacuna: ");
                            int costoVac = lector.nextInt();
                            if (val.validarCostoVacuna(costoVac)){
                                System.out.println("Esta vacunado? ");
                                String vac = lector.nextLine();
                                vac = lector.nextLine();
                                String vacu = vac.toLowerCase();
                                if (vacu.equals("si")){
                                    vacuna = true;
                                }else if (vacu.equals("no")){
                                    vacuna = false;
                                }
                                
                                System.out.println("Costo Insumos: ");
                                int costoIn = lector.nextInt();
                                if (val.validarCostoInsumo(costoIn)){
                                    Vacunacion vacunacion = new Vacunacion(id, costoVac, costoIn, mascota, fechaVac, tipoVac, vacuna);
                                    vacunacion.imprimirDatos();                                                                    
                                }else{
                                    System.out.println("El costo de los insumos debe ser superior a los $1.000 e inferior a $ 40.000.");
                                }
                                
                            }else {
                                System.out.println("El costo debe ser mayor a $10.000");
                            }
                            
                        }else{
                            System.out.println("Debe ingresar valores.");
                        }                      
                    }else{
                        System.out.println("Debe ingresar valores.");
                    }
                }else{
                    System.out.println("Debe ingresar valores.");
                }
                
            }else{
                System.out.println("Debe ingresar valores.");
            }
                
        }else{
            System.out.println("Debe ingresar valores.");
        }
    }   
}
