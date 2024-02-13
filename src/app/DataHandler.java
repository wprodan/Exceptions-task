package app;

public class DataHandler {
    public String handleData(String data) {
        DataValidator validator = new DataValidator();
        // Обробка стандартних винятків IllegalArgumentException, ArithmeticException
        // через кастомний виняток HeightException
        try {
            // Повернення даних при відсутності винятку
            return validator.validateHeight(validator.validateInputData(data));
        } catch (IllegalArgumentException | ArithmeticException e) {
            return new HeightException("Height exception: ", e).getMessage()
                    + e.getMessage();
        }
    }
}
