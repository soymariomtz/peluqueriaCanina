package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEspecial, String nombreDuenio, String celDuenio) {
        
        //Se crea el duenio y asignamos los valores.
        Duenio duenio = new Duenio();
                
        duenio.setNombre(nombreDuenio);
        duenio.setCel_duenio(celDuenio);
        
        //Se crea la mascota y asignamos los valores.
        Mascota masco = new Mascota();
        
        masco.setNombre(nombreMasco);
        masco.setColor(color);
        masco.setRaza(raza);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEspecial);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
        
        //Se pasa los datos.
        controlPersis.guardar(duenio, masco);
    }
    
    
}
