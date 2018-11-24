/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expedientessancionadores;

import java.time.*;

/**
 *
 * @author Maria Corpas
 */
public class ExpedientesSancionadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Formato de hora no definido  
    	Conductor conductor1 = new Conductor("nom1", "ap11 ap 12", "dni1", "dom1", "email@1.com", LocalDateTime.of(2000, Month.JANUARY, 1, 00, 00, 00), LocalDateTime.of(2005, Month.JANUARY, 1, 00, 00, 00), true);
      	Conductor conductor2 = new Conductor("nom2", "ap12 ap 21", "dni2", "dom2", "email@2.com", LocalDateTime.of(2010, Month.JANUARY, 1, 00, 00, 00), LocalDateTime.of(2015, Month.JANUARY, 1, 00, 00, 00), false);
        Camion camion1 = new Camion("mat1", "mod1", "col1", conductor1,"cif1");
        camion1.añadirConductor(conductor1);
        camion1.añadirConductor(conductor2);
        camion1.añadirConductor(conductor1);// Se pueden añadir conductores repetidos, aunque Camion.toString() los numere como si no estuvieran repetidos (1 == 3 en el ejemplo)
        System.out.println(conductor1.toString());
        System.out.println(conductor2.toString());
        System.out.println(camion1.toString());
        
        //Crear usuarios
        Usuario u1 = new Usuario(Tipo_Usuario_Enumeracion.AGENTE, "pass1", "Usuario1");
        Usuario u2 = new Usuario(Tipo_Usuario_Enumeracion.CONDUCTOR, "pass2", "Usuario2");
        Usuario u3 = new Usuario(Tipo_Usuario_Enumeracion.DIRECCION_PORVINCIAL, "pass3", "Usuario3");
        Usuario u4 = new Usuario(Tipo_Usuario_Enumeracion.TRABAJADOR_DGT, "pass4", "Usuario4");
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        System.out.println(u3.toString());
        System.out.println(u4.toString());

        //Crear alegaciones
        Alegacion a1 = new Alegacion("Esta es la alegacion 1 aceptada", true);
        Alegacion a2 = new Alegacion("Esta es la alegacion 2 denegada", false);
        Alegacion a3 = new Alegacion("Esta es la alegacion 3 denegada", false);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        //Añadir a la alegación 1
        a1.addAlegacion(" Estoy añadiendo a la alegacion 1");
        System.out.println(a1.toString());
        
        //Sobreescribir la alegación 2
        a2.rewriteAlegacion("Sobreescribo la alegacion 2");
        System.out.println(a2.toString());
        
        //Crear Notificaciones
        Notificacion n1 = new Notificacion(a1, "Alta velocidad", 1000);
        Notificacion n2 = new Notificacion(a2, "Drogas", 2000);
        Notificacion n3 = new Notificacion(a3, "Alcohol", 1500);
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n3.toString());
        //Crear expedientes sancionadores
        Expediente_Sancionador es1 = new Expediente_Sancionador(n1,Estado_Enumeracion.EN_PROCESO, a1);
        Expediente_Sancionador es2 = new Expediente_Sancionador(n2,Estado_Enumeracion.CONCLUIDO_CON_CARGOS, a2);
        Expediente_Sancionador es3 = new Expediente_Sancionador(n3,Estado_Enumeracion.CONCLUIDO_SIN_CARGOS, a2);
        System.out.println(es1.toString());
        System.out.println(es2.toString());
        System.out.println(es3.toString());
        
        //Modificar el estado de la alegacion
        es1.setEstado(Estado_Enumeracion.CONCLUIDO_SIN_CARGOS);
        System.out.println(es1.toString());
        
        
        
    }
    
}
