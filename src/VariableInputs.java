import java.util.Scanner;

public class VariableInputs {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text:");
        String stringGoesHere = scanner.nextLine();

        System.out.println("Enter an integer:");
        int integerGoesHere = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter a double:");
        double decimalGoesHere = Double.valueOf(scanner.nextLine());

        System.out.println("Enter a boolean value:");
        boolean  valueGoesHere = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is "+ stringGoesHere);
        System.out.println("Your integer is " + integerGoesHere);
        System.out.println("Your double is " + decimalGoesHere);
        System.out.println("Your boolean is " + valueGoesHere);
        scanner.close ();
    }
}