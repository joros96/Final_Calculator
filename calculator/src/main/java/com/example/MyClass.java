package com.example;
import java.util.Scanner;


public class square {
    private double b = 0;
    private double h = 0;

    private void squarearea(double b, double h) {
        double area = 0;
        area = b * h;
        System.out.println("The area of a square with the dimensions of " + b + " by " + h + " is equal to " + area);
    }

    private void setB(double base) {
        b = base;
    }

    private void setH(double width) {
        h = width;
    }

    private double getB() {
        return b;
    }

    private double getH() {
        return h;
    }

    public static void main(String[] args) {
        menuOne();

    }

}
    // Starting menu, called in main
    private static void menuOne() {
        int choice = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please choose an option:");
        System.out.println("1) Area");
        System.out.println("2) Volume");
        System.out.println("3) Pythagorean Theorem");
        System.out.println("4) Quadratic Formula");
        System.out.println("5) Simple linear Equation (y=mx+b)");
        choice = in.nextInt();

        while (choice > 5 || choice < 1) {
            System.out.println("That is not a valid option, please choose a valid option");
            choice = in.nextInt();
        }

        switch (choice) {
            case 1:
                areamenu();
                break;
            case 2:
                volumemenu();
                break;
            case 3:
                pythagorean();
                break;
            case 4:
                quadratic();
                break;
            case 5:
                linear();
                break;
        }
    }

    // menu for area, called in menuOne
    private static void areamenu() {
        int areaChoice = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please choose a shape to calculate the area of");
        System.out.println("1) Square");
        System.out.println("2) Circle");
        System.out.println("3) Trapezoid");
        System.out.println("4) Triangle");
        areaChoice = in.nextInt();

        while (areaChoice > 4 || areaChoice < 1) {
            System.out.println("Error, invalid option. Please choose a valid option");
            areaChoice = in.nextInt();
        }

        switch (areaChoice) {
            case 1:
                squares();
                break;
            case 2:
                circles();
                break;
            case 3:
                trapezoids();
                break;
            case 4:
                triangles();
                break;
        }
    }

    // function called in areamenu to get information and send it to class Square
    private static void squares() {
        Scanner in = new Scanner(System.in);
        square Square = new square();
        double b = 0;
        double h = 0;
        System.out.println("Please enter the base length of the square: ");
        b = in.nextDouble();
        Square.setB(b);
        System.out.println("Please enter the height length of the square: ");
        h = in.nextDouble();
        Square.setH(h);
        Square.squarearea(Square.getB(),Square.getH());
    }

    // function called in areamenu to get information and calculate the area of a circle
    private static void circles() {
        double radius = 0;
        double area = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");
        radius = in.nextDouble();
        area = (3.14159)*(radius*radius);
        System.out.println("The area of a circle with a radius of " + radius + " is equal to " + area);
    }

    // function called in areamenu to get information and calculate the area of a trapezoid
    private static void trapezoids() {
        double base = 0;
        double top = 0;
        double height = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the base length of the trapezoid: ");
        base = in.nextDouble();
        System.out.println("Please enter the top length of the trapezoid: ");
        top = in.nextDouble();
        System.out.println("Please enter the height length of the trapezoid: ");
        height = in.nextDouble();

        double area = 0;
        area = ((base+top)/2)*height;
        System.out.println("The area for the trapezoid specified is equal to " + area);
    }

    // function called in areamenu to get information and calculate the area of a triangle
    private static void triangles() {
        Scanner in = new Scanner(System.in);
        double base = 0;
        double height = 0;
        double area = 0;
        System.out.println("Please enter the base length of the triangle: ");
        base = in.nextDouble();
        System.out.println("Please enter the height length of the triangle: ");
        height = in.nextDouble();
        area = .5*base*height;
        System.out.println("The area of the triangle specified is " + area);
    }

    // menu for volumes, called in menuOne
    private static void volumemenu() {
        Scanner in = new Scanner(System.in);
        int volumechoice = 0;
        System.out.println("Please choose a shape to calculate the volume of");
        System.out.println("1) Cylinder");
        System.out.println("2) Box");
        System.out.println("3) Sphere");
        System.out.println("4) Pyramid");
        volumechoice = in.nextInt();

        while (volumechoice > 4 || volumechoice < 1) {
            System.out.println("Error, invalid option. Please choose a valid option");
            volumechoice = in.nextInt();
        }
        switch(volumechoice) {
            case 1:
                cylinders();
                break;
            case 2:
                boxes();
                break;
            case 3:
                spheres();
                break;
            case 4:
                pyramids();
                break;
        }
    }

    // function called in volumemenu to get information and calculate the volume of a cylinder
    private static void cylinders() {
        Scanner in = new Scanner(System.in);
        double radius = 0;
        double height = 0;
        double volume = 0;
        System.out.println("Please enter the radius of the cylinder: ");
        radius = in.nextDouble();
        System.out.println("Please enter the height of the cylinder: ");
        height = in.nextDouble();
        volume = (3.14159)*radius*radius*height;
        System.out.println("The volume of the specified cylinder is " + volume);
    }

    // function called in volumemenu to get information and calculate the volume of a box
    private static void boxes() {
        Scanner in = new Scanner(System.in);
        double base = 0;
        double height = 0;
        double depth = 0;
        double volume = 0;
        System.out.println("Please enter the base length of the box: ");
        base = in.nextDouble();
        System.out.println("Please enter the height length of the box: ");
        height = in.nextDouble();
        System.out.println("Please enter the depth of the box: ");
        depth = in.nextDouble();
        volume = base*height*depth;
        System.out.println("The volume of the specified box is equal to " + volume);

    }

    // function called in volumemenu to get information and calculate the volume of a shpere
    private static void spheres() {
        Scanner in = new Scanner(System.in);
        double radius = 0;
        double volume = 0;
        System.out.println("Please enter the radius of the sphere: ");
        radius = in.nextDouble();
        volume = (4/3)*(3.14159)*(radius*radius*radius);
        System.out.println("The volume of the specified sphere is equal to " + volume);
    }

    // function called in volumemenu to get information and calculate the volume of a pyramid
    private static void pyramids() {
        Scanner in = new Scanner(System.in);
        double base = 0;
        double height = 0;
        double depth = 0;
        double volume = 0;
        System.out.println("Please enter the base length of the pyramid: ");
        base = in.nextDouble();
        System.out.println("Please enter the height of the pyramid: ");
        height = in.nextDouble();
        System.out.println("Please enter the depth of the pyramid: ");
        depth = in.nextDouble();
        volume = (base*height*depth)/3;
        System.out.println("The volume of the specified pyramid is equal to " + volume);
    }

    // function called in volumemenu to get information and calculate the length of the missing sides of a right triangle
    private static void pythagorean() {
        Scanner in = new Scanner(System.in);
        int unknown = 0;
        double sideone = 0;
        double sidetwo = 0;
        double hypotenuse = 0;
        System.out.println("Please choose one of the following");
        System.out.println("1) Unknown hypotenuse");
        System.out.println("2) Unknown side (not hypotenuse)");
        unknown = in.nextInt();
        while (unknown>2 || unknown<1) {
            System.out.println("Error, not a valid option. Please choose a valid option");
            unknown = in.nextInt();
        }
        if (unknown == 1) {
            System.out.println("Please enter the length of side one: ");
            sideone = in.nextDouble();
            System.out.println("Please enter the length of side two: ");
            sidetwo = in.nextDouble();
            hypotenuse = Math.sqrt(sideone*sideone+sidetwo*sidetwo);
            System.out.println("The length of the uknown hypotenuse of the triangle specified is equal to " + hypotenuse);
        }
        else {
            System.out.println("Please enter the length of the hypotenuse: ");
            hypotenuse = in.nextDouble();
            System.out.println("Please enter the length of the known side: ");
            sideone = in.nextDouble();
            sidetwo = Math.sqrt(hypotenuse*hypotenuse-sideone*sideone);
            System.out.println("The length of the unknown side of the triangle specified is equal to " + sidetwo);
        }
    }

    // function called in volumemenu to get information and calculates the values of x in a quadratic equation
    private static void quadratic() {
        Scanner in = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double posvalue = 0;
        double posvaluetwo = 0;

        System.out.println("Please enter the values for the variables in the equation in the following form");
        System.out.println(" ax^2 + b + c = 0");
        System.out.println("Please enter the value for a");
        a = in.nextDouble();
        System.out.println("Please enter the value for b");
        b = in.nextDouble();
        System.out.println("Please enter the value for c");
        c = in.nextDouble();

        posvalue = (-b) + Math.sqrt(((b*b)-(4*a*c))/(2*a));
        posvaluetwo = (-b) - Math.sqrt(((b*b)-(4*a*c))/(2*a));

        System.out.println("The values for x in the specified equation are equal to " + posvalue + " and " + posvaluetwo);
    }

    private static void linear() {
        Scanner in = new Scanner(System.in);
        double m = 0;
        double b = 0;
        double c = 0;
        double x = 0;
        System.out.println("Use the form of the following equation to enter the values needed to calculate x");
        System.out.println(" mx + b = c");

        System.out.println("Please enter a value for m: ");
        m = in.nextDouble();
        System.out.println("Please enter a value for b: ");
        b = in.nextDouble();
        System.out.println("Please enter a value for c: ");
        c = in.nextDouble();

        x = (c-b)/m;
        System.out.println("The value for x for the specified linear equation is equal to " + x);
    }


}
