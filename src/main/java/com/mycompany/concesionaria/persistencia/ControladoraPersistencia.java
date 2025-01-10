
package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;

public class ControladoraPersistencia {
    AutomovilJpaController autoJpa=new AutomovilJpaController();
    
    public void guardarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }
    
}
