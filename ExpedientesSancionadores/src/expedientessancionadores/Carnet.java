
package expedientessancionadores;
import java.time.LocalDateTime;
import java.io.Serializable;
/**
 *
 * @author f.rivero.2016
 */
public class Carnet implements Serializable {
    private String dni;
    private LocalDateTime fecha_obtencion;
    private LocalDateTime fecha_caducidad;
    private boolean gafas_lentillas;
    public Carnet(){
        
    }
    public Carnet(String dni, LocalDateTime fecha_obtecion,LocalDateTime fecha_caducidad,boolean gafas_lentillas){
        this.dni=dni;
        this.fecha_caducidad=fecha_caducidad;
        this.fecha_obtencion=fecha_obtencion;
        this.gafas_lentillas=gafas_lentillas;
    }
    
    public String getDni(){
        return dni;
    }
    
    public LocalDateTime getFecha_obtencion(){
        return fecha_obtencion;
    }
    
    public LocalDateTime getFecha_caducidad(){
        return fecha_caducidad;
    }  
    
    public boolean getGafas_lentillas(){
        return gafas_lentillas;
    }
    
    public void setFecha_caducidad(LocalDateTime fecha_caducidad){
        this.fecha_caducidad = fecha_caducidad;
    }

    public boolean isGafas_lentillas() {
        return gafas_lentillas;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFecha_obtencion(LocalDateTime fecha_obtencion) {
        this.fecha_obtencion = fecha_obtencion;
    }

    public void setGafas_lentillas(boolean gafas_lentillas) {
        this.gafas_lentillas = gafas_lentillas;
    }
    
    
    @Override
    public String toString(){
    String auxString;
        if(gafas_lentillas == false){auxString = "No";}
        else{auxString = "Sí";}
        return (" DNI: " + dni +" Fecha de obtención: " + fecha_obtencion + " Fecha de caducidad: " + fecha_caducidad + " Gafas o lentillas: " + auxString);
    }
}
