
package compania;

import java.util.ArrayList;


public abstract class Contrato {
    protected int id;
    
    
    
    public Contrato(int id){
        this.id = id;
    }
    
    public abstract double calcularSalario();
}
