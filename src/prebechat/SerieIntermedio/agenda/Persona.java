
package agenda;

import java.util.HashSet;
import java.util.Set;



public class Persona {
       String nombre,nombrem,numero;
       Mascota m;
    Persona(String name,String number,String namem){
        this.nombre = name;
        this.numero = number;
        
        Mascota m = new Mascota(namem);
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public String getM() {
        nombrem=m.getNombre();
        return nombrem;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setM(Mascota m) {
        this.m = m;
    }
    
}
