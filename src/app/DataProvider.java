package app;

import java.util.Scanner;

public class DataProvider {
    public String getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input height (from 120 to 355, inclusive): ");
        return scanner.nextLine().trim();
    }
}

