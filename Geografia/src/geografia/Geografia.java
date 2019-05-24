
package geografia;
import geografia.fisico.montaña;
import geografia.fisico.rio;
import geografia.politico.pais;

public class Geografia {


    public static void main(String[] args) {

        rio rio1 = new rio("turia", 250, 7);
        montaña montaña1=new montaña("everest", 8000, "mongolia");
        pais pais1=new pais("España","Madrid", 10000, "Euro", 40000000);
        
        System.out.println(rio1);
        System.out.println(montaña1);
        System.out.println(pais1);
        System.out.println("Este es el cambio para github. Hola Sonia");
        System.out.println("Este es el  segundo cambio para github. Hello Sonia");
    }
    
}
