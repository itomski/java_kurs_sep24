package de.lubowiecki.basics.patterns.singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private String content;

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
