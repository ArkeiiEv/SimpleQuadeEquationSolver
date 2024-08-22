import java.util.Scanner;
class SimpleQuadEquationsSolver {
    public static double[] inputCoefficients() {
        Scanner scanner = new Scanner(System.in);
        double[] coefficients = new double[3];
        System.out.print("Введите коэффициент a: ");
        coefficients[0] = scanner.nextDouble();
        System.out.print("Введите коэффициент b: ");
        coefficients[1] = scanner.nextDouble();
        System.out.print("Введите коэффициент c: ");
        coefficients[2] = scanner.nextDouble();

        return coefficients;
    }
    public static double[] solveQuadraticEquation(double a, double b, double c) {

        double discriminant = Math.pow(b, 2) - (4 * a * c);
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{x1, x2};
        }
        else if (discriminant == 0) {
            double x = -b / (2 * a);
            return new double[]{x};
        }
        else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        double[] coefficients = inputCoefficients();
        double[] roots = solveQuadraticEquation(coefficients[0], coefficients[1], coefficients[2]);
        if (roots.length == 0) {
            System.out.println("Нет действительных корней.");
        }
        else if (roots.length == 1) {
            System.out.printf("Дискриминант равен 0. Имеется один действительный корень x = %.2f ", roots[0]);
        }
        else {
            System.out.printf("Дискриминант положительный. Имеются два действительных корня: x1 = %.2f, x2 = %.2f", roots[0], roots[1]);

        }

    }

}

