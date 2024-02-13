package app;

public class DataValidator {
    private static final int HEIGHT_LOWER_LIMIT = 120;
    private static final int HEIGHT_UPPER_LIMIT = 355;
    public static final String INPUT_REGEX = "^\\d+$";

    public String validateInputData(String input) throws IllegalArgumentException {
        if (!input.matches(INPUT_REGEX))
            throw new IllegalArgumentException(input + " is wrong data!");
        return input;
    }

    public String validateHeight(String height) throws ArithmeticException {
        // Умова валідації: кількість має бути у певному діапазоні
        if (Integer.parseInt(height) > HEIGHT_LOWER_LIMIT
                & Integer.parseInt(height) <= HEIGHT_UPPER_LIMIT) {
            return "Height " + height + " is OK.";
        } else {
            // Викидання стандартного винятку через throw
            throw new ArithmeticException("Height " + height +
                    " is wrong!");
        }
    }
}
