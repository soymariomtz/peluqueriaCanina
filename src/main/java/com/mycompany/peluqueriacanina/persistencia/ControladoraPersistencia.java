
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;


public class ControladoraPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        //Se crea el Duenio en la DB
        duenioJpa.create(duenio);
        
        
        
        //Crea la Mascota en la DB
        mascoJpa.create(masco);
    }
    
    
    
    
}
