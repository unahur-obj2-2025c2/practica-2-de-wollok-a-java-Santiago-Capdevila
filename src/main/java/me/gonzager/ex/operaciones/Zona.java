package me.gonzager.ex.operaciones;

public class Zona {
    private Integer tamaño;
    private Integer cantOperaciones = 0;

    public Zona(Integer tamaño) {
        this.tamaño = tamaño;
    }

    public Integer getTamaño() {
        return tamaño;
    }

    public Integer getCantOperaciones() {
        return cantOperaciones;
    }

    public void recibirOperacion() {
        cantOperaciones++;
    }
}
