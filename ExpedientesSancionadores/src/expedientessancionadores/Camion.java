
package expedientessancionadores;
import java.util.ArrayList;

/**
 *
 * @author f.rivero.2016
 */
public class Camion extends Vehiculo{
	
    private String cif;
    private ArrayList <Conductor>conductores;
    
    public Camion(String matricula, String modelo, String color, Conductor conductor, String cif){
	super(matricula, modelo,color, conductor);
	this.cif = cif;
        conductores = new ArrayList <> ();
    }            
    public String getCif(){
        return cif;
    }        
    public void añadirConductor(Conductor c){
        conductores.add(c);
    }
    public void eliminarConductor(Conductor c){
        conductores.remove(c);
    }
    public void modificarConductor(){
    }
    public ArrayList getConductores(){
        return conductores;
    }
    
    @Override
    
    public String toString(){
        String auxString = "";
        for(int i = 0; i < conductores.size(); i++){
            auxString += "  Conductor " + (i+1) + ": " + conductores.get(i);
        }
        return super.toString() + "Datos de la empresa --> Cif: " + cif + ". \n" + "Conductores del camión: \n" + auxString;
    }

}