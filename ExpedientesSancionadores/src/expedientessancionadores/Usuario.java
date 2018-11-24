
package expedientessancionadores;

import java.io.Serializable;

/**
 *
 * @author Maria Corpas
 */

public class Usuario implements Serializable {
   
   private Tipo_Usuario_Enumeracion tipo;
   private String password;
   private String nombre;
   
   public String getNombre() {
       return nombre;
   }
   
   public Tipo_Usuario_Enumeracion getTipo() {
       return tipo;
   }
    
   public String getPassword() {
       return password;
   }
    
   public Usuario (Tipo_Usuario_Enumeracion t, String p, String n){
       this.tipo = t;
       this.password = p;
       this.nombre = n;
   }

    @Override
    public String toString() {
        return "Usuario{" + "tipo=" + tipo + ", password=" + password + ", nombre=" + nombre + '}';
    }
   
   
   
}
