import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the city of residence:");
        String city = scanner.nextLine();
        System.out.println("Enter the age:");
        int age = scanner.nextInt();
        System.out.println("Is it a Thursday? (true/false)");
        boolean isThursday = scanner.nextBoolean();
        double ticketPrice = 40.0; // Base ticket price
        if (age < 10) {
            ticketPrice = 0.0; // Admission is free for children under 10
        } else if (age >= 10 && age <= 18) {
            ticketPrice *= 0.5; // 50% discount for ages between 10 and 18
        }
        if (city.equalsIgnoreCase("Warsaw")) {
            ticketPrice *= 0.9; // Additional 10% discount for Warsaw residents
        }
        if (isThursday) {
            ticketPrice = 0.0; // Admission is free on Thursdays
        }
        double discount = 100 - (ticketPrice / 40 * 100); // Calculate discount percentage
        System.out.println("Data: " + city + ", " + age + " years old, " + (isThursday ? "weekday" : "weekend"));
        System.out.println("Ticket price: " + ticketPrice + " PLN, Discount: " + discount + "%");
        scanner.close();
    }
}