/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compania;

/**
 *
 * @author Estudiante
 */
public class Administrador extends Empleado {
    
    public Administrador(int id, String nombre, double salario){
        super(id, nombre, salario);
    }
            
    public double calcularSalario(){
        this.salario = 100;
        return salario;
    }
}
