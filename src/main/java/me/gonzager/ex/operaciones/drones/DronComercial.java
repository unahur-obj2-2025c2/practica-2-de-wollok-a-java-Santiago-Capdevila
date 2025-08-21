package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public class DronComercial extends Dron{

    public DronComercial(Double autonomia, Integer procesamiento, Mision mision) {
        super(autonomia, procesamiento, mision);
    }

    public DronComercial(Double autonomia, Integer procesamiento) {
        super(autonomia, procesamiento);

    }
    
    @Override
    public Boolean esAvanzadoSegunTipo() {
        return Boolean.FALSE;
    }
}
