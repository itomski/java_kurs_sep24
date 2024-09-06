package de.lubowiecki.basics.patterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        EagerSingleton es = EagerSingleton.getInstance();
        es.setContent("Dortmund");

        doSometing();

        System.out.println(es.getContent());
    }

    private static void doSometing() {
        System.out.println(EagerSingleton.getInstance().getContent());
        EagerSingleton.getInstance().setContent("Berlin");

        doSometingElse();
    }

    private static void doSometingElse() {
        System.out.println(EagerSingleton.getInstance().getContent());
        EagerSingleton.getInstance().setContent("Hamburg");
    }
}
