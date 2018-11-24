
package expedientessancionadores;

/**
 *
 * @author Maria Corpas
 */
public class Notificacion {
    private Alegacion alegacion;
    private String causa;
    private int importe;
    static final String PLAZO = "1 MES";

    public Alegacion getAlegacion() {
        return alegacion;
    }

    public String getCausa() {
        return causa;
    }

    public int getImporte() {
        return importe;
    }

    public Notificacion(Alegacion alegacion, String causa, int importe) {
        this.alegacion = alegacion;
        this.causa = causa;
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Notificacion{" +"plazo="+PLAZO+"alegacion=" + alegacion + ", causa=" + causa + ", importe=" + importe + '}';
    }
    
    
}
