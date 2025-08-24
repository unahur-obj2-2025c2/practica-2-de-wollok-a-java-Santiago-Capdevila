package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public abstract class Dron {
    private Integer autonomia;
    private final Integer procesamiento;
    private Mision mision;

    public Dron(Integer autonomia, Integer procesamiento, Mision mision) {
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
    }

    public Dron(Integer autonomia, Integer procesamiento) {
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
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

    public Boolean esAvanzado() {
        return this.esAvanzadoSegunTipo() || this.getMision().esAvanzadoSegunMision(this);
    }

    protected abstract Boolean esAvanzadoSegunTipo();

    public Integer eficienciaOperativa() {
        return mision.eficienciaOperativa() + autonomia * 10;
    }

    public void disminuirAutonomía() {
        autonomia = Integer.max(0, autonomia - 2);
    }
}
