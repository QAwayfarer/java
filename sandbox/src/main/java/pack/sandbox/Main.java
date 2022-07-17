package pack.sandbox;

public class Main {

    public static void main(String[] args) {
        Hello h = new Hello("Sementiago");
        System.out.println("Hello, " + h.somebody + "!");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " равна = " + s.area());

        Rectangle r = new Rectangle(14.5, 15);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна = " + r.area());

        Point p1 = new Point(5, 15);
        Point p2 = new Point(4, 2);
        System.out.println("Координаты точки 1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("Координаты точки 2: (" + p2.x + ", " + p2.y + ")");

        Distance d= new Distance(p1,p2);
        System.out.println("Расстояние между точками:"+d.distance());
    }



}