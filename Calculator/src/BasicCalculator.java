// Calculator.java (Interface)


// BasicCalculator.java (Class implementing the inte
class BasicCalculator implements Calculator {

 
    public double add(double num1, double num2) {
        return num1 + num2;
    }

 
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

   
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

   
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // NaN (Not a Number) represents an undefined result
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        // Example usage of BasicCalculator
        BasicCalculator calculator = new BasicCalculator();

        double resultAdd = calculator.add(5, 3);
        System.out.println("Addition: " + resultAdd);

        double resultSubtract = calculator.subtract(5, 3);
        System.out.println("Subtraction: " + resultSubtract);

        double resultMultiply = calculator.multiply(5, 3);
        System.out.println("Multiplication: " + resultMultiply);

        double resultDivide = calculator.divide(5, 3);
        System.out.println("Division: " + resultDivide);
    }
}
