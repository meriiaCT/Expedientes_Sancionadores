
package expedientessancionadores;

/**
 *
 * @author f.rivero.2016
 */
public class Coche extends Vehiculo {
    private String modelo;
    private Conductor conductor;
    
    public Coche(String matricula, String modelo,String color,Conductor conductor){
        super(matricula,modelo,color,conductor);
        this.conductor=conductor;
    }   
    public Conductor getConductor(){
        return conductor;
    }

}
