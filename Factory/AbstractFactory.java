package Factory;
import automobile.Automobile;
import scooter.Scooter;

public interface AbstractFactory {
    public abstract Automobile ConstructAutomobile();

    public abstract Scooter ConstructScooter();
}

