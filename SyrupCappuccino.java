

public class SyrupCappuccino extends Cappuccino {
    private final SyrupType syrup;

    public SyrupCappuccino(Intensity intensity, int mlMilk, SyrupType syrup) {
        super(intensity, mlMilk);
        this.syrup = syrup;
    }

    @Override
    public String getName() {
        return "Syrup Cappuccino";
    }

    @Override
    public void brew() {
        System.out.println("\nMaking " + getName() + "...");
        // базовые детали
        printCoffeeDetails();
        System.out.println("Adding " + getMlOfMilk() + " ml of milk");
        System.out.println("Adding syrup: " + syrup);
    }
}