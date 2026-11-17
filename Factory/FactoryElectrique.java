package Factory;

import automobile.Automobile;
import automobile.AutomobileElectrique;
import scooter.Scooter;
import scooter.ScooterElectrique;

public class FactoryElectrique implements AbstractFactory {
    public Automobile ConstructAutomobile(){
        System.out.println("Construction d'une automobile electrique");
        return new AutomobileElectrique();
    }

    public Scooter ConstructScooter(){
        System.out.println("Construction d'un scooter electrique");
        return new ScooterElectrique();
    }
}
