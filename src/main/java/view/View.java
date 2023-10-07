package view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void addNumbers(ArrayList<Integer> list) {

        try {
            displayMessage("Enter the number of numbers in the list: ");
            int count = scanner.nextInt();
            displayMessage("Input numbers for list :");
            for (int i = 0; i < count; i++) {
                list.add(scanner.nextInt());

            }
        } catch (InputMismatchException e) {
            System.out.println("This is not number");
        }
    }
}
