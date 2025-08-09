package Singleton;

public enum Logger {
    INSTANCE;

    public static Logger getInstance() {
        return INSTANCE;
    }

    // Alias en español para compatibilidad con el código solicitado
    public static Logger getInstancia() {
        return INSTANCE;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
