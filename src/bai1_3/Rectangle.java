package bai1_3;

public class Rectangle {
   private float lenght;
   private float width;

   Rectangle() {
       this.lenght = 1.0f;
       this.width = 1.0f;
   }
   Rectangle(float lenght, float width) {
       this.lenght = lenght;
       this.width = width;
   }
   public float getLenght() {
       return lenght;
   }
   public void setLenght(float lenght) {
       this.lenght = lenght;
   }
   public float getWidth() {
       return width;
   }
   public void setWidth(float width) {
       this.width = width;
   }
   public float getArea() {
       return width * lenght;
   }
   public float getPerimeter() {
       return 2 * lenght * width;
   }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                '}';
    }
}
