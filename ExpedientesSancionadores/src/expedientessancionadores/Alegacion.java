
package expedientessancionadores;

/**
 *
 * @author Maria Corpas
 */

public class Alegacion {
    
    private String alegacion;
    private boolean estado;

    public String getAlegacion() {
        return alegacion;
    }

    public void setAlegacion(String alegacion) {
        this.alegacion = alegacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public Alegacion(String a, boolean e){
        this.alegacion = a;
        this.estado = e;
    }
        
    public void addAlegacion(String a){
        this.alegacion = alegacion + a;
    }
    
    public void rewriteAlegacion(String a){
        this.alegacion = a;
    }

    @Override
    public String toString() {
        return "Alegacion{" + "alegacion=" + alegacion + ", estado=" + estado + '}';
    }
    
    
    
}
