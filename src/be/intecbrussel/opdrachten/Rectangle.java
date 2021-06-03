package be.intecbrussel.opdrachten;

public class Rectangle {

    /* Initialisatie tijdens declaratie */
    private static int count;
    private static final int ANGLES = 4;

    private int height = 0;
    private int width = 0;
    private int x = 0;
    private int y = 0;

    {
        count++;
    }
    public Rectangle() {}

    public Rectangle(int width,int height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public Rectangle(Rectangle rectangle){
        this(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }
    public static int getCount() {
        return count;
    }
    public static int setCount(int count){
        Rectangle.count = count;
        return count;
    }
    public static int getANGLES() {
        return ANGLES;
    }

//    public Rectangle(int height,int width,int x,int y) {
//        setHeight(height);
//        setWidth(width);
//        setX(x);
//        setY(y);
//    }

    public double getArea() {
        return height * width;
    }

    public void setHeight(int height){
        this.height = height< 0 ? -height : height;
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth() {
        return width;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void grow(int d) {
        width = width + d;
        height += d;
        if(width < 0) width = 0;
        if(height < 0) height = 0;
    }

    public double getPerimeter() {
        return width * 2 + height * 2;
    }

}


//    public final String DESCRIPTION = "Rectangle";
