package dominio;

public class VehiculoTurismo extends Vehiculo{
    private int plaza;
     public double precioFinal(){
       
        if (plaza<=5) {

            System.out.println("El precio final del vehiculo es de "+precio);
            return precio;
        }else{
            int aumento = plaza - 5;
            precio += ((aumento*0.10)*precio);
            
        }return precio;
            
    }

    public VehiculoTurismo(String marca, String modelo, double precio, int plaza){

        super(marca, modelo, precio);
        this.plaza = plaza;
    }

    
    public void setPrecio(double precio){
       this.precio = precioFinal();
    }

    public void setMarca(String marca){
       this.marca = marca;
    }

    public void setModelo(String modelo){
       this.modelo = modelo;
    }

    public void setPlaza(int plaza){
        this.plaza = plaza;
    }

    public double getPrecio(){
        return precio;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
    
    public int getPlaza(){

        return plaza;
    }

    public String toString(){
    return "marca del vehiculo Turismo:"+marca+"\t modelo del Vehiculo turismo:"+modelo+"\t numero de plaza:"+plaza+" \t precio del Vehiculo:"+precio;
       }
}


