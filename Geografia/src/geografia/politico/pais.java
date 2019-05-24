
package geografia.politico;


public class pais {

    private String NombrePais;
    private String Capital;
    private int extension;
    private String Moneda;
    private int Habitantes;

    public pais(String NombrePais, String Capital, int extension, String Moneda, int Habitantes) {
        this.NombrePais = NombrePais;
        this.Capital = Capital;
        this.extension = extension;
        this.Moneda = Moneda;
        this.Habitantes = Habitantes;
    }

    public String getNombrePais() {
        return NombrePais;
    }

    public void setNombrePais(String NombrePais) {
        this.NombrePais = NombrePais;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String Capital) {
        this.Capital = Capital;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public String getMoneda() {
        return Moneda;
    }

    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }

    public int getHabitantes() {
        return Habitantes;
    }

    public void setHabitantes(int Habitantes) {
        this.Habitantes = Habitantes;
    }

    @Override
    public String toString() {
        return "pais{" + "NombrePais=" + NombrePais + ", Capital=" + Capital + ", extension=" + extension + ", Moneda=" + Moneda + ", Habitantes=" + Habitantes + '}';
    }
    
    
    
    
}
