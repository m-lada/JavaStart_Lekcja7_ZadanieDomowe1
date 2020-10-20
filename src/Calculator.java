import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

    final private int upperCompartment = 200;
    final private int lowerCompartment = 100;

    private boolean numberCheck(int number) {
        if (number < lowerCompartment) {
            System.out.println("Podana liczba jest za mała");
        } else if (number > upperCompartment) {
            System.out.println("Podana liczba jest za duża");
        } else if (number % 3 != 0) {
            System.out.println("Podana liczba nie jest podzielna przez 3");
        } else {
            System.out.println("Twoja liczba jest ok");
            return true;
        }
        return false;
    }

    public void calculateNumber() {
        boolean conditionDone;
        do {
            System.out.println("Podaj liczbę");
            int number = scanner.nextInt();
            conditionDone = numberCheck(number);
        }
        while (
                !conditionDone
        );
    }
}