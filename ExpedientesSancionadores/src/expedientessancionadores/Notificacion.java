
package expedientessancionadores;

/**
 *
 * @author Maria Corpas
 */
public class Notificacion {
    private String plazo;
    private Alegacion alegacion;
    private String causa;
    private int importe;

    public String getPlazo() {
        return plazo;
    }

    public Alegacion getAlegacion() {
        return alegacion;
    }

    public String getCausa() {
        return causa;
    }

    public int getImporte() {
        return importe;
    }

    public Notificacion(String plazo, Alegacion alegacion, String causa, int importe) {
        this.plazo = plazo;
        this.alegacion = alegacion;
        this.causa = causa;
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Notificacion{" + "plazo=" + plazo + ", alegacion=" + alegacion + ", causa=" + causa + ", importe=" + importe + '}';
    }
    
    
}
