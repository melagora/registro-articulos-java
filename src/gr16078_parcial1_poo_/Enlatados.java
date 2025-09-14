package gr16078_parcial1_poo_;

public class Enlatados extends Articulos {

    private int contenidoEnGramos;

    public Enlatados(int id, String nombre, double precio, String refrigeracion, String fechaVencimiento, int contenidoEnGramos) {
        super(id, nombre, precio, refrigeracion, fechaVencimiento);
        this.contenidoEnGramos = contenidoEnGramos;
    }

    public Enlatados(int contenidoEnGramos) {
        this.contenidoEnGramos = contenidoEnGramos;
    }

    public Enlatados() {
        super();
    }

    public int getContenidoEnGramos() {
        return contenidoEnGramos;
    }

    public void setContenidoEnGramos(int contenidoEnGramos) {
        this.contenidoEnGramos = contenidoEnGramos;
    }
}
