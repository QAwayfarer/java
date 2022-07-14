package pack.sandbox;

public class MyFirstProgramm {

    public static void main(String[] args) {
        Hello h = new Hello("Sementiago");
        System.out.println("Hello, " + h.somebody + "!");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " равна = " + s.area());

        Rectangle r = new Rectangle(14.5, 15);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна = " + r.area());
    }

}