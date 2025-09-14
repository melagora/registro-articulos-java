package gr16078_parcial1_poo_;
public class Articulos {
    
    private int id;
    private String nombre;
    private double precio;
    private String refrigeracion ;
    private String fechaVencimiento;

    public Articulos(int id, String nombre, double precio, String refrigeracion, String fechaVencimiento) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.refrigeracion = refrigeracion;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Articulos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(String refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


}
