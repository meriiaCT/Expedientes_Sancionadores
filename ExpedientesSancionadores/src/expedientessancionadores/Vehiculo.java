
package expedientessancionadores;
import java.io.Serializable;
/**
 *
 * @author f.rivero.2016
 */
public abstract class Vehiculo implements Serializable {
    private String matricula;
    private String color;
    private String modelo;
    
    public Vehiculo(String matricula,String modelo,String color,Conductor conductor){
        this.matricula=matricula;
        this.color=color;
        
        this.modelo=modelo;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    
    @Override
    public String toString(){
        return "Matricula: "+matricula+" Color: "+color+" Modelo: "+modelo;
    }
    
    @Override
    public boolean equals(Object v){
        if (this == v){
            return true;
        }
        if (v == null){
            return false;
        }
        if (getClass() != v.getClass()){
            return false;
        }
        Vehiculo vehiculo = (Vehiculo) v;
        return (vehiculo.getMatricula().equals(getMatricula())); 
    }
}
