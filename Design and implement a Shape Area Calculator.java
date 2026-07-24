class ShapeAreaCalculator {
    public static void main(String[] args) {

        // Circle
        double radius = 5.0;
        double circleArea = Math.PI * radius * radius;

        // Rectangle
        double length = 4.0;
        double width = 6.0;
        double rectangleArea = length * width;

        // Triangle
        double base = 3.0;
        double height = 8.0;
        double triangleArea = 0.5 * base * height;

        // Output
        System.out.println("----- Shape Area Calculator -----");

        System.out.println("Circle:");
        System.out.println("Radius = " + radius);
        System.out.println("Area of Circle = " + circleArea);

        System.out.println("Rectangle:");
        System.out.println("Length = " + length + ", Width = " + width);
        System.out.println("Area of Rectangle = " + rectangleArea);

        System.out.println("Triangle:");
        System.out.println("Base = " + base + ", Height = " + height);
        System.out.println("Area of Triangle = " + triangleArea);
    }
}
