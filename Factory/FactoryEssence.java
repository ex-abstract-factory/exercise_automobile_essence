package Factory;

import automobile.Automobile;
import automobile.AutomobileEssence;
import scooter.Scooter;
import scooter.ScooterEssence;

public class FactoryEssence implements AbstractFactory {
    public Automobile ConstructAutomobile(){
        System.out.println("Construction d'une automobile essence");
        return new AutomobileEssence();
    }

    public Scooter ConstructScooter(){
        System.out.println("Construction d'un scooter essence");
        return new ScooterEssence();
    }
}