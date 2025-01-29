package com.example;
 
public class Singleton {

    // Private constructor prevents instantiation from other classes
    private Singleton() {}

    // Inner static class responsible for holding the Singleton instance
    private static class SingletonHelper {
        // The instance of Singleton is created only when this class is loaded
        private static final Singleton INSTANCE = new Singleton();
    }

    // Public method to provide access to the Singleton instance
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // Example method to show the usage of the Singleton instance
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    // Main method for testing
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}