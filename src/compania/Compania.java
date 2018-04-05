
package compania;

import java.util.ArrayList;


public class Compania {
    
    private ArrayList<Contrato> contratos;

    public Compania(ArrayList<Contrato> contratos) {
        this.contratos = new ArrayList<>();
    }
   
    public boolean addContrato(Contrato contrato){
        this.contratos.add(contrato);
        return true;
    }
    

    
    
}
