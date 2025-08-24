package me.gonzager.ex.operaciones;

public class Ciudad {
    private static Ciudad instance = new Ciudad();
    private Integer cantDrones = 10;

    private Ciudad() {}

    public static Ciudad getInstance() {
        return instance;
    }

    public void setCantDrones(Integer cantDrones) {
        this.cantDrones = cantDrones;
    }

    public Integer getCantDrones() {
        return cantDrones;
    }
    
    
}
