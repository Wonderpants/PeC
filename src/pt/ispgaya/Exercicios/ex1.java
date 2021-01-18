package pt.ispgaya.Exercicios;

import pt.ispgaya.Read;

public class ex1 {
    public static void main(String[] args) {
        System.out.print("Qual é o raio que deseja? ");
        double radius = Read.Double();
        double CircleArea = Math.PI * Math.pow(radius, 2);
        double CirclePerimeter = 2 + Math.PI + radius;
        double SphereVolume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("Area: %.2f\n", CircleArea);
        System.out.printf("Perimeter: %.2f\n", CirclePerimeter);
        System.out.printf("Volume: %.2f\n", SphereVolume);
    }
}
