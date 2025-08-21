package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public abstract class Dron {
    private Integer autonomia;
    private final Integer procesamiento;
    private Mision mision;

    public Dron(Integer autonomia, Integer procesamiento) {
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
    }

    public Dron(Integer autonomia, Integer procesamiento, Mision mision) {
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
        this.mision = mision;
    }

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    public Integer getAutonomia() {
        return autonomia;
    }

    public Integer getProcesamiento() {
        return procesamiento;
    }

    public void setAutonomia(Integer autonomia) {
        this.autonomia = autonomia;
    }

    protected abstract Boolean esAvanzadoSegunTipo();

    public Integer eficienciaOperativa() {
        return mision.eficienciaOperativa() + autonomia * 10;
    }
}
