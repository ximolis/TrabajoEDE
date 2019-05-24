
package geografia.fisico;


public class rio {
    
    private String nombre;
    private int longitud;
    private int numafluentes;

    public rio(String nombre, int longitud, int numafluentes) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.numafluentes = numafluentes;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getNumafluentes() {
        return numafluentes;
    }

    public void setNumafluentes(int numafluentes) {
        this.numafluentes = numafluentes;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + "\nlongitud = " + longitud + "\nnumafluentes = " + numafluentes ;
    }


    
    
            
}
