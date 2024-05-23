/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemanomina;

/**
 *
 * @author Krister
 */
public class EmpleadoXHoras extends Empleado{
    
    private double sueldo; //sueldo por hora
    private double horas; //horas trabajadas

    public EmpleadoXHoras(String nombre, String apellido, String dni, double salarioXhoras, double horasTrabajadas) {
        super(nombre, apellido, dni);
        setSueldo(salarioXhoras);
        setHoras(horasTrabajadas);
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public void setSueldo(double su){
        if(su>=0.0){
            sueldo = su;
        } else {
            sueldo = 0.0;
        }
    }
    
    public double getHoras(){
        return horas;
    }
    
    public void setHoras(double hrs){
        if(hrs>=0 && hrs<=168){
            horas = hrs;
        }else{
            horas = 0;
        }
    }

    @Override
    public double ingresos() {
        if(getHoras()<=40){
            return getSueldo()*getHoras();
        }else{
            return 40*getSueldo()+(getHoras()-40)*getSueldo()*1.5;
        }
    }
    
    @Override
    public String toString(){
        return String.format("Empleado por horas: %s\n%s: $%,.2f", super.toString(), "Sueldo por Hora", getSueldo(), "Horas Trabajadas", getHoras());
    }
    
}
