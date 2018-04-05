
package compania;


public class Programador extends Empleado {
    protected String lenguaje;

    public Programador(int id, String nombre, double salario, String lenguaje) {
        super(id,nombre, salario);
        this.lenguaje = lenguaje;
    }
    
    public double calcularSalario(){
        double salarioP;
        if(this.lenguaje.compareTo("Java") == 0){
            salarioP = this.salario * 1.2;
        } else {
            salarioP = this.salario;
        }
        return salarioP;
    }
    
}
