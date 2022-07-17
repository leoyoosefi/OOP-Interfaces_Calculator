package se.lexicon;

public class CalTest {

    public static void main(String[] args) {

        Calculator calculator = new CalculatorImp();
        calculator.welcomeMenu();

        System.out.println("Enter number 1: ");
        String num1 = Calculator.takeInput();

        System.out.println("Enter number 2: ");
        String num2 = Calculator.takeInput();

        System.out.println("Enter a valid operation [+,-,*,/  c= exit]");
        String operation = Calculator.takeInput();


        while (true){

            switch (operation){
                case "+":
                    int additionResult = calculator.addition(Integer.parseInt(num1),Integer.parseInt(num2));
                    System.out.println("Result: " + additionResult);
                    break;

                case "-":
                    int subtractionResult = calculator.subtraction(Integer.parseInt(num1),Integer.parseInt(num2));
                    System.out.println("Result: " + subtractionResult);
                    break;

                case "*":
                    int multiplicationResult = calculator.multiplication(Integer.parseInt(num1),Integer.parseInt(num2));
                    System.out.println("Result: " + multiplicationResult);
                    break;
                case "/":
                    int divisionResult = calculator.division(Integer.parseInt(num1),Integer.parseInt(num2));
                    System.out.println("Result: " + divisionResult);
                    break;

                case "c":
                    System.exit(0);

                default:
                    System.out.println("operation not valid");
            }
            System.out.println("****DONE****");
        }
    }
}
