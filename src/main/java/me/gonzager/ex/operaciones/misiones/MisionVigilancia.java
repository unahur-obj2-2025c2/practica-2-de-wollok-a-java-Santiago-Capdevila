package me.gonzager.ex.operaciones.misiones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.drones.Dron;
import me.gonzager.ex.operaciones.sensores.Sensor;

public class MisionVigilancia implements Mision{
    private List<Sensor> sensores = new ArrayList<>();

    public MisionVigilancia(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    public void setSensores(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    public Boolean tieneSensorConMejorasTecnologicas() {
        return this.sensores.stream().anyMatch(sensor -> sensor.getConMejoras());
    }

    @Override
    public Integer eficienciaOperativa() {
        return sensores.stream().map(s -> s.eficiencia()).reduce(0, Integer::sum);
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return sensores.stream().allMatch(s -> s.esDuradero());
    }
}
