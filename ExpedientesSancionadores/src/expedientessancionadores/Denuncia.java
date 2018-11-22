
package expedientessancionadores;

/**
 *
 * @author Fernando Rivero
 */

import java.time.*;
import java.io.Serializable;

public class Denuncia implements Serializable {
    //Comeentario de prubea en la clase denuncia
    private LocalDateTime fecha_hora;
    private int codigo;
    private String causa;
    private double importe;
    private static int contador=0;
    private Conductor denunciado;
    
    public Denuncia(LocalDateTime fecha_hora,String causa,double importe,Conductor denunciado){
        codigo=++contador;
        this.causa=causa;
        this.importe=importe;
        this.denunciado=denunciado;
        this.fecha_hora=fecha_hora;
    }
    public LocalDateTime getFecha_Hora(){
        return fecha_hora;
    }
    public int getCodigo(){
        return codigo;
    }
    public double getImporte(){
        return importe;
    }
    public String getCausa(){
        return causa;
    }
    public Conductor getDenunciado(){
        return denunciado;
    }
    
    @Override
    public String toString(){
        return("Denuncia --- Fecha: " + fecha_hora + " Causa: " + causa + 
                " Denunciado: " + denunciado.getNombre() + " Importe: " + 
                importe + " Codigo: " + codigo );
    }
    
}
