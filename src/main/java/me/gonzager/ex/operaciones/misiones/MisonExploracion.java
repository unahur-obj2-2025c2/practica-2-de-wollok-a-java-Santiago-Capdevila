package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public class MisonExploracion implements Mision{

    @Override
    public Integer eficienciaOperativa() {
        return 0;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return dron.eficienciaOperativa() % 2 == 0;
    }
}
