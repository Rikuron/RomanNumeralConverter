import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nHello and welcome to my Roman Numeral Converter!");
        System.out.println("This program allows the user to input a roman numeral and convert it into its respective integer value.\n");

        while (true) {
            System.out.print("Please enter a roman numeral: ");
            String roman = scanner.nextLine();
            System.out.println();

            romanToInt(roman); // Calling the romanToInt converter method

            System.out.print("Converting...\n");

            System.out.println("The integer value of the roman numeral " + roman + " is " + romanToInt(roman) + "\n");

            System.out.println("Would you like to convert another roman numeral?");
            System.out.println("----------------------------------------------");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            scanner.nextLine();

            if (choice == 2) {
                System.out.println("Thank you for using my program. Goodbye!");
                break;
            }
        }
    }

    public static int romanToInt(String roman) {
        int result = 0;
        int prev_value = 0;

        // Create ArrayList to contain each roman numeral
        ArrayList<Character> roman_character_list = new ArrayList<>();

        // Populate ArrayList with each roman numeral
        for (int i = 0; i < roman.length(); i++) {
            roman_character_list.add(roman.charAt(i));
        }

        // Assigning values to each roman numeral
        Map <Character, Integer> roman_character_values = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        // Start reading from the first roman numeral from the right
        for (int i = roman_character_list.size(); i > 0; i--) {
            int value = roman_character_values.get(roman_character_list.get(i - 1));

            if (value < prev_value) {
                result -= value;
            } else {
                result += value;
            }
            prev_value = value; // Set the previous value to the current value
        }

        return result;
    }
}