package gr16078_parcial1_poo_;
public class Refrigerados extends Articulos{
    
    private int rangoValido;

    public Refrigerados(int id, String nombre, double precio, String refrigeracion, String fechaVencimiento, int rangoValido) {
        super(id, nombre, precio, refrigeracion, fechaVencimiento);
        this.rangoValido = rangoValido;
    }

    public Refrigerados(int rangoValido) {
        this.rangoValido = rangoValido;
    }

    public Refrigerados() {
        super ();
    }

    public int getRangoValido() {
        return rangoValido;
    }

    public void setRangoValido(int rangoValido) {
        this.rangoValido = rangoValido;
    }
}
