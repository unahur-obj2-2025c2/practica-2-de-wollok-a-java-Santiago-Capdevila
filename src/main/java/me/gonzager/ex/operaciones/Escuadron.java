package me.gonzager.ex.operaciones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.drones.Dron;

public class Escuadron {
    private List<Dron> drones = new ArrayList<Dron>();

    public Escuadron(List<Dron> drones) {
        this.drones = drones;
    }

    public void agregar(Dron unDron) {
        if (drones.size() >= Ciudad.getInstance().getCantDrones()) {
            throw new IllegalArgumentException("Supera la cantidad máxima de drones");
        }

        drones.add(unDron);
    }

    public void operar(Zona unaZona) {
        if (puedeOperar(unaZona)) {
            unaZona.recibirOperacion();
            drones.stream().forEach(d -> d.disminuirAutonomía());
        }
    }

    public Boolean puedeOperar(Zona unaZona) {
        return hayUnAvanzado() && superaElDoble(unaZona.getTamaño());
    }

    private Boolean hayUnAvanzado() {
        return drones.stream().anyMatch(dron -> dron.esAvanzado());
    }

    private Boolean superaElDoble(Integer tamaño) {
        return this.capacidadOperativaEscuadron() > 2 * tamaño;
    }

    private Integer capacidadOperativaEscuadron() {
        return drones.stream().map(dron -> dron.eficienciaOperativa()).reduce(0, Integer::sum);
    }
}
