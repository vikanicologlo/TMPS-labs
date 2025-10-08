

import java.util.Scanner;

public class ConsoleInput implements InputProvider {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}