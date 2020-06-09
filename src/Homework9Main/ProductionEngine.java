package Homework9Main;

/**
 * Класът съдържа getters/setters за задаване ст-ст на Engine Production през main метода
 * @author Martin Petrov
 */
public class ProductionEngine {
    private int power;

    public void setMachineEngineProduction(int machineEngineProduction) {
        this.power = machineEngineProduction;
    }

    public int getMachineEngineProduction() {
        return power;
    }


}
