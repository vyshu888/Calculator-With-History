```
import java.util.*;

public class CalculatorWithHistory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n---- Command Line Calculator ----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. View History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if(choice >=1 && choice <=4) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();
                double result = 0;
                String record = "";

                switch(choice) {
                    case 1:
                        result = a + b;
                        record = a + " + " + b + " = " + result;
                        break;
                    case 2:
                        result = a - b;
                        record = a + " - " + b + " = " + result;
                        break;
                    case 3:
                        result = a * b;
                        record = a + " * " + b + " = " + result;
                        break;
                    case 4:
                        if(b != 0) {
                            result = a / b;
                            record = a + " / " + b + " = " + result;
                        } else {
                            System.out.println("Error: Division by zero!");
                            continue;
                        }
                        break;
                }

                System.out.println("Result: " + result);
                history.add(record);
            }
            else if(choice == 5) {
                System.out.println("\n--- Calculation History ---");
                for(String h : history) {
                    System.out.println(h);
                }
            }

        } while(choice != 6);

        System.out.println("Program Ended.");
        sc.close();
    }
}
```
## Output
![Output](command-line calculator with history.output.png)

