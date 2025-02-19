package bai6_1;

public class Square extends Rectangle {
    double side;

    public Square() {

    }
    public Square(double side) {
        this.side = side;

    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);

    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side) {
        this.side = side;

    }
    public void setLength(double side) {
        this.side = side;

    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color=" + color + ", filled=" + filled + "], width=" + width + ", length=" + length + "]]";
    }
}

