

public abstract class Coffee {
    private final Intensity coffeeIntensity;
    private final String name;

    protected Coffee(Intensity coffeeIntensity, String name) {
        this.coffeeIntensity = coffeeIntensity;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void printCoffeeDetails() {
        System.out.println("Intensity set to " + coffeeIntensity);
    }

    // Полиморфное приготовление — ключ к OCP
    public abstract void brew();
}