package bai6_8;

class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;
    private int xSpeed;
    private int ySpeed;

    public MovableCircle(int x, int y, int radius, int xSpeed, int ySpeed) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle [center=" + center + ", radius=" + radius + "]";
    }
}

