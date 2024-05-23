/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemanomina;

/**
 *
 * @author Krister
 */
public class EmpleadoBaseMasComision extends EmpleadoXComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String dni, double ventas, double comision, double salario) {
        super(nombre, apellido, dni, ventas, comision);
        setSalarioBase(salario);
    }
    
    public void setSalarioBase(double salario){
        if(salario < 0.0){
            salarioBase = 0.0;
        }else{
            salarioBase = salario;
        }
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public double ingresos(){
        return getSalarioBase() + super.ingresos();
    }
    
}
