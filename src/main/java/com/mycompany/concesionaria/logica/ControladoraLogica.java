
package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    ControladoraPersistencia control=new ControladoraPersistencia();
    
    public void guardarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantidadPuertas) {
        Automovil auto=new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantidadPuertas);
        
        control.guardarAutomovil(auto);
    
    }
    
}
