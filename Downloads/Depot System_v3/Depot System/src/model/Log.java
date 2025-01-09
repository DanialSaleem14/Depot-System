package model;

/**
 *
 * @author dania
 */
public class Log {
    private static Log instance;
    private StringBuffer logBuffer;

    private Log() {
        logBuffer = new StringBuffer();
    }

    public static Log getInstance() {
        if (instance == null) {
            instance = new Log();
        }
        return instance;
    }

    public void logEvent(String event) {
        logBuffer.append(event).append("\n");
    }

    public String getLog() {
        return logBuffer.toString();
    }
}
