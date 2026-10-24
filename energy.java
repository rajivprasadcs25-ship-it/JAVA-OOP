abstract class EnergyResource {
    int sourceId;
    String sourceName;
    double energyGenerated;

    EnergyResource(int id, String name, double energy) {
        sourceId = id;
        sourceName = name;
        energyGenerated = energy;
    }

    abstract double calculateEfficiency();

    void displayDetails() {
        System.out.println("Source ID: " + sourceId);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kW");
        System.out.println("Efficiency: " + calculateEfficiency() + "%");
        System.out.println("---------------------------");
    }
}

class SolarEnergy extends EnergyResource {

    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    @Override
    double calculateEfficiency() {
        return (energyGenerated / 5000) * 100;
    }
}

class WindEnergy extends EnergyResource {

    WindEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    @Override
    double calculateEfficiency() {
        return (energyGenerated / 8000) * 100;
    }
}

public class energy {
    public static void main(String[] args) {

        // Dynamic method dispatch
        EnergyResource resource;

        resource = new SolarEnergy(101, "Solar Energy", 4000);
        resource.displayDetails();

        resource = new WindEnergy(102, "Wind Energy", 6000);
        resource.displayDetails();
    }
}