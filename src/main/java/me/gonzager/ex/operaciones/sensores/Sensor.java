package me.gonzager.ex.operaciones.sensores;

public class Sensor {
    private final Integer capacidad;
    private final Integer durabilidad;
    private final Boolean conMejoras;

    public Sensor(Integer capacidad, Integer durabilidad, Boolean conMejoras) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.conMejoras = conMejoras;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public Integer getDurabilidad() {
        return durabilidad;
    }

    public Boolean getConMejoras() {
        return conMejoras;
    }

    public Integer eficiencia() {
        return conMejoras ? capacidad * 2 : capacidad;
    }

    public Boolean esDuradero() {
        return durabilidad > capacidad * 2;
    }
}
