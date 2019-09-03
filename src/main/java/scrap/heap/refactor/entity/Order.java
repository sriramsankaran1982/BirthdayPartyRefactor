package scrap.heap.refactor.entity;

import java.util.List;

public class Order {
    private String id;

    public List<Balloon> getBalloons() {
        return balloons;
    }

    public void setBalloons(List<Balloon> balloons) {
        this.balloons = balloons;
    }

    public Cake getCake() {
        return cake;
    }

    public void setCake(Cake cake) {
        this.cake = cake;
    }

    private List<Balloon> balloons;
    private Cake cake;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
