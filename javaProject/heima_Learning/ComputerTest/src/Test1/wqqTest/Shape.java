package Test1.wqqTest;

public class Shape {
    int lineWidth = 1;
    String lineFigure = "实线";
    double length;


}

interface Draw {
    void DrawItem();
}

class Triangle extends Shape implements Draw, Comparable {
    int length1;
    int length2;
    int length3;

    Triangle(int length1, int length2, int length3, int lineWidth, String lineFigure) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
        this.lineWidth = lineWidth;
        this.lineFigure = lineFigure;
        this.length = length1 + length2 + length3;
    }

    Triangle(int length1, int length2, int length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
        this.length = length1 + length2 + length3;
    }

    public void DrawItem() {
        System.out.println("形状：三角形");
        System.out.println("长/宽/高：" + this.length1 + "/" + this.length2 + "/" + this.length3);
        System.out.println("线宽：" + this.lineWidth);
        System.out.println("线形：" + this.lineFigure);
        System.out.println("周长：" + this.length);
        System.out.println();
    }

    @Override
    public int compareTo(Object arg0) {
        // TODO Auto-generated method stub
        Shape S = (Shape) arg0;
        return Double.compare(this.length, S.length);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length1=" + length1 +
                ", length2=" + length2 +
                ", length3=" + length3 +
                '}';
    }
}

class Circle extends Shape implements Draw, Comparable {
    float R;

    Circle(int R) {
        this.R = R;
        this.length = 1 * 3.14 * R;
    }

    Circle(int R, int lineWidth, String lineFigure) {
        this.R = R;
        this.lineWidth = lineWidth;
        this.lineFigure = lineFigure;
        this.length = 1 * 3.14 * R;
    }

    public void DrawItem() {
        System.out.println("形状：圆形");
        System.out.println("半径：" + this.R);
        System.out.println("线宽：" + this.lineWidth);
        System.out.println("线形：" + this.lineFigure);
        System.out.println("周长：" + this.length);
        System.out.println();
    }

    @Override
    public int compareTo(Object arg0) {
        // TODO Auto-generated method stub
        Shape S = (Shape) arg0;
        return Double.compare(this.length, S.length);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "R=" + R +
                '}';
    }
}
