public class ConsoleUI {
    private final InputProvider in;

    public ConsoleUI(InputProvider in) {
        this.in = in;
    }

    public Coffee askCoffee() {
        while (true) {
            System.out.println("\nWhat would you like to drink?");
            System.out.println("1. Americano");
            System.out.println("2. Cappuccino");
            System.out.println("3. Syrup Cappuccino");
            System.out.println("4. Pumpkin Spice Latte");
            System.out.print("Enter the number of coffee or 0 to finish: ");
            int choice = in.readInt();

            if (choice == 0) {
                return null;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Wrong choice.");
                continue;
            }

            System.out.print("Intensity (0: LIGHT, 1: NORMAL, 2: STRONG): ");
            int idx = in.readInt();
            if (idx < 0 || idx >= Intensity.values().length) {
                System.out.println("Wrong intensity. Default NORMAL selected.");
                idx = 1;
            }
            Intensity intensity = Intensity.values()[idx];

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ml of water: ");
                    int water = in.readInt();
                    return new Americano(intensity, water);
                }
                case 2 -> {
                    System.out.print("Enter ml of milk: ");
                    int milk = in.readInt();
                    return new Cappuccino(intensity, milk);
                }
                case 3 -> {
                    System.out.print("Enter ml of milk: ");
                    int milk = in.readInt();
                    System.out.print("Syrup (0: MACADAMIA, 1: VANILLA, 2: COCONUT, 3: CARAMEL, 4: CHOCOLATE, 5: POPCORN): ");
                    int s = in.readInt();
                    if (s < 0 || s >= SyrupType.values().length) {
                        System.out.println("Wrong syrup. Default VANILLA selected.");
                        s = 1;
                    }
                    SyrupType syrup = SyrupType.values()[s];
                    return new SyrupCappuccino(intensity, milk, syrup);
                }
                case 4 -> {
                    System.out.print("Enter ml of milk: ");
                    int milk = in.readInt();
                    System.out.print("Enter mg of pumpkin spice: ");
                    int spice = in.readInt();
                    return new PumpkinSpiceLatte(intensity, milk, spice);
                }
            }
        }
    }
}