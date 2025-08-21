package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public class DronSeguridad extends Dron {

    public DronSeguridad(Integer autonomia, Integer procesamiento, Mision mision) {
        super(autonomia, procesamiento, mision);
    }

    public DronSeguridad(Integer autonomia, Integer procesamiento) {
        super(autonomia, procesamiento);
    }

    @Override
    protected Boolean esAvanzadoSegunTipo() {
        return this.getProcesamiento() > 50; 
    }

    

}
