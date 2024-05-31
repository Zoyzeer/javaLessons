package org.example;
import java.time.LocalDateTime;

public class Box {

    private String from;
    private String material;
    private String color;
    private MaxLiftingCapacity maxLiftingCapacity;
    private Cargo cargo;
    private LocalDateTime deliveryDate;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public MaxLiftingCapacity getMaxLiftingCapacity() {
        return maxLiftingCapacity;
    }

    public void setMaxLiftingCapacity(MaxLiftingCapacity maxLiftingCapacity) {
        this.maxLiftingCapacity = maxLiftingCapacity;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}