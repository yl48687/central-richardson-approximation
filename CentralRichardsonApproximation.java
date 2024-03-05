import java.lang.Math;

/**
 * Accepts command line arguments to approximate f'(x)
 * for inputs x and h. Expects the first argument to be the
 * value of x and the second argument to be the value of h.
 * Using the given inputs, f'(x) is calculated and printed
 * as central difference approximation, Richardson extrapolation
 * approximation, and exact value.
 */
public class HW01 {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]); // Command-line input
        double h = Double.parseDouble(args[1]); // Command-line input
        System.out.println("Let h = " + h);

        // Central difference approximation of f'(x)
        double centralDifference = (Math.tan(x + h) - Math.tan(x - h)) / (2 * h);
        System.out.print("Central difference approximation of f'(" + x + ")");
        System.out.println("\t\t= " + centralDifference);

        // Richardson extrapolation approximation of f'(x)
        double h2 = h / 2;
        double richardsonP1 = (Math.tan(x + h2) - Math.tan(x - h2)) / (2 * h2);
        double richardsonP2 = (richardsonP1 - centralDifference) / 3;
        double richardsonF = richardsonP1 + richardsonP2;
        System.out.print("Richardson extrapolation approximation of f'(" + x + ")");
        System.out.println("\t= " + richardsonF);

        // Exact value of f'(x)
        double exactValue = Math.pow((1 / Math.cos(x)), 2);
        System.out.print("Exact value of f'(" + x + ")");
        System.out.println("  \t\t\t\t= " + exactValue);

    } // main

} // HW01
