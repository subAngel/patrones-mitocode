package prototype.refactorguru.shapes;

import java.util.concurrent.RecursiveTask;

public class Rectangle extends Shape {
    public int width, height;
    public Rectangle(){

    }

    public Rectangle(Rectangle target){
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Rectangle) || !super.equals(obj)) return false;
        Rectangle shape = (Rectangle) obj;
        return shape.width == width && shape.height == height;
    }
}
