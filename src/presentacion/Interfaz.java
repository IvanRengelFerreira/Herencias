package presentacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import dominio.Concesionario;
import dominio.Furgoneta;
import dominio.VehiculoTurismo;

public class Interfaz  {
    
    private Concesionario concesionario = new Concesionario("Mi consecionario");
    private Scanner sc = new Scanner(System.in);

    public VehiculoTurismo anadirVehiculosTurismo(){
        System.out.println("Modelo del VehiculoTurismo");
        String modelo = sc.nextLine();

        System.out.println("Precio del Vehiculo");
        double precio = sc.nextDouble();
        sc.nextLine();

        System.out.println("Marca del Vehiculo");
        String marca = sc.nextLine();

        System.out.println("Cantidad de plazas del Vehiculo");
        int plaza =  sc.nextInt();
        sc.nextLine();

        VehiculoTurismo t = new VehiculoTurismo(marca, modelo, precio, plaza);
        concesionario.addTurismo(t);
        return t;
    }

    public Furgoneta anadirFurgoneta(){


        System.out.println("Modelo del Furgoneta");
        String modelo = sc.nextLine();

        System.out.println("Precio del Vehiculo");
        double precio = sc.nextDouble();
        sc.nextLine();

        System.out.println("Marca del Vehiculo");
        String marca = sc.nextLine();

        System.out.println("Cantidad de plazas del Vehiculo");
        int plaza =  sc.nextInt();
        sc.nextLine();

        Furgoneta f = new Furgoneta(marca, modelo, precio, plaza);
        concesionario.addFurgoneta(f);

        return f;
    }

     public Interfaz(){
        File f=new File("concesionario.txt");
        try {
            ObjectInputStream obj=new ObjectInputStream(new FileInputStream(f));
            concesionario=(Concesionario)obj.readObject();
            obj.close();
        } catch (Exception e) {
            concesionario = new Concesionario("Mi concesionario");
        }
    }

    public boolean procesarPeticion(String peticion){
      
        String[] p = peticion.trim().split("\\s+");
    
        // Comprobar si al menos se ingresó un comando.
        if (p.length > 0) {
            if (p[0].equalsIgnoreCase("addVehiculoTurismo")) {
                anadirVehiculosTurismo();
            }else if(p[0].equalsIgnoreCase("addFurgoneta")){
                anadirFurgoneta();
             } else if (p[0].equalsIgnoreCase("list")) {
               mostrarVehiculo();
            } else if (p[0].equalsIgnoreCase("help")) {
                System.out.println("Introduzca una de las siguientes peticiones: \n Anadir vehiculo turismo = addVehiculoTurismo \n Añadir Furgoneta = addFurgoneta  \n Mostrar consecionario = list \n salir del programa = exit ");
            } else if (p[0].equalsIgnoreCase("exit")) {
                grabar();
                return false;
            } else {
                System.out.println("Peticion erronea");
                
            }
        } else {
            System.out.println("Peticion erronea");
           
        }
        // Mostrar ayuda si hubo un error en la petición.
        System.out.println("Introduzca 'help' para obtener una lista de comandos validos.");
        return true;
    }

    public void mostrarVehiculo(){
        concesionario.mostrarVehiculos();
    }
    
    
    public String leerPeticion() {
        System.out.print("?>");
        String cadena = sc.nextLine();
        return cadena;
    }

    public void grabar(){
        File f = new File("consencionario.txt");
        try{
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(f));
            obj.writeObject(concesionario);
            obj.close();
        
        }catch (Exception e){
            System.out.println("Error al grabar");
        }

    }


}
