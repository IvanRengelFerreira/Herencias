package dominio;
import java.io.Serializable;
import java.util.ArrayList;

public class Concesionario implements Serializable{
   private String nombre;
  private ArrayList<Vehiculo> vehiculos;

    public Concesionario(String nombre){
      this.nombre = nombre;
      vehiculos = new ArrayList<Vehiculo>();
      
    }

    public Concesionario addTurismo(VehiculoTurismo c ){
      vehiculos.add(c);
      return this;
    }
   
    public Concesionario addFurgoneta(Furgoneta f){
      vehiculos.add(f);
      return this;
    }
    public void setNombre(String nombre){
      this.nombre = nombre;
    }

    public String getNombre(){
      return nombre;
    }

    public Vehiculo getVehiculoTurismo(int i){
      return vehiculos.get(i);
    }

   public double sumaVehiculos(){
    double suma = 0;
        for(Vehiculo numero : vehiculos) {
        double precio = numero.precioFinal();
        suma += precio;
        }
      return suma;
   }

   public  void mostrarVehiculos(){
      for (Vehiculo vehiculo : vehiculos){
        System.out.println(vehiculo);
      }
        System.out.println("Total Concesionario: "+sumaVehiculos());
   }

}