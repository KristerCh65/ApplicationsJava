/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemanomina;

/**
 *
 * @author Krister
 */
public abstract class Empleado {
    private String primerNombre;
    private String primerApellido;
    private String DNI;
    
    public Empleado(String nombre, String apellido, String dni){
        primerNombre = nombre;
        primerApellido = apellido;
        DNI = dni;
    }
    
    public void setPrimerNombre(String nombre){
        primerNombre = nombre;
    }
    
    public String getPrimerNombre(){
        return primerNombre;
    }
    
    public void setPrimerApellido(String apellido){
        primerApellido = apellido;
    }
    
    public String getPrimerApellido(){
        return primerApellido;
    }
    
    public void setDNI(String dni){
        DNI = dni;
    }
    
    public String getDNI(){
        return DNI;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s\nnumero de seguro social: %s", getPrimerNombre(), getPrimerApellido(), getDNI());
    }
    
    public abstract double ingresos();
}
