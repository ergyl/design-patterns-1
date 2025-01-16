package se.yrgo.singleton;

/**
 * Lazily initialized version of RootUser
 */
public class LazyRootUser {
    private final int UID = 0;
    private final int GID = 0;
    private final String userName = "root";
    private final String name = "Super user";
    private final String home = "/root";
    private final String shell = "/bin/sh";

    private static LazyRootUser instance;

    /**
     * Default private constructor to prevent instantiation.
     */
    private LazyRootUser() {
    }

    public static LazyRootUser getInstance() {
        if (instance == null) {
            instance = new LazyRootUser();
        }
        return instance;
    }

    @Override
    public String toString() {
        return new StringBuilder(userName)
                .append("(").append(name).append(")")
                .append(" ").append(UID).append(":").append(GID)
                .append(" home: ").append(home).append(" ")
                .append("shell: ").append(shell)
                .toString();
    }
}