
package geografia.fisico;


public class montaña {
    
    private String nombre;
    private int altura;
    private String pais;

    public montaña(String nombre, int altura, String pais) {
        this.nombre = nombre;
        this.altura = altura;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "monta\u00f1a{" + "nombre=" + nombre + ", altura=" + altura + ", pais=" + pais + '}';
    }
    
    
    
}
