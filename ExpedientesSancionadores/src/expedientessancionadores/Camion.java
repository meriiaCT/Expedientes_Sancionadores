
package expedientessancionadores;

import java.util.*;

/**
 *
 * @author Adian Castro
 */

public class Camion extends Vehiculo{

    private String cif;
    private ArrayList <Conductor> conductores;
    
    public Camion(String matricula, String modelo, String color, Conductor conductor, String cif){
	super(matricula, modelo, color, conductor);
	this.cif = cif;
        conductores = new ArrayList <> ();
    }

    public Camion(String matricula, String modelo, String color, Conductor conductor){
	super(matricula, modelo, color, conductor);
        conductores = new ArrayList <> ();
    }

    public String getCif(){
        return cif;
    }
        
    public void addConductor(Conductor c){
        conductores.add(c);
    }
    
    @Override
    
    public String toString(){
        String auxString = "";
        for(int i = 0; i < conductores.size(); i++){
            auxString += "  Conductor " + (i+1) + ": " + conductores.get(i);
            }
        return super.toString() + "Datos de la empresa --> Cif: " + cif 
                + ". \n" + "Conductores del camión: \n" + auxString;
    }
    
}
