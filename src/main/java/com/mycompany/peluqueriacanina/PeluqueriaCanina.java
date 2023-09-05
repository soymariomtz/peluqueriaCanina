
package com.mycompany.peluqueriacanina;

import com.mycompany.peluqueriacanina.igu.Principal;
import com.mycompany.peluqueriacanina.logica.Controladora;

public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        Principal princ = new Principal();
        
        //Se hace visible y setea lugar a la ventana.
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
        //Se instancia la persistencia.
        Controladora control = new Controladora();
        
        
    }
}
