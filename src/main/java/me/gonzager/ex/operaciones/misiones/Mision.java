package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public interface Mision {
    Integer eficienciaOperativa();
    Boolean esAvanzadoSegunMision(Dron dron);
}
