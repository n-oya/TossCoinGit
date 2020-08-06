import java.util.Scanner;

public class user_name {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Who are you?");
    String input = scanner.nextLine();
    System.out.println("Hello, "+ input + "!");
    scanner.close();
    
    }
}