import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz swoje miasto: ");
        String city = scanner.nextLine();
        System.out.print("Wpisz swój wiek: ");
            int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Czy jesteś rezydentem Warszawy? (tak/nie): ");
            boolean fromWarsaw = scanner.nextLine().equalsIgnoreCase("tak");
        System.out.print("Czy jest czwartek? (tak/nie): ");
            boolean isThursday = scanner.nextLine().equalsIgnoreCase("yes");
            double CenaBiletu = obliczCenaBiletu(city, age, fromWarsaw, isThursday);
            double discount = calculateDiscount(city, age, fromWarsaw, isThursday);
        System.out.println("\nData: " + city + ", " + age + " wiek, " + (isThursday ? "Czwartek" : "dzien tygodnia"));
        System.out.println("cena biletu: " + CenaBiletu + " PLN");
        System.out.println("Znizka: " + discount + "%");
    }



    public static double obliczCenaBiletu(String city, int age, boolean fromWarsaw, boolean isThursday) {
        double basePrice = 40;
        double cenaBiletu;
            if (age < 10)
            {
            cenaBiletu = 0;
        } else if (age <= 18)
        {
            cenaBiletu = basePrice / 2;
        } else
        {
            cenaBiletu = basePrice;
        }
            if (fromWarsaw)
            {
            cenaBiletu *= 0.9;
        }
            if (isThursday)
        {
            cenaBiletu = 0;
        }
        return cenaBiletu;
    }
    public static double calculateDiscount(String city, int age, boolean fromWarsaw, boolean isThursday) {
        double discount = 0;
            if (age <= 18) {
            discount += 50;
        }
            if (fromWarsaw) {
            discount += 10;
        }
            if (isThursday) {
            discount = 100;
        }
            return discount;
    }
}
