package bai5_2;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return base.area() * height;  // Volume = base area * height
    }

    public String getBaseColor() {
        return base.getColor();
    }
}


