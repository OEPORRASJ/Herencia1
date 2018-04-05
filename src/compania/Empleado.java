
package compania;


public class Empleado extends Contrato {
    protected String nombre;
    protected double salario;
    
    public Empleado(int id, String nombre, double salario){
        super(id);
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public double calcularSalario(){
        return this.salario;
    }
    
}
