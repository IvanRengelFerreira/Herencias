package dominio;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double precio;

    public Vehiculo(String marca, String modelo, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precioBase;
    }

    public abstract double precioFinal();

   
}

