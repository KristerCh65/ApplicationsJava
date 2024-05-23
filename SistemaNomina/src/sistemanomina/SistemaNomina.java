/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemanomina;

/**
 *
 * @author Krister
 */
public class SistemaNomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Juan", "Perez", "0501-1987-02145", 12000.00);
        
        EmpleadoXHoras empleadoXHoras = new EmpleadoXHoras("Angel", "Sevilla", "1513-1978-53214", 500.00, 40);
        
        EmpleadoXComision empleadoXComision = new EmpleadoXComision("Alicia", "Marinela", "1815-1995-65412", 7000.00, 0.06);
        
        EmpleadoBaseMasComision empleadoMasComision = new EmpleadoBaseMasComision("Pablo", "Ramirez", "0502-1993-15650", 8000, 0.04, 5000.00);
        
        
        System.out.println("Empleados procesados por Separado:\n");
        
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoAsalariado, "Ingresos ", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoXHoras, "Ingresos ", empleadoXHoras.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoXComision , "Ingresos ", empleadoXComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoMasComision, "Ingresos ", empleadoMasComision.ingresos());
        
        //Polimorfismo
        Empleado [] empleados = new Empleado[4];
        
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoXHoras;
        empleados[2] = empleadoXComision;
        empleados[3] = empleadoMasComision;
        
        System.out.println("Empleados procesados en forma polimorfica:\n");
        
        for(Empleado empleadoActual : empleados){
            System.out.println(empleadoActual);//invoca string
            
            if(empleadoActual instanceof EmpleadoBaseMasComision){
                
                //Conversion descendente de la referencia del empleado
                //a una referencia de EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
                
                double salarioBaseAnterior = empleado.getSalarioBase();
                empleado.setSalarioBase(1.10*salarioBaseAnterior);
                
                System.out.printf("El nuevo salario base con 10%% de aumento es: $%,.2f\n", empleado.getSalarioBase());
            }
            System.out.printf("Ingresos $%,.2f\n\n", empleadoActual.ingresos());
        }
        
        for(int e =0; e < empleados.length; e++){
            System.out.printf("El empleado %d es un %s\n",e, empleados[e].getClass().getName());
        }
    }
    
}
