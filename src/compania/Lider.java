
package compania;

import java.util.ArrayList;


public class Lider extends Programador {
    private ArrayList <Programador> programadores;
    

    public Lider(int id, String nombre, double salario, String lenguaje) {
        super(id, nombre, salario, lenguaje);
    }
    
    public double calcularSalario(){
        double salarioL = this.salario + programadores.size()*this.salario*0.1;
        return salarioL;
    }
}
