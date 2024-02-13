package app;

public class HeightException extends RuntimeException {

    // Конструктор має String параметр (повідомлення про виняток)
    // та Throwable параметр (причина винятку),
    // та встановлює їх для суперкласу.
    // Причиною може бути будь-який підклас Throwable.
    public HeightException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
