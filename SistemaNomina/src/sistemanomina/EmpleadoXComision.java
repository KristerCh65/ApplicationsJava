/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemanomina;

/**
 *
 * @author Krister
 */
public class EmpleadoXComision extends Empleado {
    
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoXComision(String nombre, String apellido, String dni, double ventas, double comision) {
        super(nombre, apellido, dni);
        setVentas(ventas);
        setComision(comision);
    }
    
    public void setVentas(double ventas){
        if(ventas>0.0){
            ventasBrutas = ventas;
        }else{
            ventasBrutas = 0.0;
        }
    }
    
    public double getVentas(){
        return ventasBrutas;
    }
    
    public void setComision(double comision){
        if(comision >0.0 && comision<1.0){
            tarifaComision = comision;
        }else{
            comision = 0.0;
        }
    }
    
    public double getComision(){
        return tarifaComision;
    }
    
    

    @Override
    public double ingresos() {
        return getComision()*getVentas();
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "Empleado por comision", super.toString(), "Ventas Brutas", getVentas(), "Tarifa de Comision", getComision());
    }
    
    
}
