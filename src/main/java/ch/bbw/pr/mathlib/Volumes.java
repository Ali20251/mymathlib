// Ali Olayan
package ch.bbw.pr.mathlib;

public class Volumes {

    public double cylinder(double radius, double height) {
        if (radius < 0 || height < 0) {
            throw new IllegalArgumentException("radius and height must not be negative");
        }
        return Math.PI * radius * radius * height;
    }

    public double cube(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("side must not be negative");
        }
        return side * side * side;
    }

    public double sphere(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("radius must not be negative");
        }
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
