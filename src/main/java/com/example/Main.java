package com.example;

/**
 * gradle-conventions — Custom Gradle plugin for enforcing project conventions and code quality
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("[gradle-conventions] Starting application...");

        try {
            run();
        } catch (Exception e) {
            System.err.println("Fatal error: " + e.getMessage());
            System.exit(1);
        }
    }

    private static void run() {
        System.out.println("Application initialized successfully");
    }
}
