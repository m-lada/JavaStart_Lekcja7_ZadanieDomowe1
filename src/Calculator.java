import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

    private int number;

    final private int upperCompartment = 200;
    final private int lowerCompartment = 100;

    private boolean conditionDone = false;

    private void numberCheck(int number) {
        if (number < lowerCompartment) {
            System.out.println("Podana liczba jest za mała");
        } else if (number > upperCompartment) {
            System.out.println("Podana liczba jest za duża");
        } else if (number % 3 != 0) {
            System.out.println("Podana liczba nie jest podzielna przez 3");
        } else {
            System.out.println("Twoja liczba jest ok");
            conditionDone = true;
        }
    }

    public void calculateNumber() {
        do {
            System.out.println("Podaj liczbę");
            number = scanner.nextInt();
            numberCheck(number);
        }
        while (
                !conditionDone
        );
    }
}