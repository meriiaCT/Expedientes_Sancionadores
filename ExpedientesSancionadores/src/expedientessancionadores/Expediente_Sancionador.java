
package expedientessancionadores;

import java.io.Serializable;

/**
 *
 * @author Maria Corpas
 */

public class Expediente_Sancionador implements Serializable {
    
    private String notificacion;
    private Estado_Enumeracion estado;
    private Alegacion alegacion;

    public String getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(String notificacion) {
        this.notificacion = notificacion;
    }

    public Estado_Enumeracion getEstado() {
        return estado;
    }
    
    public void setEstado(Estado_Enumeracion estado) {
        this.estado = estado;
    }
       
    public Alegacion getAlegacion() {
        return alegacion;
    }
    
    public Expediente_Sancionador(String n, Estado_Enumeracion e, Alegacion a){
        this.notificacion = n;
        this.estado = e;
        this.alegacion = a;
    }
    
    @Override
    
    public String toString(){
        return("Notificacion " + getNotificacion() + " Estado " + getEstado() 
                + " Alegacion " + getAlegacion());
    }
    
}