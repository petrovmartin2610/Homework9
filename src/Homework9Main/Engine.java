package Homework9Main;

/**
 * Класът съдържа getters/setters за задаване ст-ст на Engine Power през main метода
 * @author Martin Petrov
 */

public class Engine extends ProductionEngine{
    private int power;

    public void setMachineEnginePower(int machineEnginePower) {
        this.power = machineEnginePower;
    }

    public int getMachineEnginePower() {
        return power;
    }
}
