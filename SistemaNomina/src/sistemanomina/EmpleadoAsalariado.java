/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemanomina;

/**
 *
 * @author Krister
 */
public class EmpleadoAsalariado extends Empleado {
    
    private double salario;

    public EmpleadoAsalariado(String nombre, String apellido, String dni, double salario) {
        super(nombre, apellido, dni);
        setSalarioSemanal(salario);
    }

    @Override
    public double ingresos() {
        return getSalarioSemanal();
    }
    
    public void setSalarioSemanal(double sal){
        salario = sal;
    }
    
    public double getSalarioSemanal(){
        return salario;
    }
    
    @Override
    public String toString(){
        return String.format("Empleado asalariado: %s\n%s,.2f", super.toString(), "Salario Semanal ", getSalarioSemanal());
    }
}
