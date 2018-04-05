
package compania;


public class Consultor extends Contrato{
    protected String labor;
    
    public Consultor(int id, String labor){
        super(id);
        this.labor = labor;
    }
    
    public double calcularSalario(){
        return 220;
    }
}