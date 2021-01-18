package pt.ispgaya.Projeto_2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 1, 4, 5);
        rectangle.base();
        rectangle.height();
        rectangle.perimeter();
        rectangle.area();
    }
}

class Rectangle {
    private final double x1, x2;
    private final double y1, y2;

    public Rectangle() {
        this.x1 = this.x2 = 0;
        this.y1 = this.y2 = 0;
    }

    public Rectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void base() {
        System.out.println(x2 - x1);
    }

    public void height() {
        System.out.println(y2 - y1);
    }

    public void perimeter() {
        System.out.println((x2 - x1) * 2 + (y2 - y1) * 2 + "cm^2");
    }

    public void area() {
        System.out.println((x2 - x1) * (y2 - y1) + "cm^3");
    }
}
