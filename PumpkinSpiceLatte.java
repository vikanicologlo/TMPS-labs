

public class PumpkinSpiceLatte extends Cappuccino {
    private final int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(intensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    @Override
    public String getName() {
        return "Pumpkin Spice Latte";
    }

    @Override
    public void brew() {
        System.out.println("\nMaking " + getName() + "...");
        printCoffeeDetails();
        System.out.println("Adding " + getMlOfMilk() + " ml of milk");
        System.out.println("Adding " + mgOfPumpkinSpice + " mg of pumpkin spice");
    }
}