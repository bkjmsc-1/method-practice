import java.util.Scanner;

public class Methods3 {
    Scanner sc = new Scanner(System.in);

    public void calcArea(int b, int h){
        double area = b * h * .5;
        System.out.println("The area of a triangle is base * height * .5");
        System.out.println("In this method, you have passed " + b + " as your base and " + h + " as your height.");
        System.out.println("The area of the triangle is " + area);
    }

    public void calcArea(int r){
        double PI = 3.14;
        double area = PI * Math.pow(r, 2);
        System.out.println("The area of a circle is pie * radius squared.");
        System.out.println("In this method, you have passed " + r + " as your radius.");
        System.out.println("The area of the circle is " + area);
    }

    public static void main(String[] args){
        Methods3 methods3Object = new Methods3();
        methods3Object.calcArea(3, 5);
        methods3Object.calcArea(3);
    }
}
