package app;

public class App {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        String data = provider.getData();

        DataHandler handler = new DataHandler();
        getOutput(handler.handleData(data));
        // Подальший код буде виконаний, навіть якщо валідацію не пройдено,
        // оскільки виняток обробляється
        getOutput("Some code.");
    }

    // Виведення результату роботи програми
    private static void getOutput(String output) {
        System.out.println(output);
    }
}