package gr16078_parcial1_poo_;

public class Empacados extends Articulos {

    private double pesoEnKilogramos;

    public Empacados(int id, String nombre, double precio, String refrigeracion, String fechaVencimiento, double pesoEnKilogramos) {
        super(id, nombre, precio, refrigeracion, fechaVencimiento);
        this.pesoEnKilogramos = pesoEnKilogramos;
    }

    public Empacados(double pesoEnKilogramos) {
        this.pesoEnKilogramos = pesoEnKilogramos;
    }

    public Empacados() {
        super();
    }

    public double getPesoEnKilogramos() {
        return pesoEnKilogramos;
    }

    public void setPesoEnKilogramos(double pesoEnKilogramos) {
        this.pesoEnKilogramos = pesoEnKilogramos;
    }
}
