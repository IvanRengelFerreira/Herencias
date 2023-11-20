package dominio;

public class Furgoneta extends Vehiculo {
   private double capacidad;
    
   public Furgoneta(String marca, String modelo, double precioBase, double capacidad) {
        super(marca, modelo, precioBase);
        this.capacidad = capacidad;
    }

    public double precioFinal() {
        return precio = Math.cbrt(capacidad) *precio * 0.5;
        
    }

    public void  setCapacidad(double capacidad){
        this.capacidad = capacidad;
    }

    public double getCapacidad(){
        return capacidad;
    }

    public String toString(){
        return "marca de la furgoneta:"+marca+"\t modelo de la furgoneta:"+modelo+"\t precio de la furgoneta: "+precio+"\t capacidad de la furgoneta:"+capacidad;
       }

    
}
