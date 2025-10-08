

public class Cappuccino extends Coffee {
    private final int mlOfMilk;

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity, "Cappuccino");
        this.mlOfMilk = mlOfMilk;
    }

    protected int getMlOfMilk() {
        return mlOfMilk;
    }

    @Override
    public void brew() {
        System.out.println("\nMaking " + getName() + "...");
        printCoffeeDetails();
        System.out.println("Adding " + getMlOfMilk() + " ml of milk");
    }
}