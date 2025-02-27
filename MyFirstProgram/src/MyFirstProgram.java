import java.security.SecureRandom;
import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] funFacts = {
            "Java was originally called Oak.",
            "Why did the two Java methods get a divorce?\nBecause they had constant arguments.",
            "The name 'Java' comes from Indonesian coffee.",
            "Why do Java developers wear glasses?\nBecause they can't see sharp (C#).",
            "Why did the private classes break up?\nBecause they never saw each other.",
            "Why do programmers confuse Christmas with Halloween?\nBecause OCT 31 is the same as DEC 25.",
            "Minecraft was originally developed in Java.",
            "Why did the Java developer teach his kids about single quotes?\nBecause they build character.",
            "How many Java programmers does it take to change a light bulb?\nNone. It's a hardware problem.",
            "Why was the JavaScript developer sad?\nBecause he didn't know how to 'null' his feelings."
        };
        
        SecureRandom random = new SecureRandom();
        String funFact = funFacts[random.nextInt(funFacts.length)];
        System.out.println("=".repeat(70));
        System.out.println("\u001B[38;2;255;190;11mHello, welcome to My First Java Program!\u001B[0m");
        System.out.print("\u001B[38;2;251;86;7mEnter your name: \u001B[0m");
        String name = scanner.nextLine();
        System.out.println("=".repeat(70));
        System.out.println("\u001B[38;2;255;0;110mHello, " + name + "! Nice to meet you.\u001B[0m");
        
        System.out.println("\u001B[38;2;131;56;236m" + funFact + "\u001B[0m");
        System.out.println("\u001B[38;2;58;134;255mYour Java version: " + System.getProperty("java.version") + "\u001B[0m");
        System.out.println("=".repeat(70));
        
        scanner.close();
    }
}