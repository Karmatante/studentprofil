package se.iths.katharina.variablepractice;

public class StudentProfil {
    static void main() {

        System.out.println("------- STUDENTPROFIL -------");
        String name = "Anna";
        int yearOfBirth = 2003;
        int currentYear = 2026;
        int age = currentYear - yearOfBirth;
        double height = 1.68;
        boolean isStudent = true;
        String education = "Javautvecklare";

        double currentWealth = 1589.45;
        double lunchCost = 95.00;
        double coffeeCost = 35.00;
        double totalCost = lunchCost + coffeeCost;
        double newWealth = currentWealth - totalCost;

        boolean isAdult = age >= 18;

        System.out.println("Namn: " + name);
        System.out.println("Ålder: " + age);
        System.out.println("Utbildning: " + education);
        System.out.println("Längd: " + height);
        System.out.println("Student: " + isStudent);

        System.out.println("Pengar före lunch: " + currentWealth + " kr.");
        System.out.println("Lunch: " + lunchCost + " kr.");
        System.out.println("Kaffe: " + coffeeCost + " kr.");
        System.out.println("Totalt köp: " + totalCost + " kr.");
        System.out.println("Pengar kvar: " + newWealth + " kr.");

        System.out.println("Minst 18 år gammal: " + isAdult);

        System.out.println(name + " är " + age + " år och studerar " + education + ".");
    }
}
