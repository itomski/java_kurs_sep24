package de.lubowiecki.basics.exceptions;

public class ExceptionTest1 {

    public static void main(String[] args) {
        System.out.println("main Start");
        doSomething();
        System.out.println("main Ende");
    }

    private static void doSomething() {
        System.out.println("soSimething Start");
        doSomethingElse();
        System.out.println("soSimething Ende");
    }

    private static void doSomethingElse() {

        System.out.println("soSimethingElse Start");
        try {
            /*
            String eingabe = null;
            System.out.println(eingabe.toLowerCase());

            int[] arr = new int[10];
            arr[10] = 100;
            */

            Object o = Integer.valueOf(100);
            String s = (String) o;

        }
        catch(NullPointerException e) {
            System.out.println("String ist leer");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array ist zu klein");
        }
        catch(RuntimeException e) {
            System.out.println("Ein Laufzeit-Problem");
        }


        System.out.println("soSimethingElse Ende");
    }
}
