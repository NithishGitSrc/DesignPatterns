package creational.singleton.example.thread_safe;

public class Logger {
    /**
     * Private constructor to prevent external instantiation.
     */
    private Logger() {
    }

    /**
     * Volatile static instance for thread safety.
     */
    private volatile static Logger logger;

    /**
     * Returns the singleton Logger instance, using double-checked locking.
     *
     * @return The Logger instance.
     */
    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    /**
     * Logs an informational message with a timestamp.
     *
     * @param msg The message to log.
     */
    void logInfo(String msg) {
        System.out.println("[INFO] " + java.time.LocalDateTime.now() + ": " + msg);
    }

    /**
     * Logs an error message with a timestamp.
     *
     * @param msg The error message to log.
     */
    void logError(String msg) {
        System.err.println("[ERROR] " + java.time.LocalDateTime.now() + ": " + msg);
    }
}