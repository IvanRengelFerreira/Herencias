package dominio;
import java.io.Serializable;
import java.util.ArrayList;

public class Concesionario implements Serializable{
   private String nombre;
   private ArrayList<VehiculoTurismo> vehiculosTurismo;
   private ArrayList<Furgoneta> furgoneta;

    public Concesionario(String nombre){
      this.nombre = nombre;
      vehiculosTurismo = new ArrayList<VehiculoTurismo>();
      furgoneta = new ArrayList<Furgoneta>();
    }

    public Concesionario addTurismo(VehiculoTurismo c ){
      vehiculosTurismo.add(c);
      return this;
    }
   
    public Concesionario addFurgoneta(Furgoneta f){
      furgoneta.add(f);
      return this;
    }
    public void setNombre(String nombre){
      this.nombre = nombre;
    }

    public String getNombre(){
      return nombre;
    }

    public VehiculoTurismo getVehiculoTurismo(int i){
      return vehiculosTurismo.get(i);
    }

   public double sumaVehiculoTurismo(){
    double suma = 0;
        for(VehiculoTurismo numero : vehiculosTurismo) {
        double precio = numero.precioFinal();
        suma += precio;
        }
         for(Furgoneta numero2 : furgoneta) {
        double precio = numero2.precioFinal();
        suma += precio;
        }
      return suma;
   }

   public  void mostrarVehiculos(){
      for (Vehiculo vehiculo : vehiculosTurismo){
        System.out.println(vehiculo+"\n" +"Precio final: "+vehiculo.precioFinal());
      }
      for (Vehiculo f : furgoneta){
        System.out.println(f+"\n Precio final: "+f.precioFinal());
      }
        System.out.println(sumaVehiculoTurismo());
   }

}