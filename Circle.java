public class Circle implements Movable{
    Point center;
    int radius;

     public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
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

    public void print() {
        System.out.println("Center: (" + center.x + "," + center.y + "), Radius: " + radius);
    }
}

