import Factory.AbstractFactory;
import Factory.FactoryElectrique;
import Factory.FactoryEssence;
import automobile.Automobile;
import scooter.Scooter;


public class Client {
    public static void main(String[] args){
        AbstractFactory FactoryElectrique = new FactoryElectrique();
        AbstractFactory FactoryEssence = new FactoryEssence();

        Automobile automobile = null;
        Scooter scooter = null;

        System.out.println("Utilisation de la premiere Factory");
        automobile = FactoryElectrique.ConstructAutomobile();
        scooter = FactoryEssence.ConstructScooter();
        automobile.methodAutomobile();
        scooter.methodScooter();

        System.out.println("Utilisation de la deuxieme Factory");
        automobile = FactoryEssence.ConstructAutomobile();
        scooter = FactoryElectrique.ConstructScooter();
        automobile.methodAutomobile();
        scooter.methodScooter();
    }
}
