package pack.sandbox;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class MyFirstProgramm {

    public static void main(String[] args) {
        hello("world");
        hello("Sementiago");

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " равна = " + area(l));

        double a = 2;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна = " + area(a,b));
    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double l) {
        return l * l;
    }

    public static double area(double a, double b) {
        return a * b;
    }

}