
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Persona;


public class Controlador {
    public static void main(String[] args) {
        
        List<Persona> personas = new ArrayList<Persona>();
        
        Persona p1 = new Persona ("Isaac","Vilchez","9586668","isaac@gmail.com");
        
        personas.add(p1);
        
        for (Persona p : personas){
            System.out.println(p.getNombre() + " " + p.getApellido());
        }
    }
}
