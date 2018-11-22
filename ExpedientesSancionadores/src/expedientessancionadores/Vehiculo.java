
package expedientessancionadores;

/**
 *
 * @author Adrian Castro
 */

public class Vehiculo {

    private String matricula;
    private String modelo;
    private String color;
    private Conductor conductor;

    public Vehiculo(String matricula, String modelo, String color, Conductor conductor){
	this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.conductor = conductor;
    }
	
    public Conductor getConductor(){
        return conductor;
    }
	
    public String getMatricula(){
        return matricula;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getColor(){
        return color;
    }
	
    @Override
    
    public String toString(){
        return (conductor.toString() + "Datos del vehículo --> Matrícula: " + 
                matricula + ". Modelo: " + modelo + ". Color: " + color + 
                ". \n");
    }

    public boolean equals(Vehiculo v){
        if (this == v){return true;}
        if (v == null){return false;}
        if (getClass() != v.getClass()){return false;}
        Vehiculo vehiculo = (Vehiculo) v;
        return (vehiculo.getMatricula().equals(getMatricula())); 
    }
    
}
